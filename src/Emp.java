import java.util.ArrayList;


public class Emp {
	
	ArrayList<Emp> userlist = new ArrayList<>();
	
	
	
    private int EmployeeID;
    private String EmployeeFirstName;
    private String EmployeeLastName;
    private int IsSalary;
    private int IsAdmin;
    private String Password;
    
   

    public Emp() {
    	
    	userlist.add(new Emp(1220,"Wellspring","John",0,1,"password1"));
    	userlist.add(new Emp(1216,"Tundra","Jake",0,0,"password2"));
    	userlist.add(new Emp(1217,"Wood","Riley",0,0,"password3"));
    	
        this.EmployeeID = 0;
        this.EmployeeFirstName = null;
        this.EmployeeLastName = null;
        this.IsSalary = 0;
        this.IsAdmin = 0;
        this.Password = "password";
        
    }

    

    public Emp(int id, String first, String last, int isSalary, int isAdmin, String pass) {
        this.EmployeeID = id;
        this.EmployeeFirstName = first;
        this.EmployeeLastName = last;
        this.IsSalary = (isSalary > 0) ? 1 : 0;
        this.IsAdmin = (isAdmin > 0) ? 1 : 0;
        this.Password = pass;
    }

   

   
    public int getEmployeeID() {
        return (EmployeeID != 0) ? EmployeeID : 0;
    }

    
    public String getFirstName() {
        return (EmployeeFirstName != null) ? EmployeeFirstName : "(Not Set)";
    }

    public String getLastName() {
        return (EmployeeLastName != null) ? EmployeeLastName : "(Not Set)";
    }

   
    public boolean getIsSalary_bool() {
        return IsSalary > 0;
    }

   
    public int getIsSalary_int() {
        return IsSalary;
    }

   
    public boolean getIsAdmin_bool() {
        return IsAdmin > 0;
    }

 
    public int getIsAdmin_int() {
        return IsAdmin;
    }

   
    public String getPassword() {
        return (Password != null) ? Password : "(Not Set)";
    }

 
    public void setEmployeeID(int id) {
        EmployeeID = id;
    }

   
    public void setFirstName(String first) {
        EmployeeFirstName = first;
    }

   
    public void setLasttName(String last) {
        EmployeeLastName = last;
    }

    
    public void setIsSalary(boolean isSalary) {
        IsSalary = (isSalary) ? 1 : 0;
    }

  
    public void setIsSalary(int isSalary) {
        IsSalary = (isSalary > 0) ? 1 : 0;
    }

    
    public void setIsAdmin(boolean isAdmin) {
        IsAdmin = (isAdmin) ? 1 : 0;
    }

    
    public void setIsAdmin(int isAdmin) {
        IsAdmin = (isAdmin > 0) ? 1 : 0;
    }

  
    public void setPassword(String pass) {
        Password = pass;
    }

   
    
    @SuppressWarnings("rawtypes")
	public ArrayList getLoginInfo(){                                                                                                          
		return userlist;                                                                                                                         
	}         

   
    @Override
    public String toString() {
        return getEmployeeID() + " " + getFirstName() + " " + getLastName();
    }

   
   

}
