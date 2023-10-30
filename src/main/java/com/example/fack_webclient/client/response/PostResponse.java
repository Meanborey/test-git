package com.example.fack_webclient.client.response;

public record PostResponse (Integer id,
                            String title,
                            Integer userId,
                            String description){
}
