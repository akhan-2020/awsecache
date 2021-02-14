package com.example.awsecache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @Cacheable("CacheCluster")
    public String calculateExpensiveValue(String key) {
        return "test";
    }
}
