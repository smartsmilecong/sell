package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SellApplication {

	public static void main(String[] args) {
		Integer integer = new Integer(123);
		SpringApplication.run(SellApplication.class, args);
	}

	@RequestMapping("index")
	public String index(){
		return "netapp";
	}
}
