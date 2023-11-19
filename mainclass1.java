package corejava;

class heroin implements Runnable {
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("heroin value="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class mainclass1 {
	public static void main(String[] args) {
		heroin h1 = new heroin();
		Thread t1 = new Thread(h1);
		heroin h2 = new heroin();
		Thread t2 = new Thread(h2);
		t1.start();
		t2.start();
	}
}