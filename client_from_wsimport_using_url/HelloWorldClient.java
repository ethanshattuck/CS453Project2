import myhelloworld.HelloWorld;
import myhelloworld.HelloWorldImplService;
import java.util.*;


public class HelloWorldClient {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
    	String roomA, roomB, roomC, teacher1,teacher2, teacher3, tempS;     //string vars to hold data for everything and a temporary String
    	
    	
    	/****************************************
    	Data for roomA
    	****************************************/
    	System.out.println("Please enter the following data for Classroom A:");
    	System.out.print("Number of students (1-5): ");
    	roomA = input.nextLine();
    	int num = Integer.parseInt(roomA);
    	
    	//Handling incorrect input from the user
    	if(num < 1 || num > 5){
    	    System.out.println("Error: Please enter an integer between 1 and 5: ");
    	    roomA = input.nextLine();
    	    num = Integer.parseInt(roomA);
    	}
    	
    	//seatNumber: 0, maskOn: 1, lysolBefore: 2, question: 3, visit: 4, lysolAfter: 5, handSanitizer: 6
        
        
    	//looping through each student to acquire configurable data
    	for(int i = 1; i <= num; i++){
    	    System.out.println("\nFor Student " + i + " in Classroom A:");
    	    //seatNumber
    	    System.out.print("Which desk would you like the student to sit at(1-5): ");
    	    roomA = roomA + " " + input.nextLine();
    	    //maskOn
    	    System.out.print("Are they wearing a mask(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomA = roomA + "1";
    	    else if(tempS.equals("n"))
    	        roomA = roomA + "0";
    	    else{
    	        roomA = roomA + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //lysolBefore
    	    System.out.print("Did they apply lysol before being seated(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomA = roomA + "1";
    	    else if(tempS.equals("n"))
    	        roomA = roomA + "0";
    	    else{
    	        roomA = roomA + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //question
    	    System.out.print("Did they approach the question rectangle to ask a question(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomA = roomA + "1";
    	    else if(tempS.equals("n"))
    	        roomA = roomA + "0";
    	    else{
    	        roomA = roomA + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //visit
    	    System.out.print("Did they visit another desk during class(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y")){
    	        System.out.print("Which other desk did they visit(1-5): ");
    	        roomA = roomA + "" + input.nextLine();
    	    }
    	    else if(tempS.equals("n"))
    	        roomA = roomA + "0";    //no gives a zero
    	        
    	    //lysolAfter
    	    System.out.print("Did they apply lysol after class ended(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomA = roomA + "1";
    	    else if(tempS.equals("n"))
    	        roomA = roomA + "0";
    	    else{
    	        roomA = roomA + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //handSanitizer
    	    System.out.print("Did they apply hand sanitizer before exiting the classroom(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomA = roomA + "1";
    	    else if(tempS.equals("n"))
    	        roomA = roomA + "0";
    	    else{
    	        roomA = roomA + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	}
    	
    	/****************************************
    	Data for roomB
    	****************************************/
    	System.out.println("\nPlease enter the following data for Classroom B:");
    	System.out.print("Number of students (1-5): ");
    	roomB = input.nextLine();
    	num = Integer.parseInt(roomB);
    	
    	//Handling incorrect input from the user
    	if(num < 1 || num > 5){
    	    System.out.println("Error: Please enter an integer between 1 and 5: ");
    	    roomB = input.nextLine();
    	    num = Integer.parseInt(roomB);
    	}
    	
    	//looping through each student to acquire configurable data
    	for(int i = 1; i <= num; i++){
    	    System.out.println("\nFor Student " + i + " in Classroom B:");
    	    //seatNumber
    	    System.out.print("Which desk would you like the student to sit at(1-5): ");
    	    roomB = roomB + " " + input.nextLine();
    	    //maskOn
    	    System.out.print("Are they wearing a mask(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomB = roomB + "1";
    	    else if(tempS.equals("n"))
    	        roomB = roomB + "0";
    	    else{
    	        roomB = roomB + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //lysolBefore
    	    System.out.print("Did they apply lysol before being seated(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomB = roomB + "1";
    	    else if(tempS.equals("n"))
    	        roomB = roomB + "0";
    	    else{
    	        roomB = roomB + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //question
    	    System.out.print("Did they approach the question rectangle to ask a question(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomB = roomB + "1";
    	    else if(tempS.equals("n"))
    	        roomB = roomB + "0";
    	    else{
    	        roomB = roomB + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //visit
    	    System.out.print("Did they visit another desk during class(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y")){
    	        System.out.print("Which other desk did they visit(1-5): ");
    	        roomB = roomB + "" + input.nextLine();
    	    }
    	    else if(tempS.equals("n"))
    	        roomB = roomB + "0";    //no gives a zero
    	        
    	    //lysolAfter
    	    System.out.print("Did they apply lysol after class ended(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomB = roomB + "1";
    	    else if(tempS.equals("n"))
    	        roomB = roomB + "0";
    	    else{
    	        roomB = roomB + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //handSanitizer
    	    System.out.print("Did they apply hand sanitizer before exiting the classroom(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomB = roomB + "1";
    	    else if(tempS.equals("n"))
    	        roomB = roomB + "0";
    	    else{
    	        roomB = roomB + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	}
    	
    	
    	/****************************************
    	Data for roomC
    	****************************************/
    	System.out.println("\nPlease enter the following data for Classroom C:");
    	System.out.print("Number of students (1-5): ");
    	roomC = input.nextLine();
    	num = Integer.parseInt(roomC);
    	
    	//Handling incorrect input from the user
    	if(num < 1 || num > 5){
    	    System.out.println("Error: Please enter an integer between 1 and 5: ");
    	    roomC = input.nextLine();
    	    num = Integer.parseInt(roomC);
    	}
    	
    	//looping through each student to acquire configurable data
    	for(int i = 1; i <= num; i++){
    	    System.out.println("\nFor Student " + i + " in Classroom C:");
    	    //seatNumber
    	    System.out.print("Which desk would you like the student to sit at(1-5): ");
    	    roomC = roomC + " " + input.nextLine();
    	    //maskOn
    	    System.out.print("Are they wearing a mask(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomC = roomC + "1";
    	    else if(tempS.equals("n"))
    	        roomC = roomC + "0";
    	    else{
    	        roomC = roomC + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //lysolBefore
    	    System.out.print("Did they apply lysol before being seated(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomC = roomC + "1";
    	    else if(tempS.equals("n"))
    	        roomC = roomC + "0";
    	    else{
    	        roomC = roomC + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //question
    	    System.out.print("Did they approach the question rectangle to ask a question(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomC = roomC + "1";
    	    else if(tempS.equals("n"))
    	        roomC = roomC + "0";
    	    else{
    	        roomC = roomC + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //visit
    	    System.out.print("Did they visit another desk during class(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y")){
    	        System.out.print("Which other desk did they visit(1-5): ");
    	        roomC = roomC + "" + input.nextLine();
    	    }
    	    else if(tempS.equals("n"))
    	        roomC = roomC + "0";    //no gives a zero
    	        
    	    //lysolAfter
    	    System.out.print("Did they apply lysol after class ended(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomC = roomC + "1";
    	    else if(tempS.equals("n"))
    	        roomC = roomC + "0";
    	    else{
    	        roomC = roomC + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	    //handSanitizer
    	    System.out.print("Did they apply hand sanitizer before exiting the classroom(y or n): ");
    	    tempS = input.nextLine();
    	    if(tempS.equals("y"))
    	        roomC = roomC + "1";
    	    else if(tempS.equals("n"))
    	        roomC = roomC + "0";
    	    else{
    	        roomC = roomC + "1";    //if incorrect input, just passing a 1 to keep simulation running
    	        System.out.println("I'll take that as a yes.");
    	    }
    	}
    	
    	/************************
    	 Data for teacher1
    	 ************************/
    	 //teacher: maskOn: 0, lysolBefore: 1, question: 2, lysolAfter: 3 handSanitizer: 4
    	 teacher1 = "1 ";
    	 
    	 System.out.println("\nPlease enter the following data for the teacher:");
    	 //maskOn
	    System.out.print("Are they wearing a mask(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher1 = teacher1 + "1";
	    else if(tempS.equals("n"))
	        teacher1 = teacher1 + "0";
	    else{
	        teacher1 = teacher1 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //lysolBefore
	    System.out.print("Did they apply lysol before being seated(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher1 = teacher1 + "1";
	    else if(tempS.equals("n"))
	        teacher1 = teacher1 + "0";
	    else{
	        teacher1 = teacher1 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //question
	    System.out.print("Did they approach the question rectangle(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher1 = teacher1 + "1";
	    else if(tempS.equals("n"))
	        teacher1 = teacher1 + "0";
	    else{
	        teacher1 = teacher1 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //lysolAfter
	    System.out.print("Did they apply lysol after class ended(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher1 = teacher1 + "1";
	    else if(tempS.equals("n"))
	        teacher1 = teacher1 + "0";
	    else{
	        teacher1 = teacher1 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //handSanitizer
	    System.out.print("Did they apply hand sanitizer before exiting the classroom(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher1 = teacher1 + "1";
	    else if(tempS.equals("n"))
	        teacher1 = teacher1 + "0";
	    else{
	        teacher1 = teacher1 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    
	    /************************
    	 Data for teacher2
    	 ************************/
    	 //teacher: maskOn: 0, lysolBefore: 1, question: 2, lysolAfter: 3 handSanitizer: 4
    	 teacher2 = "2 ";
    	 
    	 System.out.println("\nPlease enter the following data for the teacher:");
    	 //maskOn
	    System.out.print("Are they wearing a mask(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher2 = teacher2 + "1";
	    else if(tempS.equals("n"))
	        teacher2 = teacher2 + "0";
	    else{
	        teacher2 = teacher2 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //lysolBefore
	    System.out.print("Did they apply lysol before being seated(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher2 = teacher2 + "1";
	    else if(tempS.equals("n"))
	        teacher2 = teacher2 + "0";
	    else{
	        teacher2 = teacher2 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //question
	    System.out.print("Did they approach the question rectangle(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher2 = teacher2 + "1";
	    else if(tempS.equals("n"))
	        teacher2 = teacher2 + "0";
	    else{
	        teacher2 = teacher2 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //lysolAfter
	    System.out.print("Did they apply lysol after class ended(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher2 = teacher2 + "1";
	    else if(tempS.equals("n"))
	        teacher2 = teacher2 + "0";
	    else{
	        teacher2 = teacher2 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //handSanitizer
	    System.out.print("Did they apply hand sanitizer before exiting the classroom(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher2 = teacher2 + "1";
	    else if(tempS.equals("n"))
	        teacher2 = teacher2 + "0";
	    else{
	        teacher2 = teacher2 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    
	    /************************
    	 Data for teacher3
    	 ************************/
    	 //teacher: maskOn: 0, lysolBefore: 1, question: 2, lysolAfter: 3 handSanitizer: 4
    	 teacher3 = "3 ";
    	 
    	 System.out.println("\nPlease enter the following data for teacher3:");
    	 //maskOn
	    System.out.print("Are they wearing a mask(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher3 = teacher3 + "1";
	    else if(tempS.equals("n"))
	        teacher3 = teacher3 + "0";
	    else{
	        teacher3 = teacher3 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //lysolBefore
	    System.out.print("Did they apply lysol before being seated(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher3 = teacher3 + "1";
	    else if(tempS.equals("n"))
	        teacher3 = teacher3 + "0";
	    else{
	        teacher3 = teacher3 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //question
	    System.out.print("Did they approach the question rectangle(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher3 = teacher3 + "1";
	    else if(tempS.equals("n"))
	        teacher3 = teacher3 + "0";
	    else{
	        teacher3 = teacher3 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //lysolAfter
	    System.out.print("Did they apply lysol after class ended(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher3 = teacher3 + "1";
	    else if(tempS.equals("n"))
	        teacher3 = teacher3 + "0";
	    else{
	        teacher3 = teacher3 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
	    //handSanitizer
	    System.out.print("Did they apply hand sanitizer before exiting the classroom(y or n): ");
	    tempS = input.nextLine();
	    if(tempS.equals("y"))
	        teacher3 = teacher3 + "1";
	    else if(tempS.equals("n"))
	        teacher3 = teacher3 + "0";
	    else{
	        teacher3 = teacher3 + "1";    //if incorrect input, just passing a 1 to keep simulation running
	        System.out.println("I'll take that as a yes.");
	    }
    	 
    	 
    	 
    	//String response = myinterface.runSimulation(roomA, roomB, roomC, teacherData);
    	
    	System.out.println();
        System.out.println(roomA);
        System.out.println(roomB);
        System.out.println(roomC);
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);
	}
}
