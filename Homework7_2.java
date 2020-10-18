// 2018038029 ������ //

package homework;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Homework7_2 
{
	HashMap<String, String> nation =new HashMap<String, String>();
	Scanner s=new Scanner(System.in);
	
	public void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
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
		System.out.println("���� " + n + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		n++;
		while(true) {
			System.out.print("����� ���� �Է�" + n + ">> ");
			String country = s.next();
			if(country.equals("�׸�")) {
				break;
			}
			String capital = s.next();
			if(nation.containsKey(country)) {
				System.out.println(country + "�� �̹� �ֽ��ϴ�");
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
			
			
			System.out.print(question + "�� ������? ");
			
			String capitalFromUser = s.next(); 
			if(capitalFromUser.equals("�׸�")) {
				break;
			}
			if(capitalFromUser.equals(answer))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");				
		}	
		
	}
	private void finish() {
		System.out.println("������ �����մϴ�.");	
	}
	
	public static void main(String[] args) {
		Homework7_2 game = new Homework7_2 ();
		game.run();
	}
	
}
