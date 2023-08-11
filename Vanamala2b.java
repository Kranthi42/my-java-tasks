public class Loop {

	public static void main(String[] args) {
	
		int Numbers [] = {1,2,9,5,6,7,8,4,3};
		 int highest = Numbers[0];
		 int smallest = Numbers [0];
		 
       for(int i= 0;i<Numbers.length; i++) {
    	   if(Numbers[i]>highest ) {
    		   highest = Numbers[i];
    	   }
    	   if(Numbers[i]< smallest ) {
    		   smallest = Numbers[i];
       }
	}
         System.out.println("highest number:"+ highest);
         System.out.println("smallest number:"+ smallest);
}
}