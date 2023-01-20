package circularDependency;

public class Explaination {

	//Circular Dependency:
	//Suppose we have 2 beans class A and class B, where class A depends upon class B and class B 
	//depends upon class A, and in both class A and class B.
	
	//parameterized constructors are defined for injecting the dependency, then it will cause a 
	//circular dependency. and it will throw an exception.
	
	/*
	A.java:-
	========
	
	package com.masai;
	public class A {
		private B b1;
		public A(B b1) {
			this.b1=b1;
		}
	public void showA() {
		System.out.println("inside showA of A ");
		System.out.println(b1);
	}
	}
	*/
	
	/*
	B.java:-
	========
	
	package com.masai;
	public class B {
		private A a1;
		public B(A a1) {
			this.a1=a1;
		}
		public void showB() {
			System.out.println("inside showB of B");
			System.out.println(a1);
		}
	}
	 */
	
	
	/*
	applicationContext.xml:
	=======================
	
		<bean id="aid" class="com.masai.A" >
			<constructor-arg ref="bid"/>
		</bean>
		
		<bean id="bid" class="com.masai.B" >
			<constructor-arg ref="aid"/>
		</bean>
	*/
	
	/*
	Demo.java:
	=========
	
		package com.masai;
		import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;
		public class Demo {
			public static void main(String[] args) {
				//activate the spring container by locating the spring configuration file..
				ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
				A a = ctx.getBean("aid",A.class);//pulling the A obj
				a.showA();
			}
		}
	
	*/
	
	
	/*
	 * in this Aid need bid to create a object and bid need to create aid then both will work but
	 * simultaneously it is not possible so we can solve this to give at least one class a setter
	 * method in this case for aid that will make a object of b and then it will execute without
	 * giveing error let see with the examle.
	 */
}
