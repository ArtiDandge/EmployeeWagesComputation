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
			public static final int NUM_OF_WORKING_DAYS=2;
			public static final int MAX_HRS_IN_MONTH=10;

			//get wages from class method
			public static int computeEmpWage(){
	        //variables
	        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	        //Computation
	        System.out.println("------------------------------------------------");
	        System.out.println("Wage based on work hours");
	        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
                 		totalWorkingDays++;
	                   	int empCheck = (int) Math.floor(Math.random()*10)%3;
	                    switch (empCheck){
	                    case IS_PART_TIME:
	                      		empHrs = 4;
	                            break;
	                    case IS_FULL_TIME:
	                            empHrs = 8;
	                            break;
	                    default:
	                            empHrs = 0;

	                        }
	                    totalEmpHrs += empHrs;
	                    System.out.println("Day : "+ totalWorkingDays + "Emp Hr : "+empHrs);
	                	}
	                	int totalEmpWage = totalEmpHrs * EMPLOYEE_WAGE_PER_HOUR;
	                	System.out.println("Total Employee Wage: " + totalEmpWage);
	                	return totalEmpWage;
	        }
	             
						
			public static void main(String[] args) {
		
				        // TODO Auto-generated method stub
				        System.out.println("Welcome to Employee Wage Computation Program");
				        EmplyeeWages emp = new EmplyeeWages();
				        EmplyeeWages.computeEmpWage();
			
			}

}
