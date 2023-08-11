
public class Loop5 {

	public static void main(String[] args) {
		
		int Numbers [] = {1,2,3,4,5,6,7,8,9};
		  
		for(int i=0;i<Numbers.length;i++) {
			
			int Number = Numbers[i];
			if(Number == 4 || Number == 7) {
				continue;
			}
			System.out.println(Number);
			}
		

	}

}