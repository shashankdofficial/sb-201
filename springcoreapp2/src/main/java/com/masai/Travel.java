package com.masai;

//Dependent Class
public class Travel {

//	Car c = new Car();
	
	Vehcle v;
	
	String name;

	
	//Constructor Injection Point
	public Travel(Vehcle v, String name) {
		super();
		this.v = v;
		this.name = name;
	}



	public void journey() {
		v.go();
		System.out.println("Jounrney started...");
		System.out.println("Name is : "+name);
	}


	
}
