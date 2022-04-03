package com.seyun.me.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.seyun.me.yun")
@ComponentScan(basePackages = "config")
@ComponentScan(basePackages = "dao")
public class YunApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunApplication.class, args);
	}

}
