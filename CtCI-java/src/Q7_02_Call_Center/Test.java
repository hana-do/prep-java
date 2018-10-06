/***
 * CALL CENTER
 * Imagine you have a call center with three levels of employees: 
 * respondent, manager, and direct. An incoming telephone must be first allocated to
 * a respondent who is free. If the respondent can't handle the call, he or she must
 * escalate the call to a manager. If the manager is not free or not able to handle it,
 * then the call should be escalated to a director. 
 * Design the classes and data structures for this problem. Implement a method a 
 * dispatchCall() which assigns a call to the first available employee.
 */

package Q7_02_Call_Center;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Object CallHandler
		// 2. Object Employee
		// 3. Object Call
		// 4. Object Respondent
		// 5. Object Rank
		// 6. Object Manager
		// 7. Object Director
		// 8. Object Caller
		CallHandler ch = new CallHandler();
		Caller c = new Caller(1, "hana");
		ch.dispatchCall(c);
	}

}
