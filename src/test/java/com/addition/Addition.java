package com.addition;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addition {

	@Parameters("input")
	@Test
	public void helloPrinter(@Optional("5") String input) {
		
		System.out.println("Hello value of addition ::  "+ input);
		
		int a = Integer.parseInt(input);
		
		int b = 20;
		
		
		int c = a+b;

		System.out.println("Hello value of addition ::  "+ c);
	}

}
