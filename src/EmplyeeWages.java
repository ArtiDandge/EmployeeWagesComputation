public class EmplyeeWages {

	/**
	 * @param args
	 */
		// Constants
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME= 2;
			
			
			//get wages from class method
			public static int computeEmpWage(String company, int EMPLOYEE_WAGE_PER_HOUR,int MAX_WORKING_DAYS_PER_MONTH, int MAX_WORKING_HOURS_PER_DAY){
				//variables
				int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
				System.out.println("------------------------------------------------");
				System.out.println("Wages for "+ company);
	        
				//calculate wages till max condition given
				while (totalEmpHrs <= MAX_WORKING_DAYS_PER_MONTH && totalWorkingDays < MAX_WORKING_HOURS_PER_DAY){
                 		totalWorkingDays++;
                 		//employee presence check
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
	                	//compute and display total hours  
	                    totalEmpHrs += empHrs;
	                    System.out.println("Day : " + totalWorkingDays + ", Emp Hours : "+empHrs);
				}
						//compute and display total employee wages 
	                	int totalEmpWage = totalEmpHrs * EMPLOYEE_WAGE_PER_HOUR;
	                	System.out.println("Total Employee Wage of "+company+"  " + totalEmpWage);
	                	return totalEmpWage;
	        }
	             
						
			public static void main(String[] args) {
		
				        // TODO Auto-generated method stub
				        System.out.println("Welcome to Employee Wage Computation Program");
				        //passing company name, employee wages per hour, max working days and max working hours to method
				        EmplyeeWages.computeEmpWage("Relience", 20, 25, 7);
				        EmplyeeWages.computeEmpWage("BigBazar", 10, 20, 9);
				        EmplyeeWages.computeEmpWage("D-mart", 15, 21, 8);
			
			}

}
