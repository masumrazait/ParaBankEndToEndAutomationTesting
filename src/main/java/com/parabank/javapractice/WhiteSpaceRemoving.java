package com.parabank.javapractice;

public class WhiteSpaceRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A=" Raza       Patna          Stay In Delhi";
		
		String B= A.replaceAll("\\s ", "");
		
		System.out.println(B);

	}

}
