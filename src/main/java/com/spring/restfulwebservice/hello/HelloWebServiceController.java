package com.spring.restfulwebservice.hello;


import com.spring.restfulwebservice.hello.jsonRespond;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWebServiceController {

    @GetMapping(path = "/hello/name/{name}/contact/{contact}")
    public jsonRespond HellWorld(@PathVariable String name, @PathVariable String contact){
        return new jsonRespond(name,contact);
    }

}
