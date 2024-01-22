package com.demo.dockerwithgooglejib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerWithGoogleJibApplication {

	@GetMapping("/message")
	public String message()
	{
		return "Dockerize java app with google jib plugin..";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerWithGoogleJibApplication.class, args);
	}

}
