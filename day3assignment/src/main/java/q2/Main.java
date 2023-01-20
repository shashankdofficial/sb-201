package q2;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Mapping a1 = ctx.getBean("map1",Mapping.class);
        for (Map.Entry m:a1.getTheMap().entrySet()){
            System.out.println();
            Student st=(Student) m.getKey();
            st.displayDetails();
            System.out.println("City name : "+m.getValue());
            System.out.println("===============================================");
        }

    }

}
