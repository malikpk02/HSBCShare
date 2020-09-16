package testpolymorphism;

public class Test {
   public static void show(Person p)
   {
	   p.display();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1=new Person("Rubal ","Pune");
       Person p2=new Employee("Pankaj Malik","Ambala",100,8745.00);
       Person p3=new Student("Raj","Patna",101,566.5);
       show(p1);
       show(p2);
       show(p3);
	}

}
