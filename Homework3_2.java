package homework1;
import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String str[]= {"가위","바위","보"};
		String user;

		System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.\n");
		
		while(true)
		{
			int n=(int)(Math.random()*3);
			System.out.print("가위 바위 보!>>");
			user=scanner.next();
			
			if(user.equals("가위"))
			{
				if(str[n].equals("가위"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 비겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 졌습니다.");
				else if(str[n].equals("보"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 이겼습니다.");				
			}
			else if(user.equals("바위"))
			{
				if(str[n].equals("가위"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 이겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 비겼습니다.");
				else if(str[n].equals("보"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 졌습니다.");
			}
			else if(user.equals("보"))
			{
				if(str[n].equals("가위"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 졌습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 사용자가 이겼습니다.");
				else if(str[n].equals("보"))
					System.out.println("사용자  = "+user+" , "+"컴퓨터 = "+str[n] + " 비겼습니다.");
			}
			else if(user.equals("그만"))
				break;
		}
		
		scanner.close();
	}

}
