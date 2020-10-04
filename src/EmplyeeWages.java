public class EmplyeeWages {

        /**
         * @param args
         */
                // Constants
            public static final int IS_FULL_TIME = 1;
            public static final int IS_PART_TIME= 2;

			private final String company;
			private final int EMPLOYEE_WAGE_PER_HOUR;
			private final int MAX_WORKING_DAYS_PER_MONTH;
			private final int MAX_WORKING_HOURS_PER_DAY;
			private int totalEmpWage;
			
			public EmplyeeWages(String company, int EMPLOYEE_WAGE_PER_HOUR,int MAX_WORKING_DAYS_PER_MONTH, int MAX_WORKING_HOURS_PER_DAY) {
				this.company = company;
				this.EMPLOYEE_WAGE_PER_HOUR = EMPLOYEE_WAGE_PER_HOUR;
				this.MAX_WORKING_DAYS_PER_MONTH = MAX_WORKING_DAYS_PER_MONTH;
				this.MAX_WORKING_HOURS_PER_DAY = MAX_WORKING_HOURS_PER_DAY;
			}
			
           //get wages from class method
            public void computeEmpWage(){
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
       
            }

            public String toString() {
        		return "Total Employee Wage of "+company+"is :" + totalEmpWage;

            }
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                System.out.println("Welcome to Employee Wage Computation Program");
                EmplyeeWages Relience = new EmplyeeWages("Relience", 22, 10, 7);
                EmplyeeWages BigBazaj = new EmplyeeWages("BigBazar", 12, 8, 25);
                System.out.println(Relience);
                Relience.computeEmpWage();
                BigBazaj.computeEmpWage();

            }

}

