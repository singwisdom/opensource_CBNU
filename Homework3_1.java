// 2018038029 ������ //
package homework1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Homework3_1 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=0,m=0; // �Է¹��� ���� n,m�� 0���� �ʱ�ȭ�Ѵ�
		while(true)
		{
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try // ���ܰ� �߻��� ���ɼ��� �ִ� ���๮ (�������� ���ڸ� �Է�)
			{
				n=scanner.nextInt(); // ����ڷκ��� �������� �Է¹޴´�
				m=scanner.nextInt(); // ����ڷκ��� �������� �Է¹޴´�
				System.out.print(n+"x"+m+"="+n*m); // n*m�� ����Ѵ�
				break; // �ݺ����� Ż���Ѵ�
			}
			catch(InputMismatchException e) // ���� try������ ���ܰ� �߻��Ҷ� �����
			{
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�."); // �Ǽ��� �Է��ϸ� �ȵȴٴ� ��� ���
				scanner.nextLine(); // ������ �̹� �Էµ� ���� �����ϱ� ����
			}
		}
		scanner.close();
	}
}
