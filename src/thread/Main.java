package thread;

public class Main {
	public static void main(String[] args) {
		Thread actor = new Actor();
		actor.setName("金州勇士");
		actor.start();
		Thread actressThread = new Thread (new Actress(), "漂亮的");
		actressThread.start();
	}

}
