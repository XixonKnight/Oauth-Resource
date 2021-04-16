package com.example.resourceserver.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NhanNguyen on 4/16/2021
 *
 * @author: NhanNguyen
 * @date: 4/16/2021
 */
@RestController
public class DemoController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

}
