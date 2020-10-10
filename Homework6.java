// 2018038029 신지혜 //
package homework;
import java.util.Scanner;

class person
{
	protected String name; // 사용자의 이름을 저장할 변수
	private int a,b,c; // 랜덤 숫자를 저장할 세개의 변수
	
	public boolean random()
	{
		this.a=(int)((Math.random()*3)+1); // 1~3 중 랜덤으로 숫자를 지정
		this.b=(int)((Math.random()*3)+1);
		this.c=(int)((Math.random()*3)+1);
		
		System.out.print("\t"+a+"  "+b+"  "+c+"   ");
		
		if((a==b)&&(b==c)) // 만약 세 숫자가 모두 같다면
			return true; // true를 리턴
		else // 세 숫자가 모두 같지 않다면
			return false; // false를 리턴
	}
}

public class Homework6 
{
	public static void main (String [] args)
	{
		
		person p1 = new person();
		person p2 = new person();
		Scanner s= new Scanner(System.in);
		
		System.out.println("1번째 선수 이름 >>"); // 첫번째 사용자의 이름을 입력받는다
		p1.name=s.next();
		System.out.println("2번째 선수 이름 >>"); // 두번째 사용자의 이름을 입력받는다
		p2.name=s.next();
		
		String buffer = s.nextLine();
		
		while(true) // 반복문을 탈출할때까지 계속 반복
		{
			System.out.println("["+p1.name+"]:<Enter>"); // 첫번째 사용자의 이름 출력
			buffer = s.nextLine(); // 엔터키를 입력받음
			if(p1.random()) // 만약 랜덤으로 출력 된 세개의 숫자가 같다면
				{System.out.println(p1.name+"님이 이겼습니다!"); break;} // 이겼다는 문구 출력 후, 반복문 탈출
			else
				System.out.println("아쉽군요!");
			
			System.out.println("["+p2.name+"]:<Enter>"); // 두번째 사용자의 이름 출력
			buffer = s.nextLine(); // 엔터키를 입력받음
			if(p2.random()) // 만약 랜덤으로 출력 된 세개의 숫자가 같다면
				{System.out.println(p2.name+"님이 이겼습니다!"); break;} // 이겼다는 문구 출력 후, 반복문 탈출
			else
				System.out.println("아쉽군요!");
			
		}
		
	s.close();
	}
	
}
