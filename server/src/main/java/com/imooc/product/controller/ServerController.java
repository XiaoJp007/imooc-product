package com.imooc.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    @RequestMapping("/serverMsg")
    public String serverMsg() {
        return "this is product server msg";
    }
}
