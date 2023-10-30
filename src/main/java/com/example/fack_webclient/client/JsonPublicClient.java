package com.example.fack_webclient.client;

import com.example.fack_webclient.client.requst.PostRequst;
import com.example.fack_webclient.client.response.PostResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@HttpExchange(url = "https://jsonplaceholder.typicode.com")
public interface JsonPublicClient {

    @GetExchange("/posts")
    List<PostResponse>getAll();

    @PostExchange("/posts")
    PostResponse savePost(@RequestBody PostRequst postRequst);


}
