package com.swagger.sawggerspringboot3.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Objects;

@RestController
@RequestMapping("example")
public class ExampleController {

    @GetMapping("getNameAndAge/{name}")
    @Operation(description = "Get API for testing open api with springboot 3 webflux")
    Mono<String> getNameAndAge(
            @PathVariable String name,
            @RequestParam(required = false) Integer age) {
        return Objects.isNull(age) ? Mono.just("Name : " + name)
                : Mono.just("Name : " + name + "\n Age : " + age);
    }
}
