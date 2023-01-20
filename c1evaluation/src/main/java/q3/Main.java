package q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Presentation pr = context.getBean("presentation",Presentation.class);
        
        pr.displayResult();
    }
}
