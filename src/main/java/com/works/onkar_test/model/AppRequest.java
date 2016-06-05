package com.works.onkar_test.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AppRequest {

	@XmlElement
	private int number1;

	@XmlElement
	private int number2;

	public AppRequest(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public AppRequest() {
		super();
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

}
