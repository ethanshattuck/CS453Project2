
package myhelloworld;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://myHelloWorld/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SayHey")
    @WebResult(partName = "return")
    @Action(input = "http://myHelloWorld/HelloWorld/SayHeyRequest", output = "http://myHelloWorld/HelloWorld/SayHeyResponse")
    public String sayHey(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld")
    @WebResult(partName = "return")
    @Action(input = "http://myHelloWorld/HelloWorld/HelloWorldRequest", output = "http://myHelloWorld/HelloWorld/HelloWorldResponse")
    public String helloWorld(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}