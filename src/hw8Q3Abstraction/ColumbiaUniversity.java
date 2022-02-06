package hw8Q3Abstraction;

/*Can you create a Constructor inside a regular Class? If yes, create default Constructor in ColumbiaUniversity. If no, comment out the created constructor and answer why not? Create another regular Class NYUniversity, create non-abstract method -- anthropology. Print something inside the non-abstract or implemented method. Create another regular Class RockefellerUniversity, create non-abstract method -- maths. Print something inside the non-abstract or implemented method.
*/
public abstract class ColumbiaUniversity {
	// This is an abstract method.
	public abstract void chemistry();
	public static void main (String[]args)	{ 
		
	}
	// This is a non-abstract method.
	public void biology() {
	System.out.println("this is biology");
	

	}
}