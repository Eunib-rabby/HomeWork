package hw8Q3Abstraction;

/* Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub. d) Create interface VocationalSchool and a method vocationalInfo inside it. e) Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. f) Create another interface LawSchool and a method lawInfo inside it. Now, Can you create a Constructor inside University interface? If yes, create default Constructor on University interface. If no, comment out the 'created constructor' and answer why not?*/
public interface University {

// Answer: 
	
//	 public University() {
//	 }                          //Inside interface we can't implement a Constructor or a method.
	 

	// Method is declared
	public void classSize();

	public void playGround();

	public  void teacher();
	// public void biochemistryLab() { method cannot be implemented in interface,
	// can only be declared
}
