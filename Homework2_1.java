// 2018038029 ������ //
package homework1;
import java.util.Scanner;

public class Homework2_1 {
	public static void main(String[] args)
	{
		int result;
		Scanner s=new Scanner(System.in);
		System.out.print("����>>");
		int a=s.nextInt();
		String op=s.next();
		int b=s.nextInt();
		
		if(op.equals("+")) {
			result=a+b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
		}
		else if(op.equals("-")) {
			result=a-b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
		}
		else if(op.equals("*")) {
			result=a*b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
		}
		else if(op.equals("/")) {
			if(b==0)
				{System.out.print("0���� ���� �� �����ϴ�.");}
			else {
			result=a/b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
			}
		}
		s.close();
	}

}
