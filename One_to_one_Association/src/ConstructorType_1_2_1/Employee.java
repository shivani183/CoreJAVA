package ConstructorType_1_2_1;

public class Employee {
	private String eName;
	private Integer eId;
	private Double eSallary;
	
	Accounts account;
	
	
	public Employee(String eName, Integer eId, Double eSallary, Accounts account) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSallary = eSallary;
		this.account = account;
	}

public void employeeDetails() {
	System.out.println("Employees details: ");
	System.out.println("Name of employee : " + eName);
	System.out.println("Id : " + eId);
	System.out.println("Sallary : " + eSallary);
	System.out.println("Accounts : ");
	System.out.println("Account num : "+account.accNum);
	System.out.println("Account type: "+ account.accType);
	System.out.println("Account holder name : "+account.accHname);
	

}
}
