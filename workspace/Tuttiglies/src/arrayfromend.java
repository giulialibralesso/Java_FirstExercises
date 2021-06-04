
public class arrayfromend {

	public static void reverse (int arr2[]) {
		
		for (int j = arr2.length-1; j >= 0; j--) {
			System.out.println(arr2[j]);
			}
		}



	public static void main(String[] args) {
		int a [] = {0,1,2,3,4,5,6,7,8};
		reverse (a);
	}

}
