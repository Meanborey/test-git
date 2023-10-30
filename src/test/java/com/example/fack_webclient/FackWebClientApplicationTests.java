package com.example.fack_webclient;

import com.example.fack_webclient.client.FakerPublicClient;
import com.example.fack_webclient.client.JsonPublicClient;
import com.example.fack_webclient.client.requst.PostRequst;
import com.example.fack_webclient.client.response.PostResponse;
import com.example.fack_webclient.config.ClientConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.service.annotation.HttpExchange;

@SpringBootTest
class FackWebClientApplicationTests {

    @Test
    void JsonPlaceholder(){

        JsonPublicClient client = ClientConfig.createService(JsonPublicClient.class);
        System.out.println(client.getAll());
    }

    @Test
            void fakePublicApi() {
        FakerPublicClient client = ClientConfig.createService(FakerPublicClient.class)
                ;
        System.out.println(client.allProducts());
    }

    @Test
    void savePost(){
        PostRequst postRequst = new PostRequst(1,"photo","My photo");
        JsonPublicClient client = ClientConfig.createService(JsonPublicClient.class);
        PostResponse postResponse = client.savePost(postRequst);
        System.out.println(postResponse);
    }

}
