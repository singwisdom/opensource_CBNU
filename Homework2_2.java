// 2018038029 ������ //
package homework1;
import java.util.Scanner;

public class Homework2_2 {

	public static void main(String[] args)
	{
		int result;
		Scanner s=new Scanner(System.in);
		System.out.print("����>>");
		int a=s.nextInt();
		String op=s.next();
		int b=s.nextInt();
		
		switch(op)
		{
		case "+":
			result=a+b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
			break;
		case "-":
			result=a-b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
			break;
		case "*":
			result=a*b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
			break;
		case "/":
			if(b==0){
				System.out.print("0���� ���� �� �����ϴ�.");
				break;
			}
			else
			{
			result=a/b;
			System.out.print(a+op+b+"�� ��� ����� "+result);
			break;
			}			
		}
		s.close();
	}

}
