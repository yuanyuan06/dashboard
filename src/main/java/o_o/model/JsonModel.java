package o_o.model;

import java.io.Serializable;

public class JsonModel implements Serializable {

	private static final long serialVersionUID = 8039851404968959783L;
	
	private String a;
	private String b;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
}
