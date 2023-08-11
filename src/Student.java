
public class Student {

	public static void main(String[] args) {
		String fName1 ="Anna";
		String lName1 ="Suresh";
		String email1 = "Anna.Suresh@gmail.com";
		long Phone1 = 987654321L;
		String role1 = "Manage_years";
		int age_years1 = 40;
		int dailyWorkingHours1 = 10;
		long salary_Year1 =3450000L;
		int totalWorkingDays1 = 262;
		int leaves1 = 10;
		double eachday_salary1 = 13167.9389;
		double TotalDeductedSalary1 = 131679.389;
		int totalmonthsinayear1=12;
		float totalweeksinayear1 =52.17F;
		CharSequence Gender1 = "M";
		boolean  seniorcitizen1 =age_years1<60;
		
		
		System.out.println("Full Name:" + fName1 +lName1);

		System.out.println("Email:" + email1);
		System.out.println("Age in Months:" + age_years1 * totalmonthsinayear1);
		System.out.println("Age in Weeks:" + age_years1 * totalweeksinayear1);
		System.out.println("No of days Present:" + (totalWorkingDays1 - leaves1));
		System.out.println("Total hours Worked:" + (totalWorkingDays1 - leaves1) * dailyWorkingHours1);
		System.out.println("Monthly salary:" + salary_Year1 / totalmonthsinayear1);
		System.out.println("Salary Deduction/Day:" + eachday_salary1);
		System.out.println("Total Deducted salary:" + leaves1 * eachday_salary1);
		System.out.println("Total salary after deductions:" + (salary_Year1 - TotalDeductedSalary1));
		System.out.println("Genderof theperson:"+ Gender1);
		System.out.println("senior citizen statement:"+ seniorcitizen1);
		System.out.println("the FIRST letter in the name is:"+fName1.charAt(2));
		System.out.println("the Length of first letter:"+fName1.length());
	}
	



	}


