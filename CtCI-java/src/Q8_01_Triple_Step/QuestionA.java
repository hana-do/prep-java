/***
 * TRIPLE STEP
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
 * Implement a method to count how many possible ways the child can run up the stairs.
 */

package Q8_01_Triple_Step;

public class QuestionA {
	
	public static int countWays(int n, String s) {
		if (n < 0) {
			System.out.println(s + "///0");
			return 0;
		} else if (n == 0) { 
			System.out.println(s + "///1");
			return 1; // 1 way if no step
		} else {
			System.out.println(s + ": "+n);
			return countWays(n - 1, "hop 1") + countWays(n - 2, "hop 2") + countWays(n - 3, "hop 3"); // O(3^n)
		}
	}
	
	public static void main(String[] args) {
		int n = 5; // steps
		int ways = countWays(n,"");
		System.out.println(ways);
	}

}

