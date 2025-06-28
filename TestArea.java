import java.util.*;
abstract class Shape
{
int l,b,r;
Scanner sc =new Scanner(System.in);
abstract void printArea();
}
class Rectangle extends Shape
{
void printArea()
{
System.out.println("area of rectangle");
System.out.println("enter l and b");
int l=sc.nextInt();
int b=sc.nextInt();
System.out.println("area of rectangle:"+ l*b);
}
}
class Triangle extends Shape
{
void printArea()
{
System.out.println("area of Triangle");
System.out.println("enter l and b");
int l=sc.nextInt();
int b=sc.nextInt();
System.out.println("area of rectangle:"+0.5*(l*b));
}
}
class Circle extends Shape
{
void printArea()
{
System.out.println("area of Circle");
System.out.println("enter r value");
int r=sc.nextInt();
System.out.println("area of circle:"+ 3.14*r*r);
}
}
class TestArea
{
public static void main(String args[])
{
Rectangle r= new Rectangle();
r.printArea();
Triangle t= new Triangle();
t.printArea();
Circle c= new Circle();
c.printArea();
}
}









