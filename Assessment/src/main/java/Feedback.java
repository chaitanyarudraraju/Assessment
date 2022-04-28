import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.processor.TopicNameExtractor;

import java.util.Properties;

public class Feedback {

    public static void main(String[] args)
    {

        Properties properties=new Properties();
        properties.setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.setProperty(StreamsConfig.APPLICATION_ID_CONFIG, "Consumer");



        StreamsBuilder streamsBuilder= new StreamsBuilder();
        streamsBuilder.stream("newtopic".toUpperCase()).to("new");


        Topology topology= streamsBuilder.build();
        KafkaStreams kafkaStreams= new KafkaStreams(topology, properties);
        kafkaStreams.start();


    }
}
