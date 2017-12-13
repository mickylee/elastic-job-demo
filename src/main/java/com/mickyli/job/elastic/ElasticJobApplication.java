package com.mickyli.job.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class ElasticJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticJobApplication.class, args);
		try {
			new CountDownLatch(1).wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
