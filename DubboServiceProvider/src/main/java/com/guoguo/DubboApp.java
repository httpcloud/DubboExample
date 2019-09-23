package com.guoguo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@ComponentScan(basePackages = {"com.guoguo.service"})
@SpringBootApplication
@EnableDubboConfiguration
public class DubboApp {

	public static void main(String[] args) {
		SpringApplication.run(DubboApp.class, args);
	}

}

