package hw3Q2JavaVariables;

/*(2) Create a package name "hw3Q2JavaVariables" inside the Home work project, Create a Class name "AboutMe". Declare only one type of variable(so you know declare vs initialize), and initialize String and other 8 types of variable (you can give a different name from mine). Instantiate AboutMe class under main method and call few variables by object (you can use String concatenation to make it more meaningful outcome). Give a single line comment where a variable is declared and initialized. Follow indentation by Organizing the code and paste below. [Mark distribution (80) : using variable --20, instantiate class - 20, call variables by object and print a meaningful outcome 20, comment for variable is declared and initialized - 10, organize code and other-- 10]
 */

public class AboutMe {
	//variable is initialized 
	public String name ;
	public int age = 30;
	public short myYearlyHouseRent = 599;
	public int myYearlySalary = 5688;
	public long myBankBalance = 68970970;
	public float myHeight = 7.689f;
	public double myGrade = 587;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
	AboutMe abtMe = new AboutMe(); // about me class instantiated 
	abtMe.name = "Eunib-Rabby";
	
	
	
	//System.out.println("My name is " + abtMe.name + "My age is " + abtMe.age);
	
	System.out.println("My name is " + abtMe.name + "\n  My age is " + abtMe.age +"\n My Yearly House Rent is " + abtMe.myYearlyHouseRent + "\n My Yearly Salary is " + abtMe.myYearlySalary + "\n my bank balance: " + abtMe.myBankBalance + "\n my height: " + abtMe.myHeight);
	
	//System.out.println("My name is " + name + "\ n My age is " + age +" \n My Yearly House Rent is " + myYearlyHouseRent + "\n My Yearly Salary is" + myYearlySalary + "\n my bank balance: " + myBankBalance + "\n my height: " + myHeight);
	}
	

}
