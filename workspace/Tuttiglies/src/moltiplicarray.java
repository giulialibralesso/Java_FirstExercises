
public class moltiplicarray {

	public static int molt (int array []) {
		int conta = 0;
		int r = 1;
		for (conta = 0; conta < array.length; conta++) {
			r = r * array[conta];
		}
		return r;
	}
	
	
	public static void main(String[] args) {
		int a[] = {10,2,11};
		System.out.println(molt(a));
	}

}
