package com.sicc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SiccConfig {
	@Value("${sicc.msa.message}")
	private String message;
	
	public String getMessage() {
		return message;
	}
}
