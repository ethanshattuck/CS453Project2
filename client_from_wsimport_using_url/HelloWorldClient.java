import myhelloworld.HelloWorld;
import myhelloworld.HelloWorldImplService;


public class HelloWorldClient {
	public static void main(String[] args) {

	HelloWorldImplService myHelloWorld = new HelloWorldImplService();

	HelloWorld myinterface = myHelloWorld.getHelloWorldImplPort();
	
	//String a (class #?) = {numberOfStudents} {seatNumber}{[booleans]} 
	
	//String classA = 3 3011010 2101100 1000000
	
	String response = myinterface.runSimulation("a","b","c");
 
    System.out.println(response);
   }
}
