// 2018038029 신지혜 //
package homework1;
import java.util.Scanner;

public class Homework1 
{
 public static void main(String[] args)
 {
	 System.out.println("첫 번쨰 원의 중심과 반지름 입력>>");
	 Scanner a = new Scanner(System.in);
	 
	 int x=a.nextInt();
	 int x1=a.nextInt();
	 double r1=a.nextDouble();
	 
	 System.out.println("두 번째 원의 중심과 반지름 입력>>");
	 int y=a.nextInt();
	 int y1=a.nextInt();
	 double r2=a.nextDouble();
	 
	 double distance=0;
	 distance=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	 
	 if(distance<=r1+r2)
		 System.out.println("두 원은 서로 겹친다.");
	 else
		 System.out.println("두 원은 서로 겹치지 않는다.");
	 a.close();
 }
}
