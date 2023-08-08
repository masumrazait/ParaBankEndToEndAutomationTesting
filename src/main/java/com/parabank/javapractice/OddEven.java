package com.parabank.javapractice;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {1,2,3,4,5,6,7,8,9};
		int EvenCount=0;
		int OddCount=0;
		
		for(int num: A ) {
			if(num % 2==0) {
				EvenCount++;
			}else {
				OddCount++;
			}
		}
		System.out.println("Even number : " +EvenCount);
		System.out.println("Even number : " +OddCount);
		
		
	}

}
