import java.util.Scanner;
import java.util.*;
import java.io.*;


public class MediaList {
	
	public MediaList() {
		
	}
	
	public static void main(String[] args) {

		Scanner n;
		
		if(0 < args.length) {
			n = openFile(args[0]);
		}else {
			n = openFile(promptForFileName());
		}
		
		ArrayList<DigitalMedia> media = new ArrayList<DigitalMedia>();

	}
	
	private static String promptForFileName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String str = scan.nextLine();
		
		return str;
	}
	
	private static Scanner openFile(String s) {
	File newFile = new File(s);
	Scanner rock = new Scanner(System.in);
	
	try {
		rock = new Scanner(newFile);
		return rock;
		
	} catch (FileNotFoundException e) {
		System.out.println("File Not Found");
		e.printStackTrace();
	}

	return rock;
	}
	
	public static void displayOptions() {
		
		Scanner in = new Scanner(System.in);
	
		
	}
	
	


}
