package AssignmrntForJAvaCourse;
class Words{
	String x= "@shivani#sahu*";
	char[] ar= x.toCharArray();
	char [] vo= {'i','a','o','e','u'};
	int countvowel=0;
	int countconsonant=0;
	int specialChar=0;
	
	void findVowel() {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<vo.length;j++) {
				if(ar[i]==vo[j]) {
					countvowel++;
					break;}
			}			
		}
		System.out.println("Length of the string is : "+x.length());
		System.out.println("No. of Vowels in string : "+countvowel);
		//System.out.println(countconsonant=(x.length()-countvowel));
	}
	void findConsonant() {
		int j;
		for(int i=0;i<ar.length;i++) {
			for(j=0;j<vo.length;j++) {
				if(ar[i]==vo[j]) 
					break;
			}if(j==5) {
				if(ar[i]>64 && ar[i]<=122){
					countconsonant++;
				}
			}
		}
		System.out.println("No. of Consonant in string : "+countconsonant);	
}
	void findSpecialCharacter() {
		
		for(int i=0;i<x.length();i++) {
			if((x.charAt(i)>64 && x.charAt(i)<=122) ||(x.charAt(i)>=48 && x.charAt(i)<58)) {
				
			}else
				specialChar++;
		}
		System.out.println("No. of Special character in string : "+specialChar);	
}
	}
public class Assign_04 {
	public static void main(String[] args) {
		Words w =new Words();
		w.findVowel();
		w.findConsonant();
		w.findSpecialCharacter();
	}
}
