package com.example.oauth2.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NhanNguyen on 4/15/2021
 *
 * @author: NhanNguyen
 * @date: 4/15/2021
 */
@RestController

public class DemoControl {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
