
public class arraymin {

	public static int minimo (int array []) {
		
		int x = array[0];
		
		for (int i = 0; i < array.length; i++) {	
			if (x < array[i]) {
			}
			else { 
				x = array[i];
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		int f[] = {1, 7, 2, 30};
		System.out.println(minimo(f));
	}

}
