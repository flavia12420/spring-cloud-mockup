package com.far.deliveryconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DeliveryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryConfigServerApplication.class, args);
	}
}
