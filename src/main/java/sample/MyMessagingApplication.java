package sample;

import io.quarkus.runtime.StartupEvent;
import org.eclipse.microprofile.reactive.messaging.*;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

import java.util.stream.Stream;

@ApplicationScoped
public class MyMessagingApplication {

    @Inject
    @Channel("channel-1")
    Emitter<String> emitter1;

    @Inject
    @Channel("channel-2")
    Emitter<String> emitter2;

    /**
     * Sends message to the "words-out" channel, can be used from a JAX-RS resource or any bean of your application.
     * Messages are sent to the broker.
     **/
    void onStart(@Observes StartupEvent ev) {
//        Stream.of("Hello", "with", "Quarkus", "Messaging", "message").forEach(string -> emitter.send(string));
    }
}
