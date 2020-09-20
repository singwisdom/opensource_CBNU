// 2018038029 신지혜 //
package homework1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Homework3_1 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=0,m=0; // 입력받을 변수 n,m을 0으로 초기화한다
		while(true)
		{
			System.out.print("곱하고자 하는 두 수 입력>>");
			try // 예외가 발생할 가능성이 있는 실행문 (정수외의 숫자를 입력)
			{
				n=scanner.nextInt(); // 사용자로부터 정수형을 입력받는다
				m=scanner.nextInt(); // 사용자로부터 정수형을 입력받는다
				System.out.print(n+"x"+m+"="+n*m); // n*m을 출력한다
				break; // 반복문을 탈출한다
			}
			catch(InputMismatchException e) // 위의 try문에서 예외가 발생할때 실행됨
			{
				System.out.println("실수는 입력하면 안됩니다."); // 실수는 입력하면 안된다는 경고문 출력
				scanner.nextLine(); // 위에서 이미 입력된 수를 제거하기 위함
			}
		}
		scanner.close();
	}
}
