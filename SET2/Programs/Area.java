import java.util.Scanner;

public class Area {
	
	String area= "";

	Area(double length,double breadth){	
		area=String.format("%.3f", (length*breadth));
	}
	String returnArea() {
		return this.area;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  length and beadth of rectangle :");
		double length = sc.nextDouble();
		double breadth=sc.nextDouble();
		Area ob = new Area(length,breadth);
		String area = "";
		area=ob.returnArea();
		
		System.out.println("Area of rectangle = "+area);
		
		
	}

	
}
