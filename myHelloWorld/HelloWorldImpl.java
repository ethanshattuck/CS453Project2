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
	public String runSimulation(String classA, String classB, String classC) {
		
		//build objects and rum simulation
		
		System.out.println("Start Simulation Function");
		return "Ran Simulation";
	}
 
}