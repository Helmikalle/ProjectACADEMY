public class Karhu {
	public static void main(String[] args) {
		RekursioTreeni treeni = new RekursioTreeni();
		treeni.rekursio(3);
		System.out.println(treeni.getLuku());
	}
}

public class RekursioTreeni {
	private int luku = 0;

	public void rekursio(int x) {
		luku++;
		for (int i = 0; i < x; i++) {
			--x;
			rekursio(x);
		}
	}
	public int getLuku() {
		return luku;
	}
}