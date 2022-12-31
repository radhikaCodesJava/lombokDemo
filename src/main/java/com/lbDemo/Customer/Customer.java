package com.lbDemo.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@AllArgsConstructor
@Data
@Builder
//adds getters, setters, toString, hasCode
public class Customer {
	private String name;
	private int age;
	private char gender;

}
