package xyz.javista.cloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigDemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigDemoServerApplication.class, args);
	}
}
