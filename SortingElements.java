package trialtest;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortingElements {

	
	public SortingElements() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Printing the file passed in:");
	        int count = 0;
	        
	        Set<String> uniqValues = new TreeSet<String>();
	        
	        // Maximum number of the Count.
	        int maxCount = 0;
	        while(sc.hasNextLine()) {
	        	final String nextLine = sc.nextLine();
	        	if(count==0){
	        		maxCount = Integer.parseInt(nextLine);
	        		count++;
	        		continue;
	        	}
	        	uniqValues.add(nextLine);
	        	if(maxCount == count){
	        		break;
	        	}
	        	count++;
	        	
	        }
	        
        	for (Iterator<String> iterator = uniqValues.iterator(); iterator.hasNext();) {
        		String eachUniqValueStr = (String) iterator.next();
        		System.out.println(eachUniqValueStr);
        		
        	}
		
	}

}
