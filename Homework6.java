// 2018038029 ������ //
package homework;
import java.util.Scanner;

class person
{
	protected String name; // ������� �̸��� ������ ����
	private int a,b,c; // ���� ���ڸ� ������ ������ ����
	
	public boolean random()
	{
		this.a=(int)((Math.random()*3)+1); // 1~3 �� �������� ���ڸ� ����
		this.b=(int)((Math.random()*3)+1);
		this.c=(int)((Math.random()*3)+1);
		
		System.out.print("\t"+a+"  "+b+"  "+c+"   ");
		
		if((a==b)&&(b==c)) // ���� �� ���ڰ� ��� ���ٸ�
			return true; // true�� ����
		else // �� ���ڰ� ��� ���� �ʴٸ�
			return false; // false�� ����
	}
}

public class Homework6 
{
	public static void main (String [] args)
	{
		
		person p1 = new person();
		person p2 = new person();
		Scanner s= new Scanner(System.in);
		
		System.out.println("1��° ���� �̸� >>"); // ù��° ������� �̸��� �Է¹޴´�
		p1.name=s.next();
		System.out.println("2��° ���� �̸� >>"); // �ι�° ������� �̸��� �Է¹޴´�
		p2.name=s.next();
		
		String buffer = s.nextLine();
		
		while(true) // �ݺ����� Ż���Ҷ����� ��� �ݺ�
		{
			System.out.println("["+p1.name+"]:<Enter>"); // ù��° ������� �̸� ���
			buffer = s.nextLine(); // ����Ű�� �Է¹���
			if(p1.random()) // ���� �������� ��� �� ������ ���ڰ� ���ٸ�
				{System.out.println(p1.name+"���� �̰���ϴ�!"); break;} // �̰�ٴ� ���� ��� ��, �ݺ��� Ż��
			else
				System.out.println("�ƽ�����!");
			
			System.out.println("["+p2.name+"]:<Enter>"); // �ι�° ������� �̸� ���
			buffer = s.nextLine(); // ����Ű�� �Է¹���
			if(p2.random()) // ���� �������� ��� �� ������ ���ڰ� ���ٸ�
				{System.out.println(p2.name+"���� �̰���ϴ�!"); break;} // �̰�ٴ� ���� ��� ��, �ݺ��� Ż��
			else
				System.out.println("�ƽ�����!");
			
		}
		
	s.close();
	}
	
}
