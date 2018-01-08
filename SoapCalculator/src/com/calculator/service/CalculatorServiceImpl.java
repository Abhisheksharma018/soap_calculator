package com.calculator.service;

public class CalculatorServiceImpl implements CalculatorService
{

	@Override
	public int addValue(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a+b;
		return sum;
	}

	@Override
	public int subtractValue(int a, int b) {
		// TODO Auto-generated method stub
		int sub = a-b;
		return sub;
		
	}

	@Override
	public int multiplyValue(int a, int b) {
		// TODO Auto-generated method stub
		int multi = a*b;
		return multi;
	}

}
