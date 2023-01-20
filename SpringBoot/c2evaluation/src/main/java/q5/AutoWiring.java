package q5;

public class AutoWiring {

	//The process of creating association between/among application components is known as "wiring".(variable is
	//wired with appropriate object)
	//We have 2 kind of wiring in spring application:
	// 1. Explicit wiring
	// 2. Auto-wiring (implicit wiring)
	
	//To instruct the spring container to perform auto-wiring for a particular bean, we make use of the "autowire"
	//attribute inside the <bean> tag with any one of following values:
	
	//1. no (default)
	//2. byName
	//3. byType
	//4. constructor
	
	//In bean auto-wiring, spring container automatically injects a bean dependencies by either calling a setter
	//method or calling parameterized constructor without writing explicitly inside the
	//spring configuration file.
	
	//Limitation of bean auto-wiring:
	
		//1. It can be used only to inject the objects but not the simple value dependencies.
		//2. If container have multiple dependencies of same type to inject , then ambiguity problem may raise.
		//3. <bean> tag has "autowire" attribute and its default value is "no" . it means by default auto-wiring is
		//	 disabled in xml based auto-wiring.
		//4. Whereas in annotation based auto-wiring the default type is "byType".
	
	//constructor auto-wiring:
		//In this strategy , spring container uses constructor injection instead of setter injection.
		//dependency resolution is done by using max number of argument constructor, if constructors are overloaded.
		// it first uses byName and if not found then it uses byType , and in case byType is matched with
		//more that 1 then ambiguity exception will occur
	
	//applicationContext.xml:-
	//===========================
			
//	<bean id="d1" class="com.masai.Demo" autowire="constructor" />
//	<bean id="a5" class="com.masai.A"/>
//	<bean id="a6" class="com.masai.A" />
//	<bean id="b5" class="com.masai.B" />
	
	
	//Main.java:
	//==========
//	package com.masai;
//	import org.springframework.context.ApplicationContext;
//	import org.springframework.context.support.ClassPathXmlApplicationContext;
//	public class Main {
//		public static void main(String[] args) {
//		//activate the spring container by locating the spring configuration file..
//			ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//			Demo d= ctx.getBean("d1",Demo.class);
//			d.showDetails();
//		}
//	}
	
	//here container will create the object of Demo class by executing zero argument constructor, because 3
	//argument and 2 argument constructor does not qualify for the dependencies (they generate ambiguity
	//exception A a1)
	//--> if we change the id of any A class inside the spring configuration file as "a1" then 2nd argument
	//constructor will gets the priority (here 3rd argument constructor will raise the ambiguity exception at A a2).
	//--> if we change the id of one A class as a1 and another A class as a2 then 3rd argument constructor will gets
	//the priority,
	//here B will follow byType and A a1 and A a2 will follow byName strategy.

	


}
