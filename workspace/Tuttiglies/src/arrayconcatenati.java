
public class arrayconcatenati {

	public static int [] concat (int a [], int b []) {
		
		int c [];
		
		c = new int [a.length + b.length];
		
		int i = 0;
		
		for (i = 0; i<a.length; i++) {
			c [i] = a[i];
		}
		
		for (int j = 0; j<b.length; j++) {
			c[i] = b[j];	
			i++;
		}
		return c;
	}
		
	public static void main(String[] args) {
		int f [] = {1,2,3};
		int g [] = {4,5,6,7};
		int h [] = concat(f,g);
	
		for (int s = 0; s < h.length; s++) {
			System.out.println(h[s]);
		}
	}
}
