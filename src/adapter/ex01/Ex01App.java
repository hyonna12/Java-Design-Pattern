package adapter.ex01;

import adapter.lib.Email;

public class Ex01App {

	public static void main(String[] args) {
		CustomerService cs = new CustomerService(new Email());
		cs.acceptClaim("맘에 안들어");
	}

}
