package proxy;

public class ProxyServer implements Server{
	
	private Server server;
	
	public ProxyServer(BlogServer server) {
		this.server = server;
	}
	
	@Override
	public void request() {
		System.out.println("json을 자바로");
		server.request();
		System.out.println("자바를 json으로");
		
	}

}
