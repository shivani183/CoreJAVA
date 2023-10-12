package TryWithResourse;

import java.io.*;

public class Example02 {

	public static void main(String[] args) {
		BufferedReader bf =null;
		
		try {
			bf= new BufferedReader(new FileReader("result.txt"));
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(bf!=null) {
					bf.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
