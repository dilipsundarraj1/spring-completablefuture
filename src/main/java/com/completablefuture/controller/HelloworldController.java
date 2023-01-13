package com.completablefuture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

import static java.lang.Thread.sleep;

@RestController
@RequestMapping("/v1")
public class HelloworldController {

    @GetMapping("/helloworld")
    public CompletableFuture<String> helloWorld() {

        return CompletableFuture.supplyAsync(() ->
        {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "HelloWorld";
        });
    }
}
