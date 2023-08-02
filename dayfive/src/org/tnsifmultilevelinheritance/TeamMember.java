package org.tnsifmultilevelinheritance;

public class TeamMember extends TeamLead {
	
	private int size;
	private int duration;
	
	
	

	public int getSize() {
		return size;
	}




	public void setSize(int size) {
		this.size = size;
	}




	public int getDuration() {
		return duration;
	}




	public void setDuration(int duration) {
		this.duration = duration;
	}




	public TeamMember(String deptNo, String name, int empId, String leadName, String projectName,int size,int duration) {
		super(deptNo, name, empId, leadName, projectName);
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
