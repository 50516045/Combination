package combination;

public class Combination_lib {
	
	public int getFactorial(int n){ //n�̊K��	
		int f = 1;
		//�K��v�Z
		if(n == 0) {
		
		}
		else {
			for(int i = n; i > 0; i--)
				f *= i;
			
		}
			
		return f;
	}
	


}
