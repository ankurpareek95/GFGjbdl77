package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ImageController {

    @GetMapping(value = "/image", produces = MediaType.IMAGE_GIF_VALUE)
    public byte[] getImage(@RequestParam("id") int id,
                           @RequestParam(value = "length", required = false, defaultValue = "200") int length,
                           @RequestParam("breadth") int breadth){
        String url = "https://picsum.photos/id/" + id + "/" + length +"/" + breadth;
        RestTemplate restTemplate = new RestTemplate();
        byte[] imageObject = restTemplate.getForObject(url, byte[].class);
        return imageObject;
    }
}
