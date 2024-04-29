package com.wex.discoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WexDiscoverServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WexDiscoverServerApplication.class, args);
	}

}
