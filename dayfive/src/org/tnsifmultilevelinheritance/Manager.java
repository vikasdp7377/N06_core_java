package org.tnsifmultilevelinheritance;
//parent class
public class Manager {
	
	private String deptNo;
	private String name;
	private int empId;
	
	
	//get
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Manager [deptNo=" + deptNo + ", name=" + name + ", empId=" + empId + ", toString()=" + super.toString()
				+ "]";
	}
	public Manager(String deptNo, String name, int empId) {
		super();
		this.deptNo = deptNo;
		this.name = name;
		this.empId = empId;
	}
	
	
	

}
