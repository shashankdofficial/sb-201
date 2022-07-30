package com.masai.tightC;

//Dependent Class
public class Travel {

	Car c = new Car();
	
	public void journey() {
		c.start();
		System.out.println("Jounrney started...");
	}
}
