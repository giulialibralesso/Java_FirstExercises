
public class primoarray {
	public static boolean find (int a[], int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int array [];
		array = new int [5];
		array[0] = 7;
		array[1] = 20;
		array[2] = 100;
		array[3] = 11;
		array[4] = 34;
		
		for (int p = 0; p < 5; p++) {
			System.out.println(array[p]);
		}
		
		boolean r = find (array, 8);
		System.out.print(r);
	}
}