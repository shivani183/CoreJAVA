package SetType_1_2_1;

public class Employee1 {
	String empName;
	Integer empId;
	Float empSallary;
	Account1 account2;

	public void setAccount2(Account1 account2) {
		this.account2 = account2;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void setEmpSallary(Float empSallary) {
		this.empSallary = empSallary;
	}
	public void getDetails() {
		System.out.println("Employees details: ");
		System.out.println("Name of employee : " + empName);
		System.out.println("Id : " + empId);
		System.out.println("Sallary : " + empSallary);
		System.out.println("Accounts : ");
		System.out.println("Account num : "+account2.accnum);
		System.out.println("Account type: "+ account2.acctype);
		System.out.println("Account holder name : "+account2.accname);
	}

}
