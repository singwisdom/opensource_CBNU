// 2018038029 ������ //
package homework1;
import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String str[]= {"����","����","��"}; // �迭�� ����, ����, ���� �ʱ�ȭ
		String user;

		System.out.print("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.\n");
		
		while(true) // �ݺ���
		{
			int n=(int)(Math.random()*3); // �����Լ�
			System.out.print("���� ���� ��!>>");
			user=scanner.next(); // ����ڷκ��� ���ڸ� �Է¹޴´�
			
			if(user.equals("����")) // ���� ����ڰ� ������ �Է��ߴٸ�
			{
				if(str[n].equals("����")) // ���� ��ǻ�Ͱ� ������ �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " �����ϴ�.");
				else if(str[n].equals("����")) // ���� ��ǻ�Ͱ� ������ �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �����ϴ�.");
				else if(str[n].equals("��")) // ���� ��ǻ�Ͱ� ���� �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �̰���ϴ�.");				
			}
			else if(user.equals("����")) // ���� ����ڰ� ������ �Է��ߴٸ�
			{
				if(str[n].equals("����")) // ���� ��ǻ�Ͱ� ������ �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �̰���ϴ�.");
				else if(str[n].equals("����")) // ���� ��ǻ�Ͱ� ������ �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " �����ϴ�.");
				else if(str[n].equals("��")) // ���� ��ǻ�Ͱ� ���� �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �����ϴ�.");
			}
			else if(user.equals("��")) // ���� ����ڰ� ���� �Է��ߴٸ�
			{
				if(str[n].equals("����")) // ���� ��ǻ�Ͱ� ������ �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �����ϴ�.");
				else if(str[n].equals("����")) // ���� ��ǻ�Ͱ� ������ �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " ����ڰ� �̰���ϴ�.");
				else if(str[n].equals("��")) // ���� ��ǻ�Ͱ� ���� �����ߴٸ�
					System.out.println("�����  = "+user+" , "+"��ǻ�� = "+str[n] + " �����ϴ�.");
			}
			else if(user.equals("�׸�")) // ���� ����ڰ� '�׸�'�� �Է��ߴٸ�
				break; // �ݺ����� Ż���Ѵ�
		}
		
		scanner.close();
	}

}
