	package com.example.HelloWorld.HelloWorld;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@SpringBootApplication
	@RestController
	@RequestMapping("/HelloWorld")
	public class HelloWorldApplication {

		public static void main(String[] args) {
			SpringApplication.run(HelloWorldApplication.class, args);
		}

		@GetMapping("/hello")
		public String helloWorld(){

			return "Say Hello to world...";
		}
	}

