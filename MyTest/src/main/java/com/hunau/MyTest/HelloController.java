package com.hunau.MyTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/sayhello")
    public String hello() {
        return "王豪杰,河南省新郑市!";
    }
}
