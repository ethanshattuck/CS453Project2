package myHelloWorld;

import java.util.ArrayList;

public class Classroom {
	
	public Classroom()
	{
	}
	
	public Classroom(ArrayList<Student> Students)
	{
		this.Students = Students;
	}
	
	public void addStudent(Student student)
	{
		if (Students == null)
		{
			Students = new ArrayList<Student>();
		}
		Students.add(student);
	}
	
	public ArrayList<Student> getStudents()
	{
		return Students;
	}
	
	ArrayList<Student> Students;
}