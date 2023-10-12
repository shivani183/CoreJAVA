package Setter1_2_many;

import ConstrType1_2_many.worker;

public class Company {
	String cname;
	Integer cid;
	Employee123 employee[];
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public void setEmployee(Employee123[] employee) {
		this.employee = employee;
	}
	public void getAllDetails() {
		System.out.println("Company  details: ");
		System.out.println("Name of company : " + cname);
		System.out.println("Id od company: " + cid);
		System.out.println();
		System.out.println("workers details : ");
		for(Employee123 emp:employee) {
			System.out.println("Worker name : "+emp.ename);
			System.out.println("Worker type: "+ emp.etype);
			System.out.println("Worker id : "+emp.eid);
			System.out.println();}


	}
}
