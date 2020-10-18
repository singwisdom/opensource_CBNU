// 2018038029 신지혜 //

package homework;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Homework7_2 
{
	HashMap<String, String> nation =new HashMap<String, String>();
	Scanner s=new Scanner(System.in);
	
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = s.nextInt();
			switch(menu) {
				case 1: input(); break;
				case 2: quiz(); break;
				case 3: finish(); return;
				
			}
		}
		
	}
	
	private void input() {
		int n = nation.size();
		System.out.println("현재 " + n + "개 나라와 수도가 입력되어 있습니다.");
		n++;
		while(true) {
			System.out.print("나라와 수도 입력" + n + ">> ");
			String country = s.next();
			if(country.equals("그만")) {
				break;
			}
			String capital = s.next();
			if(nation.containsKey(country)) {
				System.out.println(country + "는 이미 있습니다");
				continue;
			}
			nation.put(country, capital);
			n++;
		}
	}
	private void quiz() {
		
		Set<String> keys = nation.keySet();
		Object [] array = (keys.toArray());
		while(true) {
			
			int index = (int)(Math.random()*array.length); 
			
			
			String question = (String)array[index];
			String answer = nation.get(question);
			
			
			System.out.print(question + "의 수도는? ");
			
			String capitalFromUser = s.next(); 
			if(capitalFromUser.equals("그만")) {
				break;
			}
			if(capitalFromUser.equals(answer))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");				
		}	
		
	}
	private void finish() {
		System.out.println("게임을 종료합니다.");	
	}
	
	public static void main(String[] args) {
		Homework7_2 game = new Homework7_2 ();
		game.run();
	}
	
}
