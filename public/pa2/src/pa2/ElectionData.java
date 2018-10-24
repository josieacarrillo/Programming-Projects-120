package pa2;
import java.util.*;
public class ElectionData {
	
	public static void printMenu(){
		System.out.println("What would you like to know?"+ " "+ "Enter the number corresponding to your choice.");
		System.out.println("	"+"1"+"  	" + "Most lopsided county between dem and rep (param: year)");
		System.out.println("	"+"2"+"       "+   "How many counties align with the actual winner (param: year, param: state)");
		System.out.println("        "+"3"+"       "	+ "State with max percent of votes for 3rd party candidate (param: year)");
		System.out.println("        "+ "4"+" 	"+"Which states switched party affiliation between 2012 and 2016");
		System.out.println("        "+"5"+ "       "+ "How many licks does it it take to get to the center of a tootsie pop");
		System.out.println("        " + "0"+ "       "+ "Quit");
	}
	

	public static void runLoop(){
		Scanner input = new Scanner(System.in);
		String choice = "";
		printMenu();
		choice = input.nextLine();
		if(choice.equals("0")){
			System.out.println("Goodbye");
		}
		if(choice.equals("1")){
			System.out.println("You have entered number 1");
		}
		if(choice.equals("2")){
			System.out.println("You have entered number 2");
		}
		if(choice.equals("3")){
			System.out.println("You have entered number 3");
		}
		if(choice.equals("4")){
			System.out.println("You have entered number 4");
		}
		if(choice.equals("5")){
			System.out.println("TROLOLOLOLOLOL!!!!!");
		}
	  if (!choice.equals("0")&& !choice.equals("1")&& !choice.equals("2")&& !choice.equals("3")&&!choice.equals("4")&&!choice.equals("5")){
			System.out.println("You entered an invalid choice.  Please try again");
			printMenu();
			
			
			
		}
			
		}
		
		
	
	public static void main(String[] args){
		runLoop();
	}
}
