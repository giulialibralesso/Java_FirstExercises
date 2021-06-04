
public class no_ausiliaria {

	public static void noAux (int array []) {
		
		int conta = 0;
		int r = 0;
		
		for (int i = 0; i < array.length; i++) {
			r = array[i];

			for (int j = 0; j < array.length; j++)	{
				if (r == array[j]) {
					conta++;
				}
				if (conta == 2) {
					break;
				}
			}
			if (conta == 1) {
				System.out.println(r);
			}
			conta = 0;
		}
	}
	
		
	public static void main(String[] args) {
		int a [] = {3,3,3,1,2,0,2,1,9};
		//System.out.println(a); 
		noAux(a);	
	}
	
}