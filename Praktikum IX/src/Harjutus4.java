public class Harjutus4 {
	public static void main(String[] args) throws SamamargilisuseErind {
		int esimene = (int) (Math.random() * 20 - 10);
		int teine = (int) (Math.random() * 20 - 10);
		System.out.println(esimene + " " + teine);
		try {
			if (esimene * teine >= 0) {
				throw new SamamargilisuseErind();
			}
		} catch (SamamargilisuseErind e) {
			System.out.println("Samamärgilised");

		}

	}
}
