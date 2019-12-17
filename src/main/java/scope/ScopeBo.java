package scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ScopeBo 
{
	public String a1;
	public int a2;
	
	@Autowired
	@Qualifier("scopeBo2")
	private ScopeBo2 bo2;
	public ScopeBo2 getBo2() {
		return bo2;
	}
	public void setBo2(ScopeBo2 bo2) {
		this.bo2 = bo2;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	
	public void Show()
	{
		System.out.println("Scope Example");
		bo2.show2();
	}
	
	

}
