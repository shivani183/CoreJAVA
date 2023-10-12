package AssignmentPart2;

public class CodeForV {

	public static void main(String[] args) {
		int a = 8;
	
		for(int j=1;j<=a;j++){
			  for(int i=1;i<=j-1;i++){
			    System.out.print(" ");
			  }
			  for(int col=a;col>=j;col--){
			    if((col==j)||col==a){
			      System.out.print("* ");
			    }
			    else{
			      System.out.print("  ");
			    }
			  }
			  System.out.println();
			}

	}

}
