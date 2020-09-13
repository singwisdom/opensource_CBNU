// 2018038029 신지혜 //
package homework1;
import java.util.Scanner;

public class Homework2_1 {
	public static void main(String[] args)
	{
		int result;
		Scanner s=new Scanner(System.in);
		System.out.print("연산>>");
		int a=s.nextInt();
		String op=s.next();
		int b=s.nextInt();
		
		if(op.equals("+")) {
			result=a+b;
			System.out.print(a+op+b+"의 계산 결과는 "+result);
		}
		else if(op.equals("-")) {
			result=a-b;
			System.out.print(a+op+b+"의 계산 결과는 "+result);
		}
		else if(op.equals("*")) {
			result=a*b;
			System.out.print(a+op+b+"의 계산 결과는 "+result);
		}
		else if(op.equals("/")) {
			if(b==0)
				{System.out.print("0으로 나눌 수 없습니다.");}
			else {
			result=a/b;
			System.out.print(a+op+b+"의 계산 결과는 "+result);
			}
		}
		s.close();
	}

}
