package myHelloWorld;

public class Student {
	public Student(int seatNumber, boolean maskOn, boolean lysolBefore, boolean question, boolean visit, boolean lysolAfter, boolean handSantizer)
	{
		this.seatNumber = seatNumber;
		this.maskOn = maskOn;
		this.lysolBefore = lysolBefore;
		this.question = question;
		this.visit = visit;
		this.lysolAfter = lysolAfter;
		this.handSanitizer = handSantizer;
	}
	
	public int getSeatNumber()
	{
		return seatNumber;
	}
	
	public void setSeatNumber(int seatNumber)
	{
		this.seatNumber = seatNumber;
	}
	
	public boolean getMaskOn()
	{
		return maskOn;
	}
	
	public void setMaskOn(boolean maskOn)
	{
		this.maskOn = maskOn;
	}
	
	public boolean getLysolBefore()
	{
		return lysolBefore;
	}
	
	public void setLysolBefore(boolean lysolBefore)
	{
		this.lysolBefore = lysolBefore;
	}
	
	public boolean getQuestion()
	{
		return question;
	}
	
	public void setQuestion(boolean question)
	{
		this.question = question;
	}
	
	public boolean getVisit()
	{
		return visit;
	}
	
	public void setVisit(boolean visit)
	{
		this.visit = visit;
	}
	
	public boolean getLysolAfter()
	{
		return lysolAfter;
	}
	
	public void setLysolAfter(boolean lysolAfter)
	{
		this.lysolAfter = lysolAfter;
	}
	
	public boolean getHandSanitizer()
	{
		return handSanitizer;
	}
	
	public void setHandSanitizer(boolean handSanitizer)
	{
		this.handSanitizer = handSanitizer;
	}
	
	
	int seatNumber;
	boolean maskOn;
	boolean lysolBefore;
	boolean question;
	boolean visit;
	boolean lysolAfter;
	boolean handSanitizer;
}