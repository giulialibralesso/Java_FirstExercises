
public class monete {
	
	public static int little (int bill) {
		int a = 10;
		int b = 5;
		int c = 2;
		int d = 1;
		int monetea = 0;
		int moneteb = 0;
		int monetec = 0;
		int moneted = 0;
		
		while (bill > 0) {
			if (bill >= a) {
				bill = bill - a;
				monetea++;
			}
			else if (bill >= b) {
				bill = bill - b;
				moneteb++;
			}
			else if (bill >= c) {
				bill = bill - c;
				monetec++;
			}
			else if (bill >= d) {
				bill = bill - d;
				moneted++;
			}
		}
		
		int monetetot = monetea + moneteb + monetec + moneted;
		
		System.out.println("monetea:" +monetea);
		System.out.println("moneteb:" +moneteb);
		System.out.println("monetec:" +monetec);
		System.out.println("moneted:" +moneted);
		return monetetot;
	}
	
	public static void main(String[] args) {
		int monetetot = little (7);
		System.out.println("monete totali:" +monetetot);
	}

}
