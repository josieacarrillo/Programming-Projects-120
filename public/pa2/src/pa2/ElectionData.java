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
		stateResults2012 = new ArrayList<StateElectionResult>();
		stateResults2016 = new ArrayList<StateElectionResult>();
		
	}
	
	public void parseElectionFile(String filename) throws IOException{
		File allData = new File(filename);
		Scanner dataScanner = new Scanner(allData);
		ArrayList<String> fileArr = new ArrayList<String>();
		
		while (dataScanner.hasNextLine()){
			fileArr.add(dataScanner.nextLine());
			
	}
		for (int i = 0; i < fileArr.size(); i++){
			parseLine(fileArr.get(i));
		}
	dataScanner.close();

	}
	
	private void parseLine(String line) {
		CountyElectionResult result2012 = new CountyElectionResult("","","","",0,0,0);
		CountyElectionResult result2016 = new CountyElectionResult("","","","",0,0,0);
		
		
			 String[] results = line.split(",");
			 
			 result2012.setState(results[0]);
				result2012.setCounty(results[1]);
				result2012.setFips(results[2]);
				result2012.setYear("2012");
				 
				result2016.setState(results[0]);
				result2016.setCounty(results[1]);
				result2016.setFips(results[2]);
				result2016.setYear("2016");
					
				 
			 }
				 
			 
		
		
	

	public static void printMenu(){
		System.out.println("What would you like to know?"+ " "+ "Enter the number corresponding to your choice.");
		System.out.println("	"+"1"+"  	" + "Most lopsided county between dem and rep (param: year)");
		System.out.println("	"+"2"+"       "+   "How many counties align with the actual winner (param: year, param: state)");
		System.out.println("        "+"3"+"       "	+ "State with max percent of votes for 3rd party candidate (param: year)");
		System.out.println("        "+ "4"+" 	"+"Which states switched party affiliation between 2012 and 2016");
		System.out.println("        "+"5"+ "       "+ "How many licks does it it take to get to the center of a tootsie pop");
		System.out.println("        " + "0"+ "       "+ "Quit");
		System.out.println("Enter your choice");
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
		
		if (args.length < 1) {
			System.out.println("No data file passed in");
			return;
		}
		
		ElectionData data = new ElectionData();
		
		try {
			data.parseElectionFile(args[0]);
		}
		catch (IOException e) {
			System.out.println("There was a problem with the data file");
			e.printStackTrace();
			return;
		}
		
		data.runLoop();
		
	}
	
		
	}
}
