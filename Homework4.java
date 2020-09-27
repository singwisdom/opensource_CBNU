// 2018038029 신지혜 //
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
	
	
	Reserve() // 배열 초기화
	{
		S=new String[10];
		A=new String[10];
		B=new String[10];
		
		for(int i=0;i<10;i++)
		{
			S[i] ="ㅡㅡㅡ";
			A[i] ="ㅡㅡㅡ";
			B[i] ="ㅡㅡㅡ";
		}
		
	}
	
	
	void seat() // 좌석 예약 함수
	{
		while(true)
		{	System.out.print("좌석구분 S(1), A(2), B(3)>>>");
			int num=s.nextInt();
			if(num!=1&&num!=2&&num!=3)
				{System.out.print("없는 메뉴입니다. 다시 입력하여주세요\n");}
			else 
			{System.out.print("이름>>");
			name=s.next();
			
			while(true)
			{System.out.print("번호>>");
			seatnum=s.nextInt();
			if(seatnum>10)
				{System.out.print("좌석 번호는 1~10번까지 입니다. 다시 입력하여주세요\n");}
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
	
	void s_check() // S석 좌석 조회 함수
	{
		System.out.print("S>> ");
		for(int i=0;i<10;i++)
			{System.out.print(S[i]+" ");}
		System.out.print("\n");
	}

	void a_check() // A석 좌석 조회 함수
	{
		System.out.print("A>> ");
		for(int i=0;i<10;i++)
			{System.out.print(A[i]+" ");}
		System.out.print("\n");
	}

	void b_check() // B석 좌석 조회 함수
	{
		System.out.print("B>> ");
		for(int i=0;i<10;i++)
			{System.out.print(B[i]+" ");}
		System.out.print("\n");
	}
	
	void cancle(int seat) // 좌석 취소 함수
	{
		int count=0;
		switch(seat)
		{
			case 1:
			{
				s_check();
				System.out.print("이름>>");
				this.name=s.next();
				for(int i=0;i<10;i++)
				{if(S[i].equals(name))
					{S[i]="ㅡㅡㅡ"; count=1;}
				}
				break;
			}
			case 2:
			{	a_check();
				System.out.print("이름>>");
				this.name=s.next();
				for(int i=0;i<10;i++)
				{if(A[i].equals(name))
					{A[i]="ㅡㅡㅡ"; count=1;}
				}
				break;
			}
			case 3:
			{	b_check();
				System.out.print("이름>>");
				this.name=s.next();
				for(int i=0;i<10;i++)
				{if(B[i].equals(name))
					{B[i]="ㅡㅡㅡ"; count=1;}
				}
				break;
			}
			
	}
		if(count==0)
			System.out.print("해당하는 이름이 존재하지 않습니다.\n");
		else
			System.out.print("예매를 취소하였습니다.\n");
	}
}


public class Homework4
{
	public static void main(String[] args) // 메인함수
	{
		Scanner scanner=new Scanner(System.in);
		int num=0,seatgrade=0;
		Reserve system=new Reserve();
		
		System.out.println("명품콘서트홀 예약 시스템입니다.\n");
		do 
		{
			System.out.println("예약 :1, 조회:2, 취소:3, 끝내기:4>>");
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
				System.out.println("<<<조회를 완료하였습니다>>>\n");
				break;}
			case 3:
				{
					while(true)
					{System.out.println("좌석 S:1, A:2, B:3>>");
					seatgrade=scanner.nextInt();
					if(seatgrade!=1&&seatgrade!=2&&seatgrade!=3)
						{System.out.print("없는 메뉴입니다. 다시 입력하여주세요\n");}
					system.cancle(seatgrade);
					break;
					}
				break;
				}
			case 4:
				System.out.println("프로그램을 종료합니다.\n");
				break;
			default :
				System.out.println("없는 메뉴입니다. 다시 입력하여주세요\n");
				break;
			}
		}while(num!=4);
		
		scanner.close();
		
	}
}
