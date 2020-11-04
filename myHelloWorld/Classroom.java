package myHelloWorld;

import java.util.ArrayList;

public class Classroom {
	public Classroom(ArrayList<Student> Students)
	{
		this.Students = Students;
	}
	
	public ArrayList<Student> getStudents()
	{
		return Students;
	}
	
	ArrayList<Student> Students;
}