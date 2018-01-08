package com.calculator;

import java.io.Serializable;

public class CalculatorBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1242295678201619581L;
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}
