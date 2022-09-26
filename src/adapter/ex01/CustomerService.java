package adapter.ex01;

// 고객의 클레임이 들어오면, 사과 이메일 보내기, 이메일 답장을 DB 저장하기
// 두 가지 메서드 필요(클레임 들어오고/ 이메일 보내기)
// +메서드 하나 추가
public class CustomerService {
	
	private EmailSend email;
	
	public CustomerService(EmailSend email) {
		this.email = email;
	}
	
	// 클레임을 받는 메서드
	public void acceptClaim(String msg) {
		// 1. 클레임 받기
		String acceptMsg = msg;
		System.out.println("클레임 내용 : " +acceptMsg);
		
		// 2. 이메일 보내기
		sendEmail();
	}

	private void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 디비에 저장했습니다. : "+result);
		// db에 저장해야하는데 email을 보내는 라이브러리가 만들어지지 않아서
		// db에 인서트하는 테스트를 하지 못함 -> 가짜 어댑터 만듦
	}
}
