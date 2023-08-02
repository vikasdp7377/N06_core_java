package org.tnsifhirarchical;

public class SnowCone extends Android {
	
	
	//private data member
		private int version;
		
		
		//getter setter
		public int getVersion() {
			return version;
		}



		public void setVersion(int version) {
			this.version = version;
		}



	public SnowCone(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
	}
	
	

}
