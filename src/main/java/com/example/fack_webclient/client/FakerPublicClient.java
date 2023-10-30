package com.example.fack_webclient.client;

import com.example.fack_webclient.client.response.PostResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "https://api.escuelajs.co/api/v1")
public interface FakerPublicClient {

    @GetExchange("/products")
    List<PostResponse>allProducts();
}
