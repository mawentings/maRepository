package com.example.demo07;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.example.demo07.dao")
public class Demo07Application {
	public static void main(String[] args) {
		SpringApplication.run(Demo07Application.class, args);
	}
}
