
public class Functions {

	public static void HighestNumber() {
		int Numbers [] = {1,2,9,5,6,7,8,4,3};
		 int highest = Numbers[0];

		  for(int i= 0;i<Numbers.length; i++) {
	    	   if(Numbers[i]>highest ) {
	    		   highest = Numbers[i];
	    	   
	    		  
	    	   }
		  }
	    	   System.out.println("highest number:"+ highest);
	    	   } 
	  
		  
	
	    		public static void SmallestNumber() {   	   

	    			int Numbers [] = {1,2,9,5,6,7,8,4,3};
	    			 int smallest = Numbers [0];
	    			for(int i= 0;i<Numbers.length; i++) {
	    			 
	    			  if(Numbers[i]< smallest ) {
	    	    		   smallest = Numbers[i];
	    			  }
	    			}
	    			  System.out.println("smallest number:"+ smallest);
	    			
	    		}
	    		
	    		         
	    		
	    		
	    			  
	    		

	    		
	    			  public static void sortascendingofarray() {  	
	    				  int NumArray [] = {1,2,9,5,6,7,8,4,3};
	    					 
	    			      int  count;
	    			      System.out.println(" ascending order is:");
	    			      for( int i=0; i<NumArray.length;i++) {
	    			    	for(int j=i;j<NumArray.length;j++) {
	    			    		if(NumArray[i]>NumArray[j]) {
	    			    		
	    			    			 count = NumArray[i]; 
	    			    			 NumArray[i] = NumArray[j];
	    			    			 NumArray[j] = count;
	    			    		}
	    			    	}
	    			      
	    			      
	    			      }
	    			      for(int a:NumArray) {
	    			    	  System.out.print(" ");
	    			    	  System.out.print(a);
	    			    			
	    			    		
	    			      }
	    			  }

	    			      public static void sortdescendingofarray() {
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
		    			      public static void  whileloop() { 
		    			    	  int Num [] =  {1,2,9,5,6,7,8,4,3};
		    			    	  System.out.print("while loop: ");
		    			      		
		    			 		 int i=0;
		    			 		 while (i<Num.length) {
		    			 			 System.out.println( Num[i] );
		    			 			 i++;
		    			 		 } 
		    			      }
		    			 		   public static void  dowhileloop() { 
		    			 			  int Num [] =  {1,2,9,5,6,7,8,4,3};
		    			 			 System.out.print("dowhile loop: ");
		    			 			  int j=0;
		    			 			 do {
		    			 				 System.out.println(Num [j]);
		    			 				 j++;
		    			 			 }while(j<Num.length);
		    			 		   }
		    			 			  public static void  skipnumberarray() { 
		    			 				 int Numbers [] = {1,2,3,4,5,6,7,8,9};
		    			 				System.out.println("skip numbersis:");
		    			 				
		    			 				for(int i=0;i<Numbers.length;i++) {
		    			 					
		    			 					int Number = Numbers[i];
		    			 					if(Number == 4 || Number == 7) {
		    			 						continue;
		    			 					}
		    			 					System.out.println(Number);
		    			 				}
		    			 			  }
		    			 					public static void main(String[] args) {
		    			 						HighestNumber();
		    			 						SmallestNumber();
		    			 						sortascendingofarray();
		    			 						sortdescendingofarray();
		    			 						whileloop();
		    			 						dowhileloop();
		    			 						 skipnumberarray();
		    			 					}
		    			 					}
		    			 			 