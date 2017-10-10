package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
/*加入断路器仪表盘*/
@EnableHystrixDashboard
/*如果是feign需要额外添加@EnableCircuitBreaker，ribbon不需要*/
@EnableCircuitBreaker
public class DemoFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignApplication.class, args);
	}
}
