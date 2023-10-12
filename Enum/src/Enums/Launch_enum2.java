package Enums;
enum Colors{
	BLUE, RED, BLACK, WHITE;
	
	int colorsId;

	public int getColorsId() {
		return colorsId;
	}
	public void setColorsId(int colorsId) {
		this.colorsId = colorsId;
	}
	
	Colors(int setId){
		System.out.println("hi");
	}
	Colors(){
		System.out.println("hello");
	}
}
public class Launch_enum2 {

	public static void main(String[] args) {
		
		Colors.RED.setColorsId(22);
		System.out.println(Colors.RED.getColorsId());
		//Colors c = new Colors.RED.colorsId();
		
		

	}

}
