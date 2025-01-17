package com.gavs_genai.ollamarestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.gavs_genai.ollamarestapi.functions.JiraApiProperties;

@SpringBootApplication
@ComponentScan(basePackages = "com.gavs_genai.ollamarestapi")
@EnableConfigurationProperties(JiraApiProperties.class)
public class OllamarestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OllamarestapiApplication.class, args);
	}

}
