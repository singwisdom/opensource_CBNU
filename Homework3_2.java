package homework1;
import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String str[]= {"����","����","��"};
		String user;

		System.out.print("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.\n");
		
		while(true)
		{
			int n=(int)(Math.random()*3);
			System.out.print("���� ���� ��!>>");
			user=scanner.next();
			
			if(user.equals("����"))
			{
				if(str[n].equals("����"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " �����ϴ�.");
				else if(str[n].equals("����"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �����ϴ�.");
				else if(str[n].equals("��"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �̰���ϴ�.");				
			}
			else if(user.equals("����"))
			{
				if(str[n].equals("����"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �̰���ϴ�.");
				else if(str[n].equals("����"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " �����ϴ�.");
				else if(str[n].equals("��"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �����ϴ�.");
			}
			else if(user.equals("��"))
			{
				if(str[n].equals("����"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �����ϴ�.");
				else if(str[n].equals("����"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �̰���ϴ�.");
				else if(str[n].equals("��"))
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " �����ϴ�.");
			}
			else if(user.equals("�׸�"))
				break;
		}
		
		scanner.close();
	}

}
