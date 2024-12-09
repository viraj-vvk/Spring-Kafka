# Spring-Kafka

1. Start the ZooKeeper service 
> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2. Start the Kafka broker service
> .\bin\windows\kafka-server-start.bat .\config\server.properties

3. CREATE A TOPIC TO STORE YOUR EVENTS
> .\bin\windows\kafka-topics.bat --create --topic topic_demo --bootstrap-server localhost:9092

4. WRITE SOME EVENTS INTO THE TOPIC
> .\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

5. READ THE EVENTS
> .\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092