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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// TYPE CASTING - external
				int employeeCheck = (int) (Math.floor(Math.random()*10)%2);
				System.out.println("integer generated - "+employeeCheck);
				
				/*
				 * Switch Case
				 */
				switch(employeeCheck) {
				case 0 :
						System.out.println("Employee is Present");
						break;
				case 1:
						System.out.println("Employee is Absent");
						break;
				default :
						System.out.println("employee absent");
						break;
				}
	}

}
