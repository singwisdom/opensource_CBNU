// 2018038029 신지혜 //

package homework;
import java.io.*;
import java.util.*;

public class Homework8
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>>");
		
		try
		{
			File file=new File("C:\\Users\\신지혜\\JAVA\\homework1\\src\\homework",s.next()); // 파일을 연다
			s.nextLine();
			for(;;)
			{
				Scanner fscanner = new Scanner(new FileInputStream(file),"MS949"); // 텍스트 파일을 읽는다
				
				int linenumber=1;
				System.out.println("검색할 단어나 문장>> ");
				String search=s.nextLine(); // 사용자에게 검색받을 단어를 입력받는다
				if(search.equals("그만")) // 사용자가 그만을 입력하면 프로그램을 종료한다
					{System.out.println("프로그램을 종료합니다.");
					return;}
				
				while(fscanner.hasNext())
				{
					String line=fscanner.nextLine();
					if(line.contains(search)) //  만약 텍스트 파일의 문장에 찾고자 하는 단어가 있다면
					{
						System.out.println(linenumber+":"+line); // 문장번호와 해당 문장을 출력한다
					}
					linenumber++; // 문장번호를 1씩 증가해줌
				}
				
			}
			
		}
		
		catch(FileNotFoundException e) // 사용자에게 입력받은 파일이 존재하지 않는다면
		{
			System.out.println("해당 파일이 존재하지 않습니다."); // 존재하지 않는 다는 문구를 출력한다
		}
		
		s.close();
		
	}
}
