package q4;

public class B {

	// @RequestParam
	//==============
			
	//It is used to get the request parameters. @RequestParam automatically binds the request
	//parameters to the arguments of your handler method.
	//Example URL
	// http://localhost:8888/studentapp/student?name=Ram
	

	
	// @Pathvariable
	//==============
	
	//The @PathVariable annotation is used to extract the value from the URI. It is most suitable for the RESTful web service where the
	//URL contains some value. Spring MVC allows us to use multiple @PathVariable annotations in the same method. A path variable is
	//a critical part of creating rest resources.
	//Example
	// http://localhost:8888/studentapp/student/10



	//Both annotations @RequestParam and @PathVariable in Spring MVC are used for fetching the 
	//values of request parameters. These annotations have similar purpose but some differences 
	//in use. The key difference between @RequestParam and @PathVariable is that @RequestParam 
	//used for accessing the values of the query parameters where as @PathVariable used for 
	//accessing the values from the URI template.
}
