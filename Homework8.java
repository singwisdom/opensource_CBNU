// 2018038029 ������ //

package homework;
import java.io.*;
import java.util.*;

public class Homework8
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>>");
		
		try
		{
			File file=new File("C:\\Users\\������\\JAVA\\homework1\\src\\homework",s.next()); // ������ ����
			s.nextLine();
			for(;;)
			{
				Scanner fscanner = new Scanner(new FileInputStream(file),"MS949"); // �ؽ�Ʈ ������ �д´�
				
				int linenumber=1;
				System.out.println("�˻��� �ܾ ����>> ");
				String search=s.nextLine(); // ����ڿ��� �˻����� �ܾ �Է¹޴´�
				if(search.equals("�׸�")) // ����ڰ� �׸��� �Է��ϸ� ���α׷��� �����Ѵ�
					{System.out.println("���α׷��� �����մϴ�.");
					return;}
				
				while(fscanner.hasNext())
				{
					String line=fscanner.nextLine();
					if(line.contains(search)) //  ���� �ؽ�Ʈ ������ ���忡 ã���� �ϴ� �ܾ �ִٸ�
					{
						System.out.println(linenumber+":"+line); // �����ȣ�� �ش� ������ ����Ѵ�
					}
					linenumber++; // �����ȣ�� 1�� ��������
				}
				
			}
			
		}
		
		catch(FileNotFoundException e) // ����ڿ��� �Է¹��� ������ �������� �ʴ´ٸ�
		{
			System.out.println("�ش� ������ �������� �ʽ��ϴ�."); // �������� �ʴ� �ٴ� ������ ����Ѵ�
		}
		
		s.close();
		
	}
}
