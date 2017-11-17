package kotaro1114;

public class Task2 {
	public static void main(String[] args) {
		Trianle t = new Trianle();
		double a = t.clacTrigleArea(65.0,64.6);
		System.out.println(a);
		Circle c = new Circle();
		double b = c.clacCircleArea(2.0);
		System.out.print(b);
	}
}
class Trianle{
	public double clacTrigleArea(double bottom,double height) {
		double are = bottom*height/2;
		return are;
	}
}
class Circle{
	public double clacCircleArea(double radius) {
		double are = radius*radius*3.14;
		return are;
	}
}