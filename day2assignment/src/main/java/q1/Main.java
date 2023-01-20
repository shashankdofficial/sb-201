package q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationBean pr = ctx.getBean("p",PresentationBean.class);
		
		pr.present();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
