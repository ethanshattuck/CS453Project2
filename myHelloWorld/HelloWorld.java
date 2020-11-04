package myHelloWorld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)

public interface HelloWorld{
 
	@WebMethod String HelloWorld(String name);
	
	@WebMethod String runSimulation(String classA, String classB, String classC);
 
}