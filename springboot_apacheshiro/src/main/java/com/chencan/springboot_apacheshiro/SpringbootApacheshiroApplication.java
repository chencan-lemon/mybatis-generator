package com.chencan.springboot_apacheshiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.chencan.springboot_apacheshiro.mapper"})
public class SpringbootApacheshiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApacheshiroApplication.class, args);
	}
}
