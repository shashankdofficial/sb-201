package com.masai.looseC;

//Dependent Class
public class Travel {

//	Car c = new Car();
	
	Vehcle v;
	
//	//Setter Injection Point
//	public void setV(Vehcle v) {
//		this.v = v;
//	}

	
	//Constructor Injection Point
	public Travel(Vehcle v) {
		super();
		this.v = v;
	}



	public void journey() {
//		c.start();
		v.go();
		System.out.println("Jounrney started...");
	}
}
