package com.xinrendai.credit.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.xinrendai.credit")
@MapperScan(basePackages = "com.xinrendai.credit.manage.mapper")
public class CreditManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditManageWebApplication.class, args);
	}
}
