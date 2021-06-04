package first;

public class posizioneduplicato {

	public static int find (int a []) {
		int x = 0;
		int y = 0;
		int conta = 0;
		int i = 0;
		int j = 0;
		int salva = 0;
		for (i = 0; i < a.length; i++) {
			conta = 0;
			x = a[i];
			for (j = 0; j < a.length; j++) {
				y = a[j];
				if (x == y) {
					conta++;
					if (conta == 2) {
						salva = j;
					}
				}
			}
			if (conta == 2) {
				System.out.println(salva);
				return salva;
			}
		}
		System.out.println(-1);
		return -1;
	}

	public static void main(String[] args) {
		int a [] = {1,7,5};
		find(a);
	}

}
