package hw2Q2JavaBasics;

/* Create a package name "hw2Q2JavaBasics"[create it by the help of header, not by right click of src file] inside the Homework project created before. Create a Class "MyCar" from the header (not by right click of package, this is the other way to create class). Under main method the first outcome will be: [My name is <your name>, I love to drive, My car info is below:]. Use String concatenation feature from above outcome[10]. Now use other syso to print your car each info (color, model, year, wheel drive [example:4WD] etc.[you can add more if you want]) in a separate line [try to follow how to copy and paste a line in IDE by key board command]. Use print instead of println for the car feature when print[20], use \n and \t at least once anywhere in the class[10]. organize code at the end [10], After completing the code, paste it below.*/
public class MyCar {

	public static void main(String[] args) {

		String name = "Eunib";

		System.out.println("My name is " + name + " ,I love to  drive," + " \nMy car info is below:");

		String colour = "Black";
		String model = "camry";
		int year=2014;
		String drive = "4WD";
		char grade='A';
		boolean    madeInJapan =true;
		
		
		System.out.println( "Colour = "+colour +"\nModel ="+model+"\nYear ="+year+"\nWheeler Drive ="+drive+"\nGrade is ="+grade+"\nThis is Made In Japan = "+madeInJapan); 
		
		
}
}