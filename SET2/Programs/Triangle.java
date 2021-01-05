
public class Triangle {
	public Triangle() {
		double perimeter;
		double area;
		//sides s1,s2,s3
		int s1=3,s2=4,s3=5;
		
		perimeter=s1+s2+s3;
		double phalf = perimeter/2;
		//Using Heron's Formula to calculate Area 
		area=Math.sqrt(phalf*(phalf-s1)*(phalf-s2)*(phalf-s3));
		
		System.out.println("Perimeter Of Triangle with sides 3,4,5 = "+perimeter);
		System.out.println("Area Of Triangle with sides 3,4,5 = "+area);
		
	}
	public static void main(String[] args) {
		Triangle ob = new Triangle();
	}
}
