package first;

public class max_even {

	public static int maxAndEven (int a []) {
		int conta = 0;
		int max = 0;
		
		for (int i = 0; i<a.length; i++) {
			conta = a[i];
			
			if (conta %2 == 0 && conta > max) {
				max = conta;
			}
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		int a [] = {2,6,1,4,0};
		System.out.println(maxAndEven(a));
	}
}
