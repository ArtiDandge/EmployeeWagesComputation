
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

