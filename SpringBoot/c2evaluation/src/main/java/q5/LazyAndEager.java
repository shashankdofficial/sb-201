package q5;

public class LazyAndEager {

	// Eager and Lazy Loading
	
	//--> by default ORM s/w (Hibernate) perform lazy loading while fetching the objs, when we fetch the parent obj(first level obj),then only the first level obj related data will be loaded into the memory,but the 2nd level  obj related data will be loaded at time of calling the 2nd level object related methods.
	
//	Demo.java:-
//	===========
//
//
//	public class Demo {
//		
//		public static void main(String[] args) {
//			
//			EntityManager em= EMUtil.provideEntityManager();
//			
//			
//	 		Employee emp= em.find(Employee.class, 10);
//	 		
//	 		em.close();  // even though before closing the EM obj we got the Employee obj
//			//here only Employee related obj will be loaded ,address obj data will be not be loaded
//				//so while fetching the address related data we will get an exception
//			
//	 		System.out.println(emp.getEid());
//	 		System.out.println(emp.getEname());
//	 		System.out.println(emp.getSalary());
//	 		
//	 		System.out.println("All Address are:-");
//	 		
//	 		System.out.println("===========================");
//	 		Set<Address> addreses= emp.getAddresses();
//	 		
//	 		for(Address ad:addreses){
//	 			System.out.println("city :"+ad.getCity());
//	 			System.out.println("state :"+ad.getState());
//	 			System.out.println("Pincode :"+ad.getPincode());
//	 			
//	 			System.out.println("***************************");
//	 		}
//			
//			System.out.println("done...");
//		}
//
//	}
//
//
//	--to solve the above problem we need to use Eager loading:-
//
//	example:-
//
//	Employee.java:-
//	===============
//
//	@Entity
//	public class Employee {
//		
//		@Id
//		@GeneratedValue(strategy=GenerationType.AUTO)
//		private int eid;
//		private String ename;
//		private int salary;
//		
//		@ElementCollection(fetch=FetchType.EAGER)
//		@Embedded
//		@JoinTable(name="empaddress",joinColumns=@JoinColumn(name="emp_id"))
//		private Set<Address> addresses=new HashSet<Address>();
//	--
//	--
//		
//	}
	
	//The first thing that we should discuss here is what lazy loading and eager loading are:

	//Eager Loading is a design pattern in which data initialization occurs on the spot.
	//Lazy Loading is a design pattern that we use to defer initialization of an object as long as it's possible.
	
	
	
	// ApplicationContext container by default performs early initialization, it means container creates the object of Spring
	
	//bean when spring configuration xml will be loaded into the memory.
	// example:
	//=========
	
	// ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//At this line only all the bean class registered inside this xml file will be instantiated,
	//i.e. their object will be created, their dependencies will be resolved and if any init-method is configured those
	//method will be called.
	//If we want to tell ApplicationContext container that lazy initialize a bean (create the bean class
	//object and resolve its dependencies and call the init-method at time of pulling/ accessing the bean object ) then
	//we need to use "lazy-init" attribute to the <bean> tag with value "true".
	
	
//	<bean id="a1" class="com.masai.A" init-method="mySetup" lazy-init="true">
//		<property name="message" value="Welcome to Spring.."/>
//	</bean>
	
	//In eager loading strategy, if we load the User data, it will also load up all orders associated with it and will store it in a memory.

	//But when we enable lazy loading, if we pull up a UserLazy, OrderDetail data won't be initialized and loaded into a memory until we make an explicit call to it.

}
