package practice;

public class JinLamunAdapter implements Lamun{
	
	private JinLamun jinLamun;
	
	public JinLamunAdapter(JinLamun jinLamun) {
		this.jinLamun = jinLamun;
	}
	
	@Override
	public String cook() {
		System.out.println("계란추가");
		return jinLamun.cook();
	}
}
