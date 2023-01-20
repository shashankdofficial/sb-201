package q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		A aObj = ctx.getBean("a",A.class);
		
		aObj.funA();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
