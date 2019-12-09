package boot.jpa.model;

public class Alien 
{
	private String aname;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	private int aid;
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + "]";
	}
	
	
	

}
