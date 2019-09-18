package com.sicc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sicc.config.SiccConfig;

/**
 * application start point
 * @author Woongs
 */
@SpringBootApplication
public class SiccApplication {
	@Autowired
	static SiccConfig siccConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(SiccApplication.class, args);
	}
}