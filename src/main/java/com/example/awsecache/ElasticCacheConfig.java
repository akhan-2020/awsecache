package com.example.awsecache;

import org.springframework.cloud.aws.cache.config.annotation.CacheClusterConfig;
import org.springframework.cloud.aws.cache.config.annotation.EnableElastiCache;

@EnableElastiCache({@CacheClusterConfig(name = "redispoc1", expiration = 6000)})
public class ElasticCacheConfig {

}
