package hw9Q2Encapsulation;

/* How can you access those variables by the getter and setter method? In EmployeeTest class, Please execute those variables by the help of getters and setters method and print Employee info (Use necessary String to make the outcome meaningful, you can also use \n if you want). Paste the GitHub link below.*/
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("john");
		employee.setAge(20);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Name : "+employee.getName()+"\nAge : "+employee.getAge()
		+"\nSex : "+employee.getSex()+"\nIs us citizen :"+employee.isUsCitizen());
	}
}
