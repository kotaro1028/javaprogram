package kotaro1115;


interface Animal{

void eat();
void move();
}
class rion implements Animal{
public  void eat() {

System.out.println("ライオンが肉を食べています");
}
public void move() {

System.out.println("ライオンが走っています");
}}

class Task3{
 public static void main(String args[]) {

rion ri = new rion();
ri.eat();
ri.move();
	}
}
