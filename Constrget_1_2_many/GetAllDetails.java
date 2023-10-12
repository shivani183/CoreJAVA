package Constrget_1_2_many;

import ConstrType1_2_many.Company;
import ConstrType1_2_many.worker;

public class GetAllDetails {

	public static void main(String[] args) {
		worker w1= new worker("shiv", "accountant",67);
		worker w2= new worker("avi", "tester",07);
		worker w3= new worker("nisha", "developer",60);
		worker[] work =new worker[3];
		work[0]=w1;
		work[1]=w2;
		work[2]=w3;
		
		
		Company comp =new Company("shivani", 34,work );
		comp.getAllDetails();
	}

}
