package com.qrcodeapp.springbootQRcodegeneratorReaderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootQrCodeGeneratorReaderAppApplication implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootQrCodeGeneratorReaderAppApplication.class, args);
	}

}
