import java.util.*;

 interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int EMPLOYEE_WAGE_PER_HOUR,int MAX_WORKING_DAYS_PER_MONTH, int MAX_WORKING_HOURS_PER_DAY);
	public void computeEmpWage();
	public int getTotalWage(String company);
		
}

public class EmplyeeWages implements IComputeEmpWage {
	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME= 2;
    
    private int numberOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;
    
    public EmplyeeWages() {
    	companyEmpWageList = new LinkedList<>();
    	companyToEmpWageMap = new HashMap<>(); 
    }
    @Override
	public void addCompanyEmpWage(String company, int EMPLOYEE_WAGE_PER_HOUR, int MAX_WORKING_DAYS_PER_MONTH,
			int MAX_WORKING_HOURS_PER_DAY) {
		// TODO Auto-generated method stub
    	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, EMPLOYEE_WAGE_PER_HOUR, MAX_WORKING_DAYS_PER_MONTH, MAX_WORKING_HOURS_PER_DAY);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
		
	}

	@Override
	public void computeEmpWage() {
		// TODO Auto-generated method stub
		for(int i=0; i< companyEmpWageList.size(); i++) {
    		CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
    		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
    		System.out.println(companyEmpWage);
    	}
	}
    	
    	
    
    public int getTotalWage(String company) {
    	return companyToEmpWageMap.get(company).totalEmpWage;
    	
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
    	IComputeEmpWage empWageBuilder = new EmplyeeWages();
    	empWageBuilder.addCompanyEmpWage("Dmart", 20, 7, 10);
    	empWageBuilder.addCompanyEmpWage("Relience", 10, 5, 8);
    	empWageBuilder.computeEmpWage();
    	System.out.println("Total Wage for Dmart : "+ empWageBuilder.getTotalWage("Dmart"));
    	
    }
}

	