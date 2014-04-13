public class Kuupäev {
	int mitmespäev;
	String kuunimi;
	char nädalapäev;

	public Kuupäev(int mitmespäev, String kuunimi, char nädalapäev) {
		super();
		this.mitmespäev = mitmespäev;
		this.kuunimi = kuunimi;
		this.nädalapäev = nädalapäev;
	}

	@Override
	public String toString() {
		return nädalapäev + " on " + kuunimi + "i " + mitmespäev + " päev.";
	}

	public char getNädalapäev() {
		return nädalapäev;
	}

	public int getMitmespäev() {
		return mitmespäev;
	}

}
