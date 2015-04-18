package org._2kchakka.amqp;

import org._2kchakka.amqp.util.PublisherUtil;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

/**
 * Publisher class responsible for sending message to a queue
 *
 */
public class Publisher {

  private final static String QUEUE_NAME = "hello";

  public static void main(String[] args)
      throws java.io.IOException {
      
	  // Creating connection to RabbitMQ server
	  ConnectionFactory factory = new ConnectionFactory();
	  factory.setHost(PublisherUtil.readFromResource("rabbit.server.host"));
	  Connection connection = factory.newConnection();
	  
	  // Creating channel - most of the API are here
	  Channel channel = connection.createChannel();
	  
	  // Declaring a queue - idempotent, i.e. created iff not already created
	  channel.queueDeclare(QUEUE_NAME, false, false, false, null);
      String message = "Hello World!";
	  
	  // Publishing a message
      channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
      System.out.println(" [x] Sent '" + message + "'");
	  
	  // Closing channel & connection
	  channel.close();
	  connection.close();
  }
}
