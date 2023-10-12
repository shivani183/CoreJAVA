package ConstrType1_2_many;

public class Company {
	String cname;
	Integer cid;
	worker work[];
	public Company(String cname, Integer cid, worker[] work) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.work = work;
	}
	public void getAllDetails() {
		System.out.println("Company  details: ");
		System.out.println("Name of company : " + cname);
		System.out.println("Id od company: " + cid);
		System.out.println();
		System.out.println("workers details : ");
		for(worker wr:work) {
			System.out.println("Worker name : "+wr.wname);
			System.out.println("Worker type: "+ wr.wtype);
			System.out.println("Worker id : "+wr.wid);
			System.out.println();
		}
		
		
	}

	

}
