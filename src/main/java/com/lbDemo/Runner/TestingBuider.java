package com.lbDemo.Runner;

import com.lbDemo.Customer.Customer;

public class TestingBuider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//model class has to be annotated with @builder annotaion then only we can proceed.
		Customer C2= Customer.builder().age(14).name("Rakesh").gender('M').build();
	      System.out.println("the age of customer is:"+C2.getAge());
	}

}
