// 2018038029 ������ //
package homework;
import java.util.Scanner;


class Reserve
{
	Scanner s=new Scanner(System.in);
	String name;
	int seat,seatnum=0;
	private String S [];
	private String A [];
	private String B [];
	
	
	Reserve() // �迭 �ʱ�ȭ
	{
		S=new String[10];
		A=new String[10];
		B=new String[10];
		
		for(int i=0;i<10;i++)
		{
			S[i] ="�ѤѤ�";
			A[i] ="�ѤѤ�";
			B[i] ="�ѤѤ�";
		}
		
	}
	
	
	void seat() // �¼� ���� �Լ�
	{
		while(true)
		{	System.out.print("�¼����� S(1), A(2), B(3)>>>");
			int num=s.nextInt();
			if(num!=1&&num!=2&&num!=3)
				{System.out.print("���� �޴��Դϴ�. �ٽ� �Է��Ͽ��ּ���\n");}
			else 
			{System.out.print("�̸�>>");
			name=s.next();
			
			while(true)
			{System.out.print("��ȣ>>");
			seatnum=s.nextInt();
			if(seatnum>10)
				{System.out.print("�¼� ��ȣ�� 1~10������ �Դϴ�. �ٽ� �Է��Ͽ��ּ���\n");}
			else 
			{if(num==1)
				{S[seatnum-1]=name; break;}
			else if(num==2)
				{A[seatnum-1]=name; break;}
			else
				{B[seatnum-1]=name; break;}
			}
			}
			}break;
		}
	}
	
	void s_check() // S�� �¼� ��ȸ �Լ�
	{
		System.out.print("S>> ");
		for(int i=0;i<10;i++)
			{System.out.print(S[i]+" ");}
		System.out.print("\n");
	}

	void a_check() // A�� �¼� ��ȸ �Լ�
	{
		System.out.print("A>> ");
		for(int i=0;i<10;i++)
			{System.out.print(A[i]+" ");}
		System.out.print("\n");
	}

	void b_check() // B�� �¼� ��ȸ �Լ�
	{
		System.out.print("B>> ");
		for(int i=0;i<10;i++)
			{System.out.print(B[i]+" ");}
		System.out.print("\n");
	}
	
	void cancle(int seat) // �¼� ��� �Լ�
	{
		int count=0;
		switch(seat)
		{
			case 1:
			{
				s_check();
				System.out.print("�̸�>>");
				this.name=s.next();
				for(int i=0;i<10;i++)
				{if(S[i].equals(name))
					{S[i]="�ѤѤ�"; count=1;}
				}
				break;
			}
			case 2:
			{	a_check();
				System.out.print("�̸�>>");
				this.name=s.next();
				for(int i=0;i<10;i++)
				{if(A[i].equals(name))
					{A[i]="�ѤѤ�"; count=1;}
				}
				break;
			}
			case 3:
			{	b_check();
				System.out.print("�̸�>>");
				this.name=s.next();
				for(int i=0;i<10;i++)
				{if(B[i].equals(name))
					{B[i]="�ѤѤ�"; count=1;}
				}
				break;
			}
			
	}
		if(count==0)
			System.out.print("�ش��ϴ� �̸��� �������� �ʽ��ϴ�.\n");
		else
			System.out.print("���Ÿ� ����Ͽ����ϴ�.\n");
	}
}


public class Homework4
{
	public static void main(String[] args) // �����Լ�
	{
		Scanner scanner=new Scanner(System.in);
		int num=0,seatgrade=0;
		Reserve system=new Reserve();
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.\n");
		do 
		{
			System.out.println("���� :1, ��ȸ:2, ���:3, ������:4>>");
			num=scanner.nextInt();
			switch(num)
			{
			case 1:
				system.seat();
				break;
			case 2:
				{system.s_check();
				system.a_check();
				system.b_check();
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�>>>\n");
				break;}
			case 3:
				{
					while(true)
					{System.out.println("�¼� S:1, A:2, B:3>>");
					seatgrade=scanner.nextInt();
					if(seatgrade!=1&&seatgrade!=2&&seatgrade!=3)
						{System.out.print("���� �޴��Դϴ�. �ٽ� �Է��Ͽ��ּ���\n");}
					system.cancle(seatgrade);
					break;
					}
				break;
				}
			case 4:
				System.out.println("���α׷��� �����մϴ�.\n");
				break;
			default :
				System.out.println("���� �޴��Դϴ�. �ٽ� �Է��Ͽ��ּ���\n");
				break;
			}
		}while(num!=4);
		
		scanner.close();
		
	}
}
