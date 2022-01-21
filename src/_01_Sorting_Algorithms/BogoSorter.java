package _01_Sorting_Algorithms;

import java.util.Random;

import _00_Intro_to_Sorting_Algorithms._01_SortedArrayChecker;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
   
    	Random a = new Random();
    	
    	while(!_01_SortedArrayChecker.intArraySorted(array)) {
    	
        	
        		int x1= a.nextInt(array.length);
        		int x2 = a.nextInt(array.length);
        		int holder = array[x1];
        		array[x1] = array[x2];
        		array[x2] = holder;	
        		display.updateDisplay();
        	
        
    	}
    	display.updateDisplay();
    	
    }
}
