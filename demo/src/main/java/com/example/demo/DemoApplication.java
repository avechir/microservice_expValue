package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "no file") String name) {
		DataState dataState = new DataState(name);
		ArrayList<DataOperation> listOfOperations = new ArrayList<>();
		listOfOperations.add(new ReadDataOperation());
		listOfOperations.add(new FindExpectedValue());
		listOfOperations.forEach(operation -> operation.execute(dataState));
		String result = dataState.printExpectedValue();
		return String.format("Result of file %s:\n %s", name, result);
	}
}