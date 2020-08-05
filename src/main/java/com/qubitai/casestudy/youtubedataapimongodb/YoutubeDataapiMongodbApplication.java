package com.qubitai.casestudy.youtubedataapimongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class YoutubeDataapiMongodbApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(YoutubeDataapiMongodbApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(YoutubeDataapiMongodbApplication.class);
	}

}
