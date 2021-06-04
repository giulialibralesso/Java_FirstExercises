
public class soloduevolte {

	public static void isDouble (int a []) {
		int x = 0;
		int conta = 0;
		
		for (int i = 0; i<a.length; i++) {
			
			conta = 0;
			x = a[i];
			
			for (int j = 0; j<a.length; j++) {
				
				if (a[j] == x) {
					conta++;
				}
			}
			
			if (conta == 2) {
				System.out.println(x);
				}
		}
		
	}
	
	
	public static void main(String[] args) {
		int a [] = {1,3,3,3,4,5,4};
		isDouble (a);
	}

}
