package accessModifier;

public class GetPublic {    //Base class
	
	String password = "123";  //intialized a variable
	
	private void showPassword() {
		System.out.println("Password : " +password);
	}

	public static void main(String[] args) {  //main class
		
		GetPublic user = new GetPublic();
		user.showPassword();
		
	}

}
