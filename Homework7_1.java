package homework;
import java.util.Scanner;
import java.util.Vector;

class Nation
{
	private String country,capital;
	
	public Nation(String country, String capital)
	{
		this.country=country;
		this.capital=capital;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String getCapital()
	{
		return capital;
	}
}


public class Homework7 
{
	String country,capital,question,answer,answerfromuser;
	Vector<Nation> n=new Vector<Nation>();
	Scanner s=new Scanner(System.in);
	
	private void menu1()
	{
		System.out.println("���� "+n.size()+"�� ����� ������ �ԷµǾ��ֽ��ϴ�.");
		while(true)
		{
			System.out.println("����� ���� �Է�"+(n.size()+1)+">>");
			country=s.next(); capital=s.next();
			for(int j=0;j<n.size();j++)
			{
				if(n.get(j).getCountry().equals(country))
					System.out.println(country+"�� �̹� �ֽ��ϴ�!");
				if(j+1==n.size()&&(n.get(j).getCountry()!=country))
					break;
			}
			
			if(country=="�׸�") 
				break;
			else 
				n.add(new Nation(country,capital));
			
		}
	}
	
	private void quiz()
	{
		while(true)
		{
			int index=(int)(Math.random()*n.size());
			Nation nation=n.get(index);
			question=nation.getCountry();
			answer=nation.getCapital();
			
			System.out.println(question + "�� ������? ");
			
			answerfromuser=s.next();
			if(answerfromuser.equals("�׸�")) break;
			if(answerfromuser.equals(answer)) System.out.println("�����Դϴ�!");
			else System.out.println("�ƴմϴ�!!");
			
		}
	}
	
	public void run() 
	{
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) 
		{
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = s.nextInt();
			switch(menu)
			{
				case 1: menu1(); break;
				case 2: quiz(); break;
				case 3: System.out.println("������ �����մϴ�.\n");  return;
			}
		}
	}
		
	
		
	public static void main(String args[])
	{		
		
		Homework7 game = new Homework7 ();
		game.run();
		
			
	}
}
