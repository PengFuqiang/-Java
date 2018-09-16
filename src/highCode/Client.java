package highCode;

public class Client {
	public void methodA(String str, Integer...integers ) {
		
	}
	public void methodA(String str, String...strings ) {
		
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		String[] strs = null;
		client.methodA("China", 0);
		client.methodA("China", "People");
		client.methodA("China", strs);
//		client.methodA("China");
//		client.methodA("China", null);
	}

}
