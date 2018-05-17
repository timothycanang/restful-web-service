package com.spring.restfulwebservice.controller;


import com.spring.restfulwebservice.vo.CustomerVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebServiceController {

    @GetMapping(path = "/hello/name/{name}/contact/{contact}")
    public CustomerVo HellWorld(@PathVariable String name, @PathVariable String contact) {
        return new CustomerVo(name, contact);
    }

}
