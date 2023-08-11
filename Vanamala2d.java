public class Loop6 {

	public static void main(String[] args) {
		
	int NumArray [] = {1,2,9,5,6,7,8,4,3};
		 
	      int  count;
	      System.out.println(" descending order is:");
	      for( int i=0; i<NumArray.length;i++) {
	    	for(int j=i;j<NumArray.length;j++) {
	    		if(NumArray[i]<NumArray[j]) {
	    		
	    			 count = NumArray[i]; 
	    			 NumArray[i] = NumArray[j];
	    			 NumArray[j] = count;
	    		}
	    	}
	      
	      
	      }
	      for(int b:NumArray) {
	    	  System.out.print(" ");
	    	  System.out.print(b);
	    			
	    		
	      }
	      
	

	}




	}


