package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationBean preb = ctx.getBean("pb",PresentationBean.class); //Pulling Spring Bean obj from the spring container
		
		preb.present();
		
	}

}
