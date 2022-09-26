package practice;

public class App {
	public static void main(String[] args) {
		Pot p = new Pot();
		p.boil(new JinLamun());
		p.boil(new JinLamunAdapter(new JinLamun()));
	}
}
