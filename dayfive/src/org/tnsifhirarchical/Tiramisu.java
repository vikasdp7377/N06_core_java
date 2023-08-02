package org.tnsifhirarchical;
//child class
public class Tiramisu extends Android {
	
	//private data member
	private int version;
	
	
	//getter setter
	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public Tiramisu(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	

}
