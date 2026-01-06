package Com.tnsif.multithreading;

public class MyChildThread {
	public void run() {
		System.out.println("Inside run() "
				+ "Thread is alive or not? " + this.isAlive());
		int no = 0;
		while (no < 4) {
			no++;
			System.out.println("number = " + no);
			sleep(500);
		}
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
