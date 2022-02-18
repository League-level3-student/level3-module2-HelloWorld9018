package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
// SERACHING AND SORTING ALGORITHMS
    
    public static int findBrokenEgg(List<String> eggs) {
    	int brokenIndex = 0;
    	for(int i = 0; i < eggs.size(); i++) {
    		if(eggs.get(i) == "cracked") {
    			brokenIndex = i;
    			break;
    		}
    	}
        return brokenIndex;
    }
    
    public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
    	int pearlCount = 0;
    	for(int i = 0; i<oysters.size(); i++) {
    		if(oysters.get(i) == true) {
    			pearlCount++;
    		}
    	}
		return pearlCount;
	}
    
    public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
    	int longestWord = 0;
    	int index = 0;
    	for(int i  = 0; i <words.size(); i++) {
    		if(words.get(i).length() > longestWord) {
    			longestWord = words.get(i).length();
    			index = i;
    		}
    	}
		return words.get(index);
	}


    
	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		for(int a = 0 ; a < peeps.size(); a++) {
			for(int b = 0; b < peeps.size()-1; b++) {
				if(peeps.get(b) > peeps.get(b+1)) {
					double holder = peeps.get(b);
					peeps.set(b, peeps.get(b+1));
					peeps.set(b+1, holder);
				}
			}
		}
		
	/*	for(double c: peeps) {
			System.out.println(c + ", ");
		}*/
		
		return peeps.get(peeps.size()-1);
	}
	
	
	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		boolean contains = false;
		if(message1.contains("... --- ...")) {
			contains = true;
		}
		return contains;
	}


	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for(int a = 0; a<results.size(); a++) {
			for(int b = 0; b<results.size()-1; b++) {
				if(results.get(b) > results.get(b+1)) {
					double holder = results.get(b);
					results.set(b, results.get(b+1));
					results.set(b+1, holder);
				}
			}
		}
		return results;
	}
	
    
// MATH ALGORITHMS
    
    public static String multiply(int num1, int num2) {
    	int ans = num1*num2;
        return num1 + " x " + num2 + " = " + ans;
    }
    
	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		boolean result = true;
		//int[] divisors = {2, 3, 5, 7};
		
		for(int b = 2; b< i-1; b++) {
			if(i%b == 0 && i/b != 1) {
				result = false;
			}
		}
		
		return result;	
	}

	public static boolean isSquare(int i) {
		// TODO Auto-generated method stub
		int result = (int) Math.sqrt(i);
		if ((Math.pow(result, 2)) == i) {
			return true;
		}
		else {
		return false;
		}
	}

	public static boolean isCube(int i) {
		// TODO Auto-generated method stub
		int result = (int) Math.cbrt(i);
		if((Math.pow(result, 3)) == i) {
			return true;
		}
		else {
		return false;
		}
	}

}
