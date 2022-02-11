package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int ans = num1*num2;
        return num1 + " x " + num2 + " = " + ans;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
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
