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
		String returnStr = "";
		String[] classAVars = classA.split(" ");
		String[] classBVars = classB.split(" ");
		String[] classCVars = classC.split(" ");
		
		int classANumStudents = Integer.parseInt(classAVars[0]);
		int classBNumStudents = Integer.parseInt(classBVars[0]);
		int classCNumStudents = Integer.parseInt(classCVars[0]);
		
		
		//Seating Classroom #1
		for (int i = 1; i <= classANumStudents; i++)
		{
				System.out.println("Classroom #1: Student " + i + " has sat down at seat #" + classAVars[i].charAt(0) + ";");
				returnStr += "Classroom #1: Student " + i + " has sat down at seat #" + classAVars[i].charAt(0) + ";"
				
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
			if (classAVars[i].charAt(2) == '1')
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
			if (classBVars[i].charAt(2) == '2')
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
			if (classCVars[i].charAt(2) == '2')
			{
				System.out.println("Classroom #3: Student " + i + " applied Lysol before class");
			}
			else {
				System.out.println("Classroom #3: Alarm (Sensor 3) Student " + i + " did not apply Lysol before class");
			}
		}
		if (classCVars[classCNumStudents+1].charAt(1) == '1')
		{
			System.out.println("Classroom #3: Teacher applied Lysol before class");
		}
		else {
			System.out.println("Classroom #3: Alarm (Sensor 3) Teacher did not apply Lysol before class");
		}
		
		
		
		//Question logic (Classroom #1)
		for (int i = 1; i <= classANumStudents; i++)
		{
			if (classAVars[i].charAt(3) == '1' && classAVars[classANumStudents+1].charAt(2) == '1')
			{
				System.out.println("Classroom #1: Alarm (Sensor 1) Student " + i + " and Teacher go to Question rectangle");
			}
			else if (classAVars[i].charAt(3) == '1' && classAVars[classANumStudents+1].charAt(2) == '0')
			{
				System.out.println("Classroom #1: Student " + i + " goes to Question rectangle");
			}
		}
		
		//Question logic (Classroom #2)
		for (int i = 1; i <= classBNumStudents; i++)
		{
			if (classBVars[i].charAt(3) == '1' && classBVars[classBNumStudents+1].charAt(2) == '1')
			{
				System.out.println("Classroom #2: Alarm (Sensor 1) Student " + i + " and Teacher go to Question rectangle");
			}
			else if (classBVars[i].charAt(3) == '1' && classBVars[classBNumStudents+1].charAt(2) == '0')
			{
				System.out.println("Classroom #2: Student " + i + " goes to Question rectangle");
			}
		}
		
		//Question logic (Classroom #3)
		for (int i = 1; i <= classCNumStudents; i++)
		{
			if (classCVars[i].charAt(3) == '1' && classCVars[classCNumStudents+1].charAt(2) == '1')
			{
				System.out.println("Classroom #3: Alarm (Sensor 1) Student " + i + " and Teacher go to Question rectangle");
			}
			else if (classCVars[i].charAt(3) == '1' && classCVars[classCNumStudents+1].charAt(2) == '0')
			{
				System.out.println("Classroom #3: Student " + i + " goes to Question rectangle");
			}
		}
		
		//Visit logic (Classroom #1)
		for (int i = 1; i <= classANumStudents; i++)
		{
			char destination = classAVars[i].charAt(4);
			char seat = classAVars[i].charAt(0);
			boolean occupied = false;
			for (int j = 1; j <= classANumStudents; j++)
			{
				if (classAVars[j].charAt(0) == destination && classAVars[j].charAt(0) != seat)
				{
					occupied = true;
					System.out.println("Classroom #1: Alarm (Sensor 1) Student " + i + " visits Student " + j + "s desk");
					System.out.println("Classroom #1: Student " + i + " returns to designated desk");
				}
			}
			if (occupied == false && destination != '0')
			{
				System.out.println("Classroom #1: Student " + i + " visits Rectangle " + destination);
				System.out.println("Classroom #1: Student " + i + " returns to designated desk");
			}
		}
		
		
		//Visit logic (Classroom #2)
		for (int i = 1; i <= classBNumStudents; i++)
		{
			char destination = classBVars[i].charAt(4);
			char seat = classBVars[i].charAt(0);
			boolean occupied = false;
			for (int j = 1; j <= classBNumStudents; j++)
			{
				if (classBVars[j].charAt(0) == destination && classBVars[j].charAt(0) != seat)
				{
					occupied = true;
					System.out.println("Classroom #2: Alarm (Sensor 1) Student " + i + " visits Student " + j + "s desk");
					System.out.println("Classroom #2: Student " + i + " returns to designated desk");
				}
			}
			if (occupied == false && destination != '0')
			{
				System.out.println("Classroom #2: Student " + i + " visits Rectangle " + destination);
				System.out.println("Classroom #2: Student " + i + " returns to designated desk");
			}
		}
		
		
		//Visit logic (Classroom #3)
		for (int i = 1; i <= classCNumStudents; i++)
		{
			char destination = classCVars[i].charAt(4);
			char seat = classCVars[i].charAt(0);
			boolean occupied = false;
			for (int j = 1; j <= classCNumStudents; j++)
			{
				if (classCVars[j].charAt(0) == destination && classCVars[j].charAt(0) != seat)
				{
					occupied = true;
					System.out.println("Classroom #3: Alarm (Sensor 1) Student " + i + " visits Student " + j + "s desk");
					System.out.println("Classroom #3: Student " + i + " returns to designated desk");
				}
			}
			if (occupied == false && destination != '0')
			{
				System.out.println("Classroom #3: Student " + i + " visits Rectangle " + destination);
				System.out.println("Classroom #3: Student " + i + " returns to designated desk");
			}
		}
				
		
		
		
		//Lysol After Class (Classroom #1)
		for (int i = 1; i <= classANumStudents; i++)
		{
			if (classAVars[i].charAt(5) == '1')
			{
				System.out.println("Classroom #1: Student " + i + " applied Lysol after class");
			}
			else {
				System.out.println("Classroom #1: Alarm (Sensor 3) Student " + i + " did not apply Lysol after class");
			}
		}
		if (classAVars[classANumStudents+1].charAt(3) == '1')
		{
			System.out.println("Classroom #1: Teacher applied Lysol before class");
		}
		else {
			System.out.println("Classroom #1: Alarm (Sensor 3) Teacher did not apply Lysol before class");
		}

		
		//Lysol After Class (Classroom #2)
		for (int i = 1; i <= classBNumStudents; i++)
		{
			if (classBVars[i].charAt(5) == '1')
			{
				System.out.println("Classroom #2: Student " + i + " applied Lysol after class");
			}
			else {
				System.out.println("Classroom #2: Alarm (Sensor 3) Student " + i + " did not apply Lysol after class");
			}
		}
		if (classBVars[classBNumStudents+1].charAt(3) == '1')
		{
			System.out.println("Classroom #2: Teacher applied Lysol after class");
		}
		else {
			System.out.println("Classroom #2: Alarm (Sensor 3) Teacher did not apply Lysol after class");
		}
		
		//Lysol After Class (Classroom #3)
		for (int i = 1; i <= classCNumStudents; i++)
		{
			if (classCVars[i].charAt(5) == '1')
			{
				System.out.println("Classroom #3: Student " + i + " applied Lysol after class");
			}
			else {
				System.out.println("Classroom #3: Alarm (Sensor 3) Student " + i + " did not apply Lysol after class");
			}
		}
		if (classAVars[classCNumStudents+1].charAt(3) == '1')
		{
			System.out.println("Classroom #3: Teacher applied Lysol after class");
		}
		else {
			System.out.println("Classroom #3: Alarm (Sensor 3) Teacher did not apply Lysol after class");
		}
		
		
		
		
		
		//HandSanitizer After Class (Classroom #1)
		for (int i = 1; i <= classANumStudents; i++)
		{
			if (classAVars[i].charAt(6) == '1')
			{
				System.out.println("Classroom #1: Student " + i + " applied Hand Sanitizer after class");
			}
			else {
				System.out.println("Classroom #1: Alarm (Sensor 4) Student " + i + " did not apply Hand Sanitizer after class");
			}
		}
		if (classAVars[classANumStudents+1].charAt(4) == '1')
		{
			System.out.println("Classroom #1: Teacher applied Hand Sanitizer before class");
		}
		else {
			System.out.println("Classroom #1: Alarm (Sensor 4) Teacher did not apply Hand Sanitizer before class");
		}

		
		//HandSanitizer After Class (Classroom #2)
		for (int i = 1; i <= classBNumStudents; i++)
		{
			if (classBVars[i].charAt(6) == '1')
			{
				System.out.println("Classroom #2: Student " + i + " applied Hand Sanitizer after class");
			}
			else {
				System.out.println("Classroom #2: Alarm (Sensor 4) Student " + i + " did not apply Hand Sanitizer after class");
			}
		}
		if (classBVars[classBNumStudents+1].charAt(4) == '1')
		{
			System.out.println("Classroom #2: Teacher applied Hand Sanitizer after class");
		}
		else {
			System.out.println("Classroom #2: Alarm (Sensor 4) Teacher did not apply Hand Sanitizer after class");
		}
		
		//HandSanitizer After Class (Classroom #3)
		for (int i = 1; i <= classCNumStudents; i++)
		{
			if (classCVars[i].charAt(6) == '1')
			{
				System.out.println("Classroom #3: Student " + i + " applied Hand Sanitizer after class");
			}
			else {
				System.out.println("Classroom #3: Alarm (Sensor 4) Student " + i + " did not apply Hand Sanitizer after class");
			}
		}
		if (classAVars[classCNumStudents+1].charAt(4) == '1')
		{
			System.out.println("Classroom #3: Teacher applied Hand Sanitizer after class");
		}
		else {
			System.out.println("Classroom #3: Alarm (Sensor 4) Teacher did not apply Hand Sanitizer after class");
		}
		
		
		
		
		
		//Leaving Classroom #1
		for (int i = 1; i <= classANumStudents; i++)
		{
				System.out.println("Classroom #1: Student " + i + " has left the classroom");
		}
		System.out.println("Classroom #1: Teacher has left the classroom");
		
		//Leaving Classroom #2
		for (int i = 1; i <= classBNumStudents; i++)
		{
				System.out.println("Classroom #2: Student " + i + " has left the classroom");
		}
		System.out.println("Classroom #2: Teacher has left the classroom");
		
		//Leaving Classroom #3
		for (int i = 1; i <= classCNumStudents; i++)
		{
				System.out.println("Classroom #3: Student " + i + " has left the classroom");
		}
		System.out.println("Classroom #3: Teacher has left the classroom");
		
		
		
		
		
		
		
		
		
		
		
		
		
		return "Ran Simulation";
	}
 
}