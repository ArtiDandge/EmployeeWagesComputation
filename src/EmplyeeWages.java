class CompanyEmpWage{
			public final String company;
			public final int EMPLOYEE_WAGE_PER_HOUR;
			public final int MAX_WORKING_DAYS_PER_MONTH;
			public final int MAX_WORKING_HOURS_PER_DAY;
			public int totalEmpWage;
			
			
			public CompanyEmpWage(String company, int EMPLOYEE_WAGE_PER_HOUR,int MAX_WORKING_DAYS_PER_MONTH, int MAX_WORKING_HOURS_PER_DAY) {
				this.company = company;
				this.EMPLOYEE_WAGE_PER_HOUR = EMPLOYEE_WAGE_PER_HOUR;
				this.MAX_WORKING_DAYS_PER_MONTH = MAX_WORKING_DAYS_PER_MONTH;
				this.MAX_WORKING_HOURS_PER_DAY = MAX_WORKING_HOURS_PER_DAY;
			}
			
			public void setTotalEmpWage(int totalWage) {
				
				this.totalEmpWage = totalWage;
			}
			 public String toString() {
		 		return "Total Employee Wage of "+company+" is :" + totalEmpWage;
		
		     }
}

public class EmplyeeWages {

        /**
         * @param args
         */
            // Constants
            public static final int IS_FULL_TIME = 1;
            public static final int IS_PART_TIME= 2;

            private int numberOfCompany = 0;
            private  CompanyEmpWage[] CompanyEmpWageArray;
            
            public EmplyeeWages() {
            	
            	CompanyEmpWageArray = new CompanyEmpWage[5];
            	
            }
            
            private void addCompanyWage(String company, int EMPLOYEE_WAGE_PER_HOUR, int MAX_WORKING_DAYS_PER_MONTH,int MAX_WORKING_HOURS_PER_DAY) {
            	
            	CompanyEmpWageArray[numberOfCompany] = new CompanyEmpWage(company, EMPLOYEE_WAGE_PER_HOUR,  MAX_WORKING_DAYS_PER_MONTH,MAX_WORKING_HOURS_PER_DAY);
            	numberOfCompany++;
            }
            
            private void computeEmpWage() {
            	
            	for(int i = 0; i < numberOfCompany; i++) {
            		
            		CompanyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(CompanyEmpWageArray[i]));
            		System.out.println(CompanyEmpWageArray[i]);
            	}
            }
               //get wages from class method
                private int computeEmpWage(CompanyEmpWage companyEmpWage){
                //variables
                int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                //calculate wages till max condition given
                while (totalEmpHrs <= companyEmpWage.MAX_WORKING_DAYS_PER_MONTH 
                		&& totalWorkingDays < companyEmpWage.MAX_WORKING_HOURS_PER_DAY){
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
                return  totalEmpHrs * companyEmpWage.EMPLOYEE_WAGE_PER_HOUR;
       
            }

           
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                System.out.println("Welcome to Employee Wage Computation Program");

                	EmplyeeWages empWageBuilderArray = new EmplyeeWages();
                	empWageBuilderArray.addCompanyWage("Dmart",20, 2, 10);
                	empWageBuilderArray.addCompanyWage("Relience", 10, 4, 20);
                	empWageBuilderArray.computeEmpWage();
            }

}


