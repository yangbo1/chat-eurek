package com.yb.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ChatEurekApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatEurekApplication.class, args);
	}
}
