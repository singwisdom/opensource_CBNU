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
		System.out.println("현재 "+n.size()+"개 나라와 수도가 입력되어있습니다.");
		while(true)
		{
			System.out.println("나라와 수도 입력"+(n.size()+1)+">>");
			country=s.next(); capital=s.next();
			for(int j=0;j<n.size();j++)
			{
				if(n.get(j).getCountry().equals(country))
					System.out.println(country+"는 이미 있습니다!");
				if(j+1==n.size()&&(n.get(j).getCountry()!=country))
					break;
			}
			
			if(country=="그만") 
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
			
			System.out.println(question + "의 수도는? ");
			
			answerfromuser=s.next();
			if(answerfromuser.equals("그만")) break;
			if(answerfromuser.equals(answer)) System.out.println("정답입니다!");
			else System.out.println("아닙니다!!");
			
		}
	}
	
	public void run() 
	{
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) 
		{
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = s.nextInt();
			switch(menu)
			{
				case 1: menu1(); break;
				case 2: quiz(); break;
				case 3: System.out.println("게임을 종료합니다.\n");  return;
			}
		}
	}
		
	
		
	public static void main(String args[])
	{		
		
		Homework7 game = new Homework7 ();
		game.run();
		
			
	}
}
