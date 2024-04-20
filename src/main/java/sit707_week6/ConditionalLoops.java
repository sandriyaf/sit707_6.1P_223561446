package sit707_week6;

public class ConditionalLoops {
	
	//Simple func with for loop 
	 public static void ForLoopFunction(int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.println("Iteration: " + i);
	        }
	    }
	// Function with a loop containing a conditional statement
	    public static int loopWithCondition(int[] a) {
	        int count = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] % 2 == 0) {
	                count++;
	            }
	        }
	        return count;
	    }
}
