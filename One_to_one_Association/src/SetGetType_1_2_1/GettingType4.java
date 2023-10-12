package SetGetType_1_2_1;

import SetType_1_2_1.Account1;
import SetType_1_2_1.Employee1;

public class GettingType4 {

	public static void main(String[] args) {
		Account1 acc= new Account1();
		acc.setAccname("avi");
		acc.setAccnum("27hsd82");
		acc.setAcctype("saving");
		Employee1 emp1= new Employee1();
		emp1.setEmpName("shivani");
		emp1.setEmpId(12);
		emp1.setEmpSallary(423211.33f);
		emp1.setAccount2(acc);
		emp1.getDetails();

	}

}
