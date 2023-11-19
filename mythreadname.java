package corejava;

public class mythreadname {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
				t1.setName("Mayukh");
		System.err.println(t1.getId());
		System.err.println(t1.getName());
		System.err.println(t1.getPriority());
		
		System.out.println(args.length);
	}
}
