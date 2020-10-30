// 2018038029 신지혜 //
package homework;
import javax.swing.*;
import java.awt.*;

public class Homework9 extends JFrame
{
	public Homework9()
	{
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		// North에 붙일 패널 //
		JPanel p1=new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		c.add(p1,BorderLayout.NORTH); // 패널을 North 영역에 붙인다
		p1.add(new JButton("Open")); // 버튼 추가
		p1.add(new JButton("Read"));
		p1.add(new JButton("Close"));
		
		// Center에 붙일 패널 //
		JPanel p2=new JPanel();
		p2.setLayout(null); // 컨테이너의 배치 관리자 제거
		//p2.setBackground(Color.WHITE);
		c.add(p2,BorderLayout.CENTER); // 패널을 Center 영역에 붙인다
		JLabel Hello=new JLabel("Hello"); // JLabel 부착
		JLabel Java=new JLabel("Java");
		JLabel Love=new JLabel("Love");
		Hello.setBounds(50, 20, 130, 50); // 문자열 출력 위치를 사용자가 지정한다
		Java.setBounds(20, 70, 50, 70);
		Love.setBounds(200, 150, 60, 70);
		p2.add(Hello);
		p2.add(Java);
		p2.add(Love);
		
		setSize(300,300); //윈도우 창 화면을 300x300으로 설정
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Homework9();
	}
}
