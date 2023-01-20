package circularDependency;

public class A {

	private B b1;
	
	//setter injection point
	public void setB1(B b1) {
		this.b1 = b1;
	}
	
	public void myFunA() {
		System.out.println("inside myFunA of A ");
		System.out.println(b1);
	}
}
