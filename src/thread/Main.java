package thread;

public class Main {
	public static void main(String[] args) {
		Thread actor = new Actor();
		actor.setName("������ʿ");
		actor.start();
		Thread actressThread = new Thread (new Actress(), "Ư����");
		actressThread.start();
	}

}
