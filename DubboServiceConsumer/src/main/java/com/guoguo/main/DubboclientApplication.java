package com.guoguo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@ComponentScan(basePackages = {"com.guoguo"})
//@EnableDubbo
@EnableDubboConfiguration
@SpringBootApplication
public class DubboclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboclientApplication.class, args);
	}

}
