
public final class Employee
{
  final int empId;
  final String empName;
  final float empSalary;
  public Employee(int empId,String empName,float empSalary)
  {
     this.empId=empId;
     this.empName=empName;
     this.empSalary=empSalary;
   } 
  public int getEmpId()
  {
	  return this.empId;
  }
  public String getEmpName()
  {
	  return this.empName;
  }
  public float getEmpSalary()
  {
	  return this.empSalary;
  }
  
  public void print()
  {
	  System.out.println("Employee Id : "+this.getEmpId());
	  System.out.println("Employee Name : "+this.getEmpName());
	  System.out.println("Employee Salary : "+this.getEmpSalary());
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	     Employee emp=new Employee(100,"Pankaj",45000);
	    emp.print();
	}

	}
