import myhelloworld.HelloWorld;
import myhelloworld.HelloWorldImplService;


public class HelloWorldClient {
	public static void main(String[] args) {

	HelloWorldImplService myHelloWorld = new HelloWorldImplService();

	HelloWorld myinterface = myHelloWorld.getHelloWorldImplPort();
	
	String response = myinterface.runSimulation("a","b","c");
 
    System.out.println(response);
   }
}
