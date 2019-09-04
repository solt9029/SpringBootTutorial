package com.solt9029.springboottutorial.services;

import com.solt9029.springboottutorial.entities.RedisData;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisDataService {
    @Cacheable(value = "data", key = "#id")
    public RedisData get(Long id) {
        RedisData data = new RedisData();
        data.setValue(String.format("value%d", id));
        return data;
    }
}
