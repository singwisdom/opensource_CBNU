// 2018038029 ������ //
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
		
		// North�� ���� �г� //
		JPanel p1=new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		c.add(p1,BorderLayout.NORTH); // �г��� North ������ ���δ�
		p1.add(new JButton("Open")); // ��ư �߰�
		p1.add(new JButton("Read"));
		p1.add(new JButton("Close"));
		
		// Center�� ���� �г� //
		JPanel p2=new JPanel();
		p2.setLayout(null); // �����̳��� ��ġ ������ ����
		//p2.setBackground(Color.WHITE);
		c.add(p2,BorderLayout.CENTER); // �г��� Center ������ ���δ�
		JLabel Hello=new JLabel("Hello"); // JLabel ����
		JLabel Java=new JLabel("Java");
		JLabel Love=new JLabel("Love");
		Hello.setBounds(50, 20, 130, 50); // ���ڿ� ��� ��ġ�� ����ڰ� �����Ѵ�
		Java.setBounds(20, 70, 50, 70);
		Love.setBounds(200, 150, 60, 70);
		p2.add(Hello);
		p2.add(Java);
		p2.add(Love);
		
		setSize(300,300); //������ â ȭ���� 300x300���� ����
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Homework9();
	}
}
