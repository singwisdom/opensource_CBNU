package homework;

class Point
{
	private int x,y; // 한 점을 구성하는 x,y 좌표
	public void set(int x, int y)
	{
		this.x=x; this.y=y;
	}
	public void showPoint() // 점의 좌표 출력
	{
		System.out.println("(" +x+","+y+ ")");
	}
}

// point 를 상속받은 ColorPoint 선언
class ColorPoint extends Point
{
	private String color;
	public void setColor(String color)
	{
		this.color=color;
	}
	public void showColorPoint()
	{
		System.out.print(color);
		showPoint();
	}
}

public class Homework5_1 {
	public static void main(String [] args)
	{
		Point p= new Point(); //point 객체 생성
		p.set(1, 2); // point 클래스의 set() 호출
		p.showPoint();
		
		ColorPoint cp= new ColorPoint(); //ColorPoint 객체
		cp.set(3,4); // point 클래스의 set() 호출
		cp.setColor("red"); // ColorPoint의 setColor() 호출
		cp.showColorPoint(); // 컬러와 좌표 출력
	}

}
