public class Harjutus2 {
	public static void main(String[] args) {
		int[] lst = { 1, 2, 3 };
		try {
			System.out.println(lst[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indeks on listi piiridest väljas");

		}
	}
}
