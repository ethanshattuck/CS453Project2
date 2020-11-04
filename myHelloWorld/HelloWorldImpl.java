package myHelloWorld;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "myHelloWorld.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String HelloWorld(String name) {

		System.out.println(name+" says hello");
		return "Hello World " + name;
	}
	
	@Override
	public String SayHey(String name) {
		System.out.println(name+" says Fuck you");
		return "Frick";
	}
 
}