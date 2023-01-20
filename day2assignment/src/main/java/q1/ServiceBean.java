package q1;

public class ServiceBean {

	private Calculator calc;
	
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}

	//Business Logic
	public void calculatefunc() {
		calc.sum();
		calc.multiply();
		calc.substract();
	}
}
