package testpolymorphism;

public class Student extends Person {
     private int studentId;
     private double studentMarks;
    public Student(int studentId,double studentMarks)
    {
    	this.studentId = studentId;
    	this.studentMarks = studentMarks;
    }
    public Student(String studentName,String studentAddress,int studentId,double studentMarks)
    {
    	super(studentName,studentAddress);
    	this.studentId = studentId;
    	this.studentMarks = studentMarks;
    }
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("Student Id : "+this.getStudentId());
		System.out.println("Student Name : "+this.getPersonName());
		System.out.println("Student Marks : "+this.getStudentMarks());
		System.out.println("Student Address : "+this.getPersonAddress());
	}
}
