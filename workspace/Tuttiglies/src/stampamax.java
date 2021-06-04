
public class stampamax {

	public static void find (int a[]) {
		
		int max = 0;
		int conta = 0;
		
		for (int i=0; i<a.length; i++) {
			max = a[i];
			
			if (max > conta) {
				conta = max;
			}
		}
		System.out.println(conta);
	}
	
	
	
	
	public static void main(String[] args) {
		int a [] = {1,2,2,3,1,8,0};
		find(a);
	}

}
