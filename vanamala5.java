public class PROJECT {

	private static int percentage_caluclation;

	public static void main(String[] args) {
		 String student_name = "Mahesh Babu";
		 int language1_marks = 64;
		 int language2_marks= 74;
		 int language3_marks = 86;
		 int maths_marks = 86;       	
		 int science_marks =72;	
		 int social_marks  = 91;	
		 String classname = "XI";
		  String section = "B";
		 int pass_mark =35;
		 float total_marks = 600.0F;		
		 CharSequence gender_name	= "M";
		 float totalsubject_marks = 473.0F;
		 int student_failedbelowpercentage =40;
		 String student_grade ="B";
		  float percentage_caluclation= (float) ((totalsubject_marks/total_marks))*100;
		  boolean student_promoted =percentage_caluclation>student_failedbelowpercentage;
	     	System.out.println("name of the student:"+student_name);
	    	System.out.println("name of the gender:"+gender_name);
	    	System.out.println("total marks of all subject:"+total_marks);
	    	System.out.println("percentage of mahesh babu:"+percentage_caluclation );
	      	System.out.println("section of student prom0ted:"+ student_promoted);
	    	if(percentage_caluclation>40 && percentage_caluclation<=64) {
	    		System.out.println("section of the grade c");
	    		System.out.println("student promoted no ");
	    		System.out.println("section of student c");
	    	if(percentage_caluclation>65 && percentage_caluclation<=90) {
	    		System.out.println("caluclation of grade :"+student_grade);
	    		System.out.println("section of student:"+ section);	
	    	}
	    		
	    	}
	    	
	}
	
}
	    
	    	
		
		
		 




