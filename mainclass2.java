package corejava;

public class mainclass2 {
	public static void main(String[] args) {
		hero h1 = new hero();
		heroin he1 = new heroin();
		Thread t1 = new Thread(he1);
		
		h1.start();

		t1.start();
	}
}