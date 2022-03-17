package com.lbDemo.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*@Getter
@Setter*/
@AllArgsConstructor
@Data
//adds getters, setters, toString, hasCode
public class Customer {
	private String name;
	private int age;
	private char gender;

}
