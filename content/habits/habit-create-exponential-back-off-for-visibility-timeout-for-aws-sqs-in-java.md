---
tags:
  - aws
created_on: 2025-06-06
deck: Zettelkasten
modified_on: 2025-06-11 19:24:15
---

# Habit - Create exponential back off for visibility timeout for AWS SQS

Imagine the following process:

1. Listener pulls off the message from the queue.
  - When a message is read from the queue, it becomes invisible so other services reading from the queue cannot see it. It is not deleted.
2. Listener attempts to process it.
3. If Listener is successful, delete message off the queue
  - Deleting messages must be done manually from our side. We must request for it to be deleted.
4. If Listener fails, attempt to read again when the message becomes visible.
5. If Listener fails a certain amount of times, AWS sends the message to the dead letter queue (DLQ).

We can create an exponential back off for the visibility timeout in the 4th step above when the listener fails to process the message.

## [[cue-in-terms-of-habits|Cues]]

## [[response-in-terms-of-habits|Responses]]

1. Get the value of how many times a message has been read. This is represented as [ApproximateReceiveCount](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ReceiveMessage.html#API_ReceiveMessage_RequestSyntax).
  - `int receiveCount = Integer.parseInt(message.attributes().get(MessageSystemAttributeName.APPROXIMATE_RECEIVE_COUNT));`
2. Create our own exponential back off algorithm.
3. Create a request to change the message visibility.
  - https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ChangeMessageVisibility.html

You can see this in the [[#Concrete example in Java]], with the `changeVisibilityTimeout(Message message)` method.

### Concrete example in Java

```java
class SqsService {
  // Fields, getters, and getters
  ...

  @Scheduled(fixedRateString = "${sqs.poll.rate}")
  public void pollQueue() {
      ReceiveMessageRequest ReceiveMessageRequest = ReceiveMessageRequest
          .builder()
          ...
          .MessageSystemAttributeNames(MessageSystemAttributeName.APPROXIMATE_RECEIVE_COUNT)
          .build();

      List<Message> messages = sqs.receiveMessage(receiveMessageRequest).messages();
    
      if (messages != null && !messages.isEmpty()) {
          log.info("Received {} messages", messages.size());

          for (Message message : messages) {
              changeVisibilityTimeout(message);
              processMessage(message);
          }
      }
  }

  private void processMessage() {
      try {
          // Attempt to process message
          ...
      } catch (JsonProcessingException e) {
          log.error("Unable to process message" + e.getMessage())
      }
  }

  private void changeVisibilityTimeout(Message message) {
      int receiveCount = Integer.parseInt(message.attributes().get(MessageSystemAttributeName.APPROXIMATE_RECEIVE_COUNT));
      int jitter = new Random().nextInt(60);

      // Calculate the exponential backoff. This can be placed into a utility class.
      int newTimeout = (int) (Math.pow(2, receiveCount) + 30 + jitter); // Add jitter to new random visibility timeout.

      sqs.changeMessageVisibility(
        ChangeMessageVisibilityRequest.builder()
            .visibilityTimeout(newTimeout)
            .receiptHandle(message.receiptHandle())
            .queueUrl(awsConfig.getInputQueueURL())
            .build()
      );
  }
}
```

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [Blog](https://www.sohaibtariq.com/exponential-backoff/)
- [AWS SQS ReceiveMessage](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ReceiveMessage.html)
- [AWS SQS ChangeMessageVisibility](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ChangeMessageVisibility.html)

## Flashcards

```anki
id: 1749457876908
deck: Zettelkasten
---
With the _habit of creating exponential back off for visibility timeout for AWS SQS_, what is the **response**?
===
1. Get the value of how many times a message has been read. This is represented as the `ApproximateReceiveCount`.
2. Create our own exponential back off algorithm.
3. Create a request to change the message visibility.
```

