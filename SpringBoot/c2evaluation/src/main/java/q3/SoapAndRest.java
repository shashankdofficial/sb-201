package q3;

public class SoapAndRest {

	
	//SOAP-based WS (Simple object access protocol)
	//================================================
			
	//Creating a Web service using SOAP are heavy weight application because apart from creating the main service classes (actual
	//service ) there is a need to create some extra binding classes to parse the XML and convert them in Java objects and vice-versa
	//moreover to expose and consume the SOAP-based web services we need to generate some extra xml file (WSDL file).
	//to communicate between the client applications to the server application, since it is XML based, it is
	//platform-independent and language independent.
	
	//Restful web-services
	//====================
	
	//In order to make web services as light-weight, another architectural style is defined named as "REST” (Representational State
	//transfer).
	//This Rest architectural style tells that create a web service with the required operation and expose them through the HTTP
	//protocol. and allow them to be accessed by the client with the help of http protocol only without any binding classes and any XML
	//files.
	
	//It does not define the standard message exchange format. We can build REST services with both XML and JSON. JSON is the
	//more popular format with REST. The key abstraction is a resource in REST. A resource can be anything. It can be accessed
	//through a Uniform Resource Identifier (URI). For example:
	//The resource has representations like XML, HTML, and JSON. The current state is capture by representational resources. When we
	//request a resource, we provide the representation of the resource. The important methods of HTTP are:
	
	
	//GET: It reads a resource.
	//PUT: It updates an existing resource.
	//POST: It creates a new resource.
	//DELETE: It deletes the resource.

	//Some important Point o Restfull WS:
	//===================================
	
	//RESTful web services are platform-independent.
	
	//--> It can be written in any programming language and can be executed on any platform.
	//--> It provides different data formats like JSON, text, HTML, and XML.
	//--> It is fast in comparison to SOAP because there is no strict specification like SOAP.
	//--> These are reusable.
	//--> They are language neutral.

	//Converting Spring MVC controller bean as a Restful service:
	
	//	@Controller + @ResponseBody = @RestController
	
	
	//Steps to create the first Spring boot REST web service :
	
		//1: Create a spring starter project on STS.
		//2: select the spring web dependency, (This dependency will include an integrated Tomcat web server, in which our application
		//will be deployed)
		//3: Creating a HelloWorld service:
	
		//Create a new class with the name HelloWorldController inside the main package(com.masai).
		//To make this class a Restful web service class, annotate this class with the following annotation:
		// @RestController
	
	
		//4: Inside this class define the actual service ( a method that can perform some operation)
		//we need to make this service (method) accessible with an URI by the help of @RequestMapping annotation. and we need to
		//specify the appropriate HTTP method using which we want to expose this service.

//	package com.masai;
//	import org.springframework.web.bind.annotation.RequestMapping;
//	import org.springframework.web.bind.annotation.RequestMethod;
//	import org.springframework.web.bind.annotation.RestController;
//	@RestController
//	public class HelloWorldController {
		//	@RequestMapping(value= "/hi",method = RequestMethod.GET)
			//	public String sayHello() {
			//	return "welcome"; // it will be represented as raw data.
		//	}
//	}
	
	//5: Change the port number of the Integrated Tomcat server (8080 is the most common port, it is recommended to change it).
	//inside the application.properties file of the src/main/resources folder make the following entry:

	//6: run the main class of the spring boot project (in which main method is there) as a spring boot application.
	//7: from the browser give the following request from the URL.
	//     http://localhost:8088/hi

	
	
	

}
