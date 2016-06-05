package com.works.onkar_test.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AppResponse {

	@XmlElement
	private long sum;

	public AppResponse() {
		sum = 0;
	}

	public AppResponse(int number1, int number2) {
		super();
		sum = number1 + number2;
	}

}
