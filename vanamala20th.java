public class STUDENT {

	public static void main(String[] args) {

		String studentName="Dinesh";
		 int eng_marks= 10;
		 int hin_marks = 5;
		 int math_marks = 55;
	 	int science_marks =30;
			int pass_mark = 32;
			if(eng_marks<pass_mark) {
				System.out.println("dinesh fialed the english subject:"+eng_marks);
			}
			else {
				System.out.println("dinesh pass in english subject");
			}
				if(hin_marks<pass_mark) {
					System.out.println("dinesh fialed the hindi subject:"+hin_marks);
			}
				else {
					System.out.println("dinesh pass in hindi subject");
				}
				if(math_marks>pass_mark) {
					System.out.println("dinesh pass the maths subject:"+math_marks);
				}
				else {
					System.out.println("dinesh failed in maths subject");	
				}
				if(science_marks<pass_mark) {
					System.out.println("dinesh failed the science subject:"+science_marks);
				}
				else {
					System.out.println("dinesh pass in science subject");	
				}
		if(eng_marks<pass_mark && hin_marks<pass_mark && math_marks<pass_mark && science_marks<pass_mark) {
			System.out.println("dinesh pass the current acadamics ");
		}
		else {
			System.out.println("dinesh fail the current acadamics");
			
		}
	   String studentName1 ="Suresh";	
		int eng_marks1 = 90;
		int hin_marks1 = 95;
		 int math_marks1 = 75;
		 int science_marks1 = 80;
		 int pass_mark1 = 32;
		 if(eng_marks1>pass_mark1) {
			 System.out.println("suresh pass the enlish subject:"+eng_marks1 );
		 }
		 else {
		 System.out.println("suresh fail the enlish subject" );
		 }
		 if(hin_marks1>pass_mark1) {
				System.out.println("suresh pass the hindi subject:"+hin_marks1);
		}
			else {
				System.out.println("suresh fail in hindi subject");
			}
		 if(math_marks1>pass_mark1) {
				System.out.println("suresh pass the maths subject:"+math_marks1);
			}
			else {
				System.out.println("suresh failed in maths subject");	
			}
		 if(science_marks1>pass_mark1) {
				System.out.println("suresh pass the science subject:"+science_marks1);
			}
			else {
				System.out.println("suresh fail in science subject");	
			}
		if(eng_marks1>pass_mark1 && hin_marks1>pass_mark1 && math_marks1>pass_mark1 && science_marks1>pass_mark1) {
			System.out.println("suresh pass the current academics  ");
		}
		else {
			System.out.println("suresh  failed the  current academics  ");
		}
	}

}
