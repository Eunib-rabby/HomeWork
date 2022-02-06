package hw8Q3Abstraction;
/* create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method . Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside MedicalSchool Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?*/
public abstract class MedicalSchool {
	// This is an abstract method
	public abstract void anatomyLab();
	
	// This is a non-abstract method.
	public void biochemistryLab() {
		System.out.println("This is a non-abstract or implemented method.");
	}
	// This is  default constructor
	public MedicalSchool() {
		
	}

}
