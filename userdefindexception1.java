package corejava;

class invalidDriverLicenseException extends Exception {
	
	invalidDriverLicenseException(){
		System.out.println("exception is created");
	}
	
	public void dontdrive() {
		System.out.println("your not aligebal for drive");
	}
}

public class userdefindexception1 {
		public static void drive(int age) throws invalidDriverLicenseException {
			if(age>=18) {
				System.out.println("you can get license");
			}
			else {
				throw new invalidDriverLicenseException();
			}
		}
		
		public static void main(String[] args) {
			int age = 17;
			try {
				drive(age);
			}
			catch (invalidDriverLicenseException e){
				e.dontdrive();
				e.printStackTrace();
			}
		}
}
