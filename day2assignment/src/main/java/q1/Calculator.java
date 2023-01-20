package q1;

public class Calculator {

	private int num1;
	private int num2;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void sum() {
		System.out.println("Sum is: "+(num1+num2));
	}
	
	public void multiply() {
		System.out.println("Multiply is: "+(num1*num2));
	}
	
	public void substract() {
		System.out.println("Substraction is: "+(num1-num2));
	}
}
