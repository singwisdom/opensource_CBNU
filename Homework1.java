// 2018038029 ������ //
package homework1;
import java.util.Scanner;

public class Homework1 
{
 public static void main(String[] args)
 {
	 System.out.println("ù ���� ���� �߽ɰ� ������ �Է�>>");
	 Scanner a = new Scanner(System.in);
	 
	 int x=a.nextInt();
	 int x1=a.nextInt();
	 double r1=a.nextDouble();
	 
	 System.out.println("�� ��° ���� �߽ɰ� ������ �Է�>>");
	 int y=a.nextInt();
	 int y1=a.nextInt();
	 double r2=a.nextDouble();
	 
	 double distance=0;
	 distance=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	 
	 if(distance<=r1+r2)
		 System.out.println("�� ���� ���� ��ģ��.");
	 else
		 System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
	 a.close();
 }
}
