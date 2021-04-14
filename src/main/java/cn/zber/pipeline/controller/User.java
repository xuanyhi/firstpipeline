package cn.zber.pipeline.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuanyi
 */
@RestController
@RequestMapping("/")
public class User {

    @Value("${name}")
    private String name;

    @GetMapping("/name")
    public String getName(){
        return name;
    }
}
