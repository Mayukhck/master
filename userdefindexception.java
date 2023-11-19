package corejava;

class voteException extends Exception {
	
	 voteException() {
		System.out.println("exception is created");
	}
	 
	 public void dontvote() {
		 System.out.println("your not aligable for vote");
	 }
}

public class userdefindexception {
	public static void vote(int age) throws voteException {
		if(age>=18) {
			System.out.println();
		}
		else {
			throw new voteException();
		}
	}
	
	public static void main(String[] args) {
		int age = 1;
		try {
			vote(age);
			System.out.println("you are aligable for vote");
		}
		catch (voteException e){
			e.dontvote();
			e.printStackTrace();
		}
	}
}
