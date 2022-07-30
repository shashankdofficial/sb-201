package q1;


public class TightandLooseC {
	//Tight Coupling
	
	//If we do any modification in Dependency class and then it will force to make changes in Dependent
	//Class then it is called Tight Coupling.
	
	//Loose Coupling
	//If we do any modification in Dependency class and then it will not force to make changes in Dependent
	//Class then it is called Loose Coupling Coupling.
	//ex:
	
//	public interface Vehcle {
//
//		public void go();
//	}
//	
//	
//	public class Travel {
//		
//		Vehcle v;
//		
//		//Setter Injection Point
//		public void setV(Vehcle v) {
//			this.v = v;
//		}
//
//		public void journey() {
//			v.go();
//			System.out.println("Jounrney started...");
//		}
//	}
//	
//	
//	public class Car implements Vehcle {
//
//		public void start() {
//			System.out.println("Car started...");
//		}
//
//		@Override
//		public void go() {
//			start();
//		}
//
//	}
//	
//	
//	public class Bike implements Vehcle {
//
//		public void ride() {
//			System.out.println("ride started....");
//		}
//
//		@Override
//		public void go() {
//			ride();
//		}
//	}
//	
//	
//	import org.springframework.context.ApplicationContext;
//	import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//	public class Demo {
//
//		public static void main(String[] args) {
//			
//			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//			
//			Travel tr = ctx.getBean(Travel.class,"t");
//			
//			tr.journey();
//			
//		}
//
//	}
}
