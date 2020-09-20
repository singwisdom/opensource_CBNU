// 2018038029 신지혜 //
package homework1;
import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String str[]= {"가위","바위","보"}; // 배열을 가위, 바위, 보로 초기화
		String user;

		System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.\n");
		
		while(true) // 반복문
		{
			int n=(int)(Math.random()*3); // 랜덤함수
			System.out.print("가위 바위 보!>>");
			user=scanner.next(); // 사용자로부터 문자를 입력받는다
			
			if(user.equals("가위")) // 만약 사용자가 가위를 입력했다면
			{
				if(str[n].equals("가위")) // 만약 컴퓨터가 가위를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 비겼습니다.");
				else if(str[n].equals("바위")) // 만약 컴퓨터가 바위를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 졌습니다.");
				else if(str[n].equals("보")) // 만약 컴퓨터가 보를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 이겼습니다.");				
			}
			else if(user.equals("바위")) // 만약 사용자가 바위를 입력했다면
			{
				if(str[n].equals("가위")) // 만약 컴퓨터가 가위를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 이겼습니다.");
				else if(str[n].equals("바위")) // 만약 컴퓨터가 바위를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 비겼습니다.");
				else if(str[n].equals("보")) // 만약 컴퓨터가 보를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 졌습니다.");
			}
			else if(user.equals("보")) // 만약 사용자가 보를 입력했다면
			{
				if(str[n].equals("가위")) // 만약 컴퓨터가 가위를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 졌습니다.");
				else if(str[n].equals("바위")) // 만약 컴퓨터가 바위를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 이겼습니다.");
				else if(str[n].equals("보")) // 만약 컴퓨터가 보를 선택했다면
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 비겼습니다.");
			}
			else if(user.equals("그만")) // 만약 사용자가 '그만'을 입력했다면
				break; // 반복문을 탈출한다
		}
		
		scanner.close();
	}

}
