import java.util.ArrayList;

public class Report {
	ArrayList<Report> log = new ArrayList<>();
	
	private int empID;
	private String datenTime;
	private String Clocki;
	
	public Report() {
		super();
		empID=0;
		this.datenTime=null;
		this.Clocki=null;
	}
	
	public Report(String Clockin,int ID,String dt) {
		super();
		empID=ID;
		this.datenTime=dt;
		this.Clocki=Clockin;
	}
	
	public int getID() {
		return empID;
	}
	
	public void setID(int I) {
		empID=I;
	}
	
	public String getDaten() {
		return datenTime;
	}
	public void setDaten(String d) {
		this.datenTime=d;
	}
	
	public String getclock() {
		return Clocki;
	}
	public void setclock(String c) {
		this.Clocki=c;
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getReport(){                                                                                                          
		return log;                                                                                                                         
	}  
	@Override
	   public String toString() {
	        return (this.getclock()+" User: "+this.getID()+ " Time: "+ this.getDaten()+"\n");
	   }
	

}
