import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList<Emp> userlist = new ArrayList<>();
		
		//userlist.add(new Emp(1220,"Wellspring","John",0,1,"password1"));
		
		//Users info = new Users();
		
		Emp info = new Emp();
	
		//Login Login = new Login(info.getLoginInfo());
		
		@SuppressWarnings("unchecked")
		Login Login = new Login(info.getLoginInfo());
		System.out.println(Login);

	}
}
