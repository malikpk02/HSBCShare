package testpolymorphism;

public class Employee extends Person {
  private int empId;
  private double empSalary;
   public Employee(int empId,double empSalary)
   {
	   super();
	   this.empId=empId;
	   this.empSalary=empSalary;
   }
   public Employee(String empName,String empAddress,int empId,double empSalary)
   {
	   super(empName,empAddress);
	   this.empId=empId;
	   this.empSalary=empSalary;
   }
   public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public void display()
{
	System.out.println("Employee Details");
	System.out.println("Employee Id : "+this.getEmpId());
	System.out.println("Employee Name : "+this.getPersonName());
	System.out.println("Employee Salary : "+this.getEmpSalary());
	System.out.println("Employee Address : "+this.getPersonAddress());
}
   
}
