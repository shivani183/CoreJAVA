package AccessModifier;
class Interest{
	public void excess() {
		
	}
}
class PersonalInterest extends Interest{
	public void excess() {
		
		}
	}
	

class Loan{
	public Interest loanInterest() {
		Interest i =new Interest();
			return i;
	}	
}
class PersonalLoan extends Loan{
	public PersonalInterest loanInterest() {
		PersonalInterest pi =new PersonalInterest();
		return pi;
	}
}





public class ReturnTypeInParentChil {

	public static void main(String[] args) {
		Interest i = new Interest();
	

	}

}
