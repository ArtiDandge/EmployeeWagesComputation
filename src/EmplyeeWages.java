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
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME= 2;
			public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
				int totalHours=0;
				int daily_wage=0;
			
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// TYPE CASTING - external
				int employeeCheck = (int) (Math.floor(Math.random()*10)%3);
				System.out.println("integer generated - "+employeeCheck);
				

				/*
				 * Switch Case
				 */
				switch(employeeCheck) {
				case IS_FULL_TIME :
						System.out.println("Employee is full time");
						totalHours=8;
						break;
				case IS_PART_TIME:
						System.out.println("Employee is part time");
						totalHours=4;
						break;
				default :
						System.out.println("employee absent");
						break;
				}
				daily_wage=totalHours*EMPLOYEE_WAGE_PER_HOUR;
				System.out.println("daily wage - "+daily_wage);
				
					
	}

}
