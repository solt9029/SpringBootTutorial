package com.solt9029.springboottutorial;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.time.Duration;

@Configuration
@EnableCaching
public class CacheConfig {
    @Bean
    public RedisCacheManager manager(LettuceConnectionFactory factory) {
        RedisCacheConfiguration configuration = RedisCacheConfiguration
            .defaultCacheConfig()
            .disableCachingNullValues()
            .entryTtl(Duration.ofHours(1))
            .serializeValuesWith(
                RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json())
            );
        configuration.usePrefix();
        return RedisCacheManager.RedisCacheManagerBuilder
            .fromConnectionFactory(factory)
            .cacheDefaults(configuration)
            .build();
    }
}
