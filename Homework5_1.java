package homework;

class Point
{
	private int x,y; // �� ���� �����ϴ� x,y ��ǥ
	public void set(int x, int y)
	{
		this.x=x; this.y=y;
	}
	public void showPoint() // ���� ��ǥ ���
	{
		System.out.println("(" +x+","+y+ ")");
	}
}

// point �� ��ӹ��� ColorPoint ����
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
		Point p= new Point(); //point ��ü ����
		p.set(1, 2); // point Ŭ������ set() ȣ��
		p.showPoint();
		
		ColorPoint cp= new ColorPoint(); //ColorPoint ��ü
		cp.set(3,4); // point Ŭ������ set() ȣ��
		cp.setColor("red"); // ColorPoint�� setColor() ȣ��
		cp.showColorPoint(); // �÷��� ��ǥ ���
	}

}
