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
			public static final int WORKING_DAYS_PER_MONTH=20;
			public static final int MAX_WORKING_DAYS=20;
			public static final int MAX_WORKING_HOURS=100;
			
			 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
				int totalHours=0;
				int totalDays=0;
				int daily_wage=0;
				int monthly_wage=0;
				int wages=0;
				
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
				monthly_wage=daily_wage*WORKING_DAYS_PER_MONTH;
				System.out.println("daily wage - "+daily_wage);
				System.out.println("montly wage - "+monthly_wage);
				
				while(totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
						totalHours+=1;
						totalDays+=1;
						wages=totalHours*totalDays*EMPLOYEE_WAGE_PER_HOUR;
						System.out.println("wages - "+wages);
				}
				
					
	}
	

}
