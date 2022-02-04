package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	_01_LinearSearch linear = new _01_LinearSearch();
    	String[] myStrings1 = {"Bob", "Bobby", "Bobetta", "Bobelina"};
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(1, linear.linearSearch(myStrings1, "Bobby"));
        
        String[] myStrings2 = {"asdf", "hgfu", "ytbn", "ftyens", "jhgfds", "uytrw"};
        assertEquals(5, linear.linearSearch(myStrings2, "uytrw"));
        
        String[] myStrings3 = {"Q!", "W@", "E#"};
        assertEquals(0, _01_LinearSearch.linearSearch(myStrings3, "Q!"));
        
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] myInts1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertEquals(11, _02_BinarySearch.binarySearch(myInts1, 0, 15, 11));
        
        int[] myInts2 = {2, 6, 5, 10, 11, 16, 20, 33, 41, 50};
        assertEquals(5, _02_BinarySearch.binarySearch(myInts2, 3, 6, 16));
        
        int[] myInts3 = {2, 4, 6};
        assertEquals(0, _02_BinarySearch.binarySearch(myInts3, 0, 2, 2));
    }
}
