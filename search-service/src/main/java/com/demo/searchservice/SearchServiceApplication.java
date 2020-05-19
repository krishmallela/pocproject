package com.demo.searchservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@EnableKafka
@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories
@OpenAPIDefinition(info=@Info(title="Search API",version = "2.0",description = "Search MicroService"))

public class SearchServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SearchServiceApplication.class, args);
	}

}
