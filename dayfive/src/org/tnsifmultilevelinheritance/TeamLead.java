package org.tnsifmultilevelinheritance;

public class TeamLead extends Manager{
	
	
	private String projectName;
	private String leadName;
	
	
	
    //getter  setter
	public String getProjectName() {
		return projectName;
	}




	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}




	public String getLeadName() {
		return leadName;
	}




	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}



	//
	public TeamLead(String deptNo, String name, int empId, String leadName,String projectName) {
		super(deptNo, name, empId);
		// TODO Auto-generated constructor stub
		this.leadName=leadName;
		this.projectName = projectName;
		
		
	}




	@Override
	public String toString() {
		return "TeamLead [projectName=" + projectName + ", leadName=" + leadName + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
