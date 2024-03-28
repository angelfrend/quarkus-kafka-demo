package sample;

import io.smallrye.common.annotation.Identifier;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import java.util.Map;

@ApplicationScoped
public class KafkaConfig {

    //This bean is never initialized or used....
    @Produces
    @Identifier("kafka-2-configuration")
    @ApplicationScoped
    Map<String, Object> kafka2() {
        return Map.ofEntries(
                Map.entry("bootstrap.servers", "http://bootstrap-server-2:9092"),
                Map.entry("schema.registry.url", "http://schema-registry-2:8091")
        );
    }

    //By default this Bean is created by smallrye. I have created this to highlight that the smallrye can detect custom bean for default configuration.
    @Produces
    @Identifier("default-kafka-broker")
    @ApplicationScoped
    Map<String, Object> kafka1() {
        return Map.ofEntries(
                Map.entry("bootstrap.servers", "http://bootstrap-server-1:9092"),
                Map.entry("schema.registry.url", "http://schema-registry-1:8091")
        );
    }

}
