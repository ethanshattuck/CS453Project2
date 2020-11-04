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
		String[] classAVars = classA.split(" ");
		String[] classBVars = classB.split(" ");
		String[] classCVars = classC.split(" ");
		
		int classANumStudents = Integer.parseInt(classAVars[0]);
		int classBNumStudents = Integer.parseInt(classBVars[0]);
		int classCNumStudents = Integer.parseInt(classCVars[0]);
		
		
		//Seating Classroom #1
		for (int i = 1; i <= classANumStudents; i++)
		{
				System.out.println("Classroom #1: Student " + i + " has sat down at seat #" + classAVars[i].charAt(0));
		}
		System.out.println("Classroom #1: Teacher has taken their seat");
		
		//Seating Classroom #2
		for (int i = 1; i <= classBNumStudents; i++)
		{
				System.out.println("Classroom #2: Student " + i + " has sat down at seat #" + classBVars[i].charAt(0));
		}
		System.out.println("Classroom #2: Teacher has taken their seat");
		
		//Seating Classroom #3
		for (int i = 1; i <= classCNumStudents; i++)
		{
				System.out.println("Classroom #3: Student " + i + " has sat down at seat #" + classCVars[i].charAt(0));
		}
		System.out.println("Classroom #3: Teacher has taken their seat");
		
		//Mask Check for Classroom #1
		for (int i = 1; i <= classANumStudents; i++)
		{
			if (classAVars[i].charAt(1) == '1')
			{
				System.out.println("Classroom #1: Student " + i + " is wearing their mask");
			}
			else {
				System.out.println("Classroom #1: ALARM (Sensor 2) Student " + i + " is not wearing their mask");
			}
		}
		if (classAVars[classANumStudents+1].charAt(0) == '1')
		{
			System.out.println("Classroom #1: Teacher is wearing their mask");
		}
		else {
			System.out.println("Classroom #1: ALARM (Sensor 2) Teacher is not wearing their mask");
		}
		
		//Mask Check for Classroom #2
		for (int i = 1; i <= classBNumStudents; i++)
		{
			if (classBVars[i].charAt(1) == '1')
			{
				System.out.println("Classroom #2: Student " + i + " is wearing their mask");
			}
			else {
				System.out.println("Classroom #2: ALARM (Sensor 2) Student " + i + " is not wearing their mask");
			}
		}
		if (classBVars[classBNumStudents+1].charAt(0) == '1')
		{
			System.out.println("Classroom #2: Teacher is wearing their mask");
		}
		else {
			System.out.println("Classroom #2: ALARM (Sensor 2) Teacher is not wearing their mask");
		}
		
		//Mask Check for Classroom #3
		for (int i = 1; i <= classCNumStudents; i++)
		{
			if (classCVars[i].charAt(1) == '1')
			{
				System.out.println("Classroom #3: Student " + i + " is wearing their mask");
			}
			else {
				System.out.println("Classroom #3: ALARM (Sensor 2) Student " + i + " is not wearing their mask");
			}
		}
		if (classCVars[classCNumStudents+1].charAt(0) == '1')
		{
			System.out.println("Classroom #3: Teacher is wearing their mask");
		}
		else {
			System.out.println("Classroom #3: ALARM (Sensor 2) Teacher is not wearing their mask");
		}
		
		//Lysol Before Class (Classroom #1)
		for (int i = 1; i <= classANumStudents; i++)
		{
			if (classAVars[i].charAt(1) == '2')
			{
				System.out.println("Classroom #1: Student " + i + " applied Lysol before class");
			}
			else {
				System.out.println("Classroom #1: Alarm (Sensor 3) Student " + i + " did not apply Lysol before class");
			}
		}
		if (classAVars[classANumStudents+1].charAt(1) == '1')
		{
			System.out.println("Classroom #1: Teacher applied Lysol before class");
		}
		else {
			System.out.println("Classroom #1: Alarm (Sensor 3) Teacher did not apply Lysol before class");
		}

		
		//Lysol Before Class (Classroom #2)
		for (int i = 1; i <= classBNumStudents; i++)
		{
			if (classBVars[i].charAt(1) == '2')
			{
				System.out.println("Classroom #2: Student " + i + " applied Lysol before class");
			}
			else {
				System.out.println("Classroom #2: Alarm (Sensor 3) Student " + i + " did not apply Lysol before class");
			}
		}
		if (classBVars[classBNumStudents+1].charAt(1) == '1')
		{
			System.out.println("Classroom #2: Teacher applied Lysol before class");
		}
		else {
			System.out.println("Classroom #2: Alarm (Sensor 3) Teacher did not apply Lysol before class");
		}
		
		//Lysol Before Class (Classroom #3)
		for (int i = 1; i <= classCNumStudents; i++)
		{
			if (classCVars[i].charAt(1) == '2')
			{
				System.out.println("Classroom #3: Student " + i + " applied Lysol before class");
			}
			else {
				System.out.println("Classroom #3: Alarm (Sensor 3) Student " + i + " did not apply Lysol before class");
			}
		}
		if (classAVars[classCNumStudents+1].charAt(1) == '1')
		{
			System.out.println("Classroom #3: Teacher applied Lysol before class");
		}
		else {
			System.out.println("Classroom #3: Alarm (Sensor 3) Teacher did not apply Lysol before class");
		}
		
		return "Ran Simulation";
	}
 
}