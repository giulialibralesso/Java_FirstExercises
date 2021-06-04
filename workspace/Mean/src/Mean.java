
public class Mean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(no_function(1,2,3));
		
		
		
		System.out.println(mean_function(5,7,93));
	}
	
	public static int no_function(int age, int fage, int mage)
	{	
		age = 7;
		fage = 3;
		mage = 5;
		int somma = age + fage + mage;
		int mean = somma / 3;
		return mean;
	}
	
	public static int mean_function (int girl, int boy, int trans)
	{
		int sum = girl + boy + trans;
		int mean = sum / 3;
		return mean;
	}
	

}
