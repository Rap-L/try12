class Area{
	float findArea(float side){
		return side*side;
	}
	float findArea(float length,float breadth){
		return length*breadth;
	}
	double findArea(double radius){
		return 3.14*radius*radius;
	}
	
}

public class Overload{
	public static void main(String[] args){
		Area a=new Area();
		System.out.println("Area of square:"+a.findArea(5.0f));
		System.out.println("Area of rectangle:"+a.findArea(4.0f,6.0f));
		System.out.println("Area of circle:"+a.findArea(3.0));
		}
}

