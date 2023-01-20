package circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("circularDependency.xml");
		
		A a = ctx.getBean("aid",A.class);
		
		a.myFunA();
	}

}
