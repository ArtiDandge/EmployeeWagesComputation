/**
 * 
 */

/**
 * @author HP
 *
 */
public class EmplyeeWages {

	/**
	 * @param args
	 */
		// Constants
			public static final int IS_PRESENT = 1;
			public static final int IS_ABSENT = 2;
			public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
				int totalHours=8;
				int totalDays=0;

		System.out.println("Welcome to Employee Wage Computation Program");
		
		// TYPE CASTING - external
				int employeeCheck = (int) (Math.floor(Math.random()*10)%2);
				System.out.println("integer generated - "+employeeCheck);
				
				if(employeeCheck == IS_PRESENT){
					System.out.println("Employee is present");
					System.out.println("Employee daily wages "+totalHours*EMPLOYEE_WAGE_PER_HOUR);
				}
				else {
					System.out.println("employee not present hence no daily wages provided");
				}	
				
	}

}
