package shellSort;

public class Main {

	public static void main(String[] args) {
		int[] vector = new int[100];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * vector.length);
			System.out.println(vector[i]);
		}
		int h = 1;
		int n = vector.length;

		while (h < n) {
			h = h * 3 + 1;
		}

		h = (int) Math.floor(h / 3);

		int element, j;

		while (h > 0) {
			for (int i = h; i < n; i++) {
				element = vector[i];
				j = i;
				while (j >= h && vector[j - h] > element) {
					vector[j] = vector[j - h];
					j = j - h;
				
				}
				vector[j] = element;
			}
			h = h / 2;
		}
		System.out.println("\n\n Ordenado");
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
}
