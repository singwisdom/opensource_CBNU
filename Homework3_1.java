package homework1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Homework3_1 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=0,m=0;
		while(true)
		{
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try
			{
				n=scanner.nextInt();
				m=scanner.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine(); // ������ �̹� �Էµ� ���� �����ϱ� ����
			}
		}
		scanner.close();
	}
}
