	public static void main(String[] args ) {

		String fName = null;
		String lName = null;
		printFullName(fName, lName  );
	}
		 
	public static  void  printFullName(  String fName2, String lName2  ) {
		
		Scanner sc = new Scanner(System.in);
		       System.out.println("First name is:");
		
				 String fName = sc.nextLine();
				   System.out.println("Last name is:");
				   String lName = sc.nextLine();
				   System.out.println( "Full Name  is:"+fName+" "+lName);
	}
} 