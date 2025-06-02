package com.khewang.springSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  helloController {

    @GetMapping("/")
    public String helloController(HttpServletRequest request) {
        return "Hello World "+ request.getSession().getId();
    }


}
