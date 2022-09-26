package strategy;

public class CafeLatte implements Coffee{
	
	private final String NAME = "카페라떼";
	
	public String make() {
		return NAME;
	}
}
