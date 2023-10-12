package GetBySetter_1_2_many;

import Setter1_2_many.Company;
import Setter1_2_many.Employee123;

public class GetDetails {

	public static void main(String[] args) {
		Employee123 e1= new Employee123();
		e1.setWid(34);
		e1.setWname("subha");
		e1.setWtype("tester");
		Employee123 e2= new Employee123();
		e2.setWid(4);
		e2.setWname("abha");
		e2.setWtype("developer");
		Employee123 e3= new Employee123();
		e3.setWid(3);
		e3.setWname("nisha");
		e3.setWtype("manager");
		Employee123[] xy= new Employee123[3];
		xy[0]=e1;
		xy[1]=e2;
		xy[2]=e3;
		
		Company c= new Company();
		c.setCid(900);
		c.setCname("infosys");
		c.setEmployee(xy);
		c.getAllDetails();
	}

}
