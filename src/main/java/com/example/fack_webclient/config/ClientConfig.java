package com.example.fack_webclient.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ClientConfig {

    private static WebClient.Builder builder = WebClient.builder();

    private static WebClient webClient = builder.build();

    private static HttpServiceProxyFactory proxy = HttpServiceProxyFactory
            .builder(WebClientAdapter.forClient(webClient))
            .build();

    public static <s> s createService (Class<s> service){
        return proxy.createClient(service);
    }

}
