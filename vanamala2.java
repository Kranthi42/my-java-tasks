
public class TASK1 {

	public static void main(String[] args) {
	String fName="anna";
	String lName="Suresh";
	String emailid="anna.Suresh@gmail.com";
	long phone=987654321L;
	 String role="Manage_yearsr";
	 int age_years= 40;
	 int dailyworkinghours=10;
	 double salary_year= 3450000;
	 int totalWorkingdays=262;
	 int totalmonthsinyear=12;
	 int totalweeksinyear =52;
	 double deductedsalary =13167.9;
	 int totaldaysinamonth=30;
	 double Finalpaidsalary=3318321;
	
	 int leaves=10;
	 System.out.println("name of the person:"+fName+lName);
	 System.out.println("email id of person:" + emailid);
	 System.out.println("age in months:" + age_years *totalmonthsinyear ); 
	 System.out.println("age in weeks:"+age_years * totalweeksinyear);
	 System.out.println("No of days Present:" + "totalWorkingdays - leaves");
	 System.out.println("no of workinghours:"+ dailyworkinghours*totaldaysinamonth );
	 System.out.println("salary in months:"+ salary_year/totalmonthsinyear );
	 System.out.println("each day salary:"+salary_year/totalWorkingdays);
	 System.out.println("deducted salary:"+ leaves * deductedsalary);
	  System.out.println("Finalpaid salary:"+" salary_year - deducted salary");
	
	}
}