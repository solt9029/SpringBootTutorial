package com.solt9029.springboottutorial.controllers;

import com.solt9029.springboottutorial.entities.RedisData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    private final StringRedisTemplate template;

    @Autowired
    public RedisController(StringRedisTemplate template) {
        this.template = template;
    }

    @GetMapping("")
    public RedisData index() {
        template.opsForValue().set("key", "value");

        RedisData data = new RedisData();
        data.setValue(template.opsForValue().get("key"));

        return data;
    }
}
