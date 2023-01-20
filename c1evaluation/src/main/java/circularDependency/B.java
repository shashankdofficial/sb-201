package circularDependency;

public class B {

	private A a1;
	
	//constructor injecton point
	public B(A a1) {
		this.a1=a1;
	}
	
	public void myFunB() {
		System.out.println("inside myFunB of B");
		System.out.println(a1);
	}
}
