
public class arraynoduplicati {

	public static boolean isSingle (int array [], int n) {
		
		int conta = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == n) {	
				conta++;
				if (conta == 2) {
					return false;
				}
			}
		}
		
		if (conta == 0) {
			return false;
			}
		else {
			return true;
			}
	}
	
	public static void noDouble (int array []) {
		for (int i = 0; i < array.length; i++) {
			if (isSingle(array, array[i])) {
				System.out.println(array[i]);
			}
		}
	}
		
	public static void main(String[] args) {
		int a [] = {1,2,2,1,0,9};
		//System.out.println(a); 
		noDouble(a);
	}
}
