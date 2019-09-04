package com.solt9029.springboottutorial.controllers;

import com.solt9029.springboottutorial.entities.RedisData;
import com.solt9029.springboottutorial.services.RedisDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisDataController {
    private final StringRedisTemplate template;
    private final RedisDataService service;

    @Autowired
    public RedisDataController(StringRedisTemplate template, RedisDataService service) {
        this.template = template;
        this.service = service;
    }

    @GetMapping("/template")
    public RedisData template() {
        template.opsForValue().set("key", "value");

        RedisData data = new RedisData();
        data.setValue(template.opsForValue().get("key"));

        return data;
    }

    @GetMapping("/cacheable/{id}")
    public RedisData cacheable(@PathVariable Long id) {
        return service.get(id);
    }
}
