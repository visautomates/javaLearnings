package utilities;

public class pratics {

	public static void main(String[] args) {
		
		int count = 5;
		
		for (int i =0 ;i<=count;i++) {
			
			if (i%3==0 || i%5==0) {
				
				
				if (i%3==0 && i%5==0) {
					System.out.println("divisible by both"+i);
				}
				}else System.out.println("not divisble by both: "+i);
			}
			
		}
		
}

