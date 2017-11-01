package combination;

public class Combination_lib {
	
	public int getFactorial(int n){ //n‚ÌŠKæ	
		int f = 1;
		//ŠKæŒvZ
		if(n == 0) {
		
		}
		else {
			for(int i = n; i > 0; i--)
				f *= i;
			
		}
			
		return f;
	}
	


}
