public class Kuup�ev {
	int mitmesp�ev;
	String kuunimi;
	char n�dalap�ev;

	public Kuup�ev(int mitmesp�ev, String kuunimi, char n�dalap�ev) {
		super();
		this.mitmesp�ev = mitmesp�ev;
		this.kuunimi = kuunimi;
		this.n�dalap�ev = n�dalap�ev;
	}

	@Override
	public String toString() {
		return n�dalap�ev + " on " + kuunimi + "i " + mitmesp�ev + " p�ev.";
	}

	public char getN�dalap�ev() {
		return n�dalap�ev;
	}

	public int getMitmesp�ev() {
		return mitmesp�ev;
	}

}
