package com.lbDemo.Runner;

import com.lbDemo.Customer.Customer;

import lombok.extern.java.Log;

@Log
public class TestingLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer C2= Customer.builder().age(14).name("Rakesh").gender('M').build();
	      System.out.println("the age of customer is:"+C2.getAge());
	      System.out.println("------------");
	      log.info("C2 toString"+C2.toString());
	      System.out.println("-------");
	      log.severe("end of main method");
	}

}
