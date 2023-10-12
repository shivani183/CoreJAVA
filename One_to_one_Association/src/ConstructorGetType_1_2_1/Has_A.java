package ConstructorGetType_1_2_1;

import ConstructorType_1_2_1.Accounts;
import ConstructorType_1_2_1.Employee;

public class Has_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts account= new Accounts("acd123","savings","shivani");
		Employee emp =new Employee("shivani",12,123.34,account);
		emp.employeeDetails();
		

	}

}
