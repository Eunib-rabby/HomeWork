package hw8Q3Abstraction;
/*Print something inside the non-abstract or implemented method. Can you create a Constructor inside MedicalSchool Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?*/
public abstract class NursingSchool {
	//This is an abstract method.
		public abstract void hygiene();

		// This is a non-abstract method.
		public void caring() {
System.out.println("This is another implemented method");
		}
}