package pa2;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ElectionData {
	
	ArrayList<CountyElectionResult> countyResults2012;
	ArrayList<CountyElectionResult> getCountyResults2012;
	//return countyResults2012;
	ArrayList<CountyElectionResult> countyResults2016;
	ArrayList<CountyElectionResult> getCountyResults2016;
	public ElectionData(){
		countyResults2012 = new ArrayList<CountyElectionResult>();
		countyResults2016 = new ArrayList<CountyElectionResult>();
		
	}
	
	public void parseElectionFile(String filename) throws IOException{
		File allData = new File(filename);
		Scanner dataScanner = new Scanner(allData);
		while (dataScanner.hasNextLine()){
			String line = dataScanner.nextLine();
			
	}
		
	
	private void parseLine(String line){
	
		ArrayList<ArrayList<String>>County2012 = new ArrayList<ArrayList<String>>();
		ArrayList<String>CountyElectionResults2012 = new ArrayList<String>();
		
		ArrayList<ArrayList<String>>County2016 = new ArrayList<ArrayList<String>>();
		ArrayList<String>CountyElectionResults2016 = new ArrayList<String>();
		
		
			 String[] results = line.split(",");
			 
				 CountyElectionResults2012.add(results[5]);
				 CountyElectionResults2012.add(results[6]);
				 CountyElectionResults2012.add(results[7]);
				 
				 CountyElectionResults2016.add(results[8]);
				 CountyElectionResults2016.add(results[9]);
				 CountyElectionResults2016.add(results[10]);
					 
				 
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
 input.close();
}
	
	public static void main(String[] args){
		
		
	
		
	}
}
