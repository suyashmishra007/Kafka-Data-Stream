package com.springboot.kafkadatastream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDataStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDataStreamApplication.class, args);
	}

}

/*
Kakfa cluster
-> Since kafka is a distributed system, it act as a cluster.
-> A kafka cluster consists of a set of brokers. A cluster has a minimum of 3 brokers.

Kafka broker
The broker is the kafka server.it just a meaningful name given to the kafka server. And this name makes sense as well because all that kafka does it act as a message broker between producer and consumer
The producer and consumer dont interact directly. They use kafka server as an agent or a broker to exchange messages.

Producer:
It is an application that send messages. It does not send messages directly to the reciepinet. It send messages only to the kafka server.


Consumer :
It is an application that reads messages from the kafka server.

If producers are sending data, they must be sending it to someone right? the consumer are the recipents. But remember that the producers dont send data to a receipent address. thy just send it to the kafka server. And anyopne who it interested in that data can come forwrad and take it from kafka server. So, any application that requests data from a kafka server is a consumer, and they can ask for data send by any producer provided thet have persmissions to read it.



Kafka topic :
-> We learned that produver sends data to the kafka broker. Then a consumer can ask for data from kafka broker. But the question is, which data? We need to have some identification meachinism to request  data from the broker. there comes the notion of the topic
-> topic is like a table in database or folder in a file system.
-> Topic is identified by a name
-> you can have any number to topics.

*/