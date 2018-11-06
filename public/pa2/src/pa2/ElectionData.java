package pa2;
import java.util.*;
import java.io.File;
import java.io.IOException;


public class ElectionData {
	ArrayList<CountyElectionResult> countyResults2012;
	ArrayList<CountyElectionResult> countyResults2016;
	public void parseElectionFile(String filename) throws IOException{
		
	
	}
	
	private void parseLine(String line){
		Scanner dataScanner = new Scanner(new File(filename));
		List<List<String>>County2012 = new ArrayList<List<String>>();
		List<String>CountyElectionResults2012 = new ArrayList<String>();
		
		List<List<String>>County2016 = new ArrayList<List<String>>();
		List<String>CountyElectionResults2016 = new ArrayList<String>();
		
		while (dataScanner.hasNextLine()){
			 line = dataScanner.nextLine();
			 String[] results = line.split(",");
		}
		
	}
	
	
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
		
while(!choice.equals("0")&& !choice.equals("1") && !choice.equals("2")&& !choice.equals("3")&& !choice.equals("4")&& !choice.equals("5")){
	printMenu();
	
	choice = input.nextLine();
	}

 while(choice.equals("1")){
	
	 System.out.println("You have entered: " + choice);
	 choice = input.nextLine();
 }
 while(choice.equals("2")){
	 System.out.println("You have entered: "+ choice);
	 choice = input.nextLine();
 }
 while (choice.equals("3")){
	 System.out.println("You have entered: "+ choice);
	 choice = input.nextLine();
 }
 while (choice.equals("4")){
	 System.out.print("You have entered: "+ choice);
	 choice = input.nextLine();
 }
 while (choice.equals("5")){
	 System.out.println("TROLOLOLOL");
	 choice= input.nextLine();
 }
 while ( choice.equals("0")){
	 System.out.println("Goodbye");
	 choice = input.nextLine();
 }
}
	
	public static void main(String[] args){
		
		
	
		
	}
}
