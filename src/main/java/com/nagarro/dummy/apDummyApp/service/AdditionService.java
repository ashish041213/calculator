package com.nagarro.dummy.apDummyApp.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
	public int getAdditionResult(int a, int b) {
		return a + b;
	}
	public int getSubtractionResult(int a, int b) {
		return a - b;
	}
	public int getMultiplyResult(int a, int b) {
		return a * b;
	}
	public int getDivitionResult(int a, int b) {
		return a / b;
	}
}
