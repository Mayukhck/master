package corejava;

class wish {
	public synchronized static void greet() {
		String s1 = "Mayukh Gowda";
		for (int i = 0; i <s1.length(); i++) {
			System.out.print(s1.charAt(i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

class good extends Thread {
	public void run () {
		wish.greet();
	}
}

public class threadsyncr {
	public static void main(String[] args) {
		good g1 = new good();
		good g2 = new good();
		good g3 = new good();
		g1.start();
		g2.start();
		g3.start();
	}
}