package com.example.awsecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.aws.cache.config.annotation.CacheClusterConfig;
import org.springframework.cloud.aws.cache.config.annotation.EnableElastiCache;

@SpringBootApplication
@EnableElastiCache({@CacheClusterConfig(name = "redispoc1", expiration = 6000)})
public class AwsecacheApplication {

	public static void main(String[] args) {

		SpringApplication.run(AwsecacheApplication.class, args);
		String test = calculateExpensiveValue("TESTSB");
		System.out.println("finsihed");
	}

	@Cacheable("redispoc1")
	public static String calculateExpensiveValue(String key) {
		return "test-from-sb";
	}

}
