package corejava;

class hero extends Thread {
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("hero value="+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class mainclass {
	public static void main(String[] args) {
		hero h1 = new hero();
		hero h2 = new hero();
		hero h3 = new hero();
		h1.start();
		h2.start();
		h3.start();
	}
}
