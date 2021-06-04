
public class arrayvaloremedio {

	public static int mean (int array[]) {
		int conta = 0;
		int r = 0;
		for (conta = 0; conta < array.length; conta++) {
			r = array[conta] + r;
		}
		return r/array.length;
	}
	
	
	public static void main(String[] args) {
		int a[] = {10, 2, 8, 4};
		//int a [];
		//a = new int [5];
		System.out.println(mean(a));
	}

}
