package hw9Q2Encapsulation;

/* How can you access those variables by the getter and setter method? In EmployeeTest class, Please execute those variables by the help of getters and setters method and print Employee info (Use necessary String to make the outcome meaningful, you can also use \n if you want). Paste the GitHub link below.*/
public class Employee { 
//Declared private variable 
private String name ;
private int age ; 
private char sex ; 
private boolean usCitizen ;

public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}

public void setAge(int age) {
	this.age = age;
}
public int getAge() {
	return age;
}

public void setSex(char sex) {
	this.sex = sex;
}
public char getSex() {
	return sex;
}

public void setUsCitizen(boolean usCitizen) {
	this.usCitizen = usCitizen;
}
public boolean isUsCitizen() {
	return usCitizen;
}


}
