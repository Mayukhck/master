package corejava;

public class multithread extends Thread {
	
	private int threadno;
	
	public multithread(int threadno) {
		this.threadno=threadno;
	}
	
	public void count() {
		for(int i=1;i<=5;i++) {
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("if the value is="+i+"thread of ="+threadno);
		}
	}
	
	public static void main(String[] args) {
		multithread m1 = new multithread(1);
		multithread m2 = new multithread(2);
		
		long starttime = System.currentTimeMillis();
		m1.count();
		m2.count();
		long endtime = System.currentTimeMillis();
		
		System.out.println("thread timing = "+ (endtime-starttime));
	}
}
