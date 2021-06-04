
public class numerochecomparepiùvolte {
	
	public static void major (int array[]) {
		int x = 0;
		int conta = 0;
		int max = 0;
		int r = 0;
		
		for (int i = 0; i < array.length; i++) {
				
			x = array[i];
			
			for (int j = 0; j < array.length; j++) {
				if (x == array[j]) {
					conta++;	//conta = conta + 1
				}
			}
			
			if (max < conta) {
				max = conta;
				r = x;
			}
			conta = 0;
		}
		System.out.println(r);
	}
	
	

	public static void main(String[] args) {
		int a [] = {1,3,3,3,4,5};
		major(a);
	}

}
