package thread;

public class Actor extends Thread {
	public void run() {
		System.out.println(getName() + "�������֣�");
		int count = 0;
		boolean keepRunning = true;
		while (keepRunning) {
			System.out.println(getName() + "KD�칥��" + (++count));
			if (count == 100) {
				keepRunning = false;
			}
			if (count % 10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName() + "�÷��¸ߣ�");
	}

}
