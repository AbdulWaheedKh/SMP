package com.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
/*
 * (scanBasePackages={"com.javabrains",
 * "com.javabrains.models","com.javabrains.controller",
 * "com.javabrains.model.UserRepository"},
 * exclude={DataSourceAutoConfiguration.class,
 * DataSourceTransactionManagerAutoConfiguration.class})
 */
public class AfyPtrythreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfyPtrythreeApplication.class, args);
	}

}
