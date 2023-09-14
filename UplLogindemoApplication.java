package com.example.uplLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.uplLogin")
public class UplLogindemoApplication
{

	public static void main(String[] args) 
	{
		
		SpringApplication.run(UplLogindemoApplication.class, args);
	}

}
