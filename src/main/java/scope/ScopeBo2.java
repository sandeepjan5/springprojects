package scope;

import org.springframework.stereotype.Component;

@Component("scopeBo2")
public class ScopeBo2 
{
	public String s1;
	public int s2;
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	
	public void show2()
	{
		System.out.println("Prototyping example");
	}

}
