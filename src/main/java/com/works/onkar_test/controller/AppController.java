package com.works.onkar_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/getSum")
	public long getSum(@RequestParam(value = "num1", defaultValue = "1") int num1,
			@RequestParam(value = "num2", defaultValue = "3") int num2) {
		return num1 + num2;
	}
}