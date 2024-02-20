package com.example.demo.model;

public class StringModel {
	private int alphabet;
	private int digit;
	private int sysmbol;
	public StringModel(int alphabet, int digit, int sysmbol) {
		super();
		this.alphabet = alphabet;
		this.digit = digit;
		this.sysmbol = sysmbol;
	}
	public StringModel() {
		super();
	}
	public int getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(int alphabet) {
		this.alphabet = alphabet;
	}
	public int getDigit() {
		return digit;
	}
	public void setDigit(int digit) {
		this.digit = digit;
	}
	public int getSysmbol() {
		return sysmbol;
	}
	public void setSysmbol(int sysmbol) {
		this.sysmbol = sysmbol;
	}
//	@Override
//	public String toString() {
//		return "StringModel [alphabet=" + alphabet + ", digit=" + digit + ", sysmbol=" + sysmbol + "]";
//	}
	

}
