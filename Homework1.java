// 2018038029 신지혜 //
package homework1;
import java.util.Scanner;
	public class Homework1 
	{
	 public static void main(String[] args)
	 {
		 Scanner a = new Scanner(System.in);
		 double distance;
		 
		 System.out.println("첫 번째 원의 중심과 반지름 입력>>");
		 int x=a.nextInt();
		 int x1=a.nextInt();
		 double r1=a.nextDouble();
		 System.out.println("두 번째 원의 중심과 반지름 입력>>");
		 int y=a.nextInt();
		 int y1=a.nextInt();
		 double r2=a.nextDouble();
		 
	
		 distance=Math.sqrt(((x-y)*(x-y))+((x1-y1)*(x1-y1)));
		 
		 if(distance<=r1+r2)
			 {System.out.println("두 원은 서로 겹친다.");}
		 else
			 {System.out.println("두 원은 서로 겹치지 않는다.");}
		 a.close();
	 }
	}