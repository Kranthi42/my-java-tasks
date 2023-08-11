import java.util.Scanner;
public class TABLES {

	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
	       System.out.println("enter table number is:");
	
			 int number = readInput.nextInt();
			   System.out.println("up to number is:");
			   int uptonumber = readInput.nextInt();
		
				   printtablenumber( number,  uptonumber  );
				   
	}
	public static  void  printtablenumber(int number, int uptonumber  ) {
		
		for(int i=1;i<=15;i++) {
			System.out.println(number +"*"+i +" =" +number*i);
		}
	}

}
	