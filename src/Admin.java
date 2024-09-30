import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Admin implements ActionListener {
	JFrame frame = new JFrame();
	JButton Button1 = new JButton("Admin");
	JButton Button2 = new JButton("Admin");
	JButton Button3 = new JButton("Admin");
	JButton Button4 = new JButton("Admin");
	
	Admin(String userID){
		
		
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		Button1.setBounds(50,100,150,50);
		Button1.setFocusable(false);
		Button1.addActionListener(this);
		
		
		Button2.setBounds(50,150,150,50);
		Button2.setFocusable(false);
		Button2.addActionListener(this);
		
		Button3.setBounds(50,200,150,50);
		Button3.setFocusable(false);
		Button3.addActionListener(this);
		
		
		Button4.setBounds(250,100,150,50);
		Button4.setFocusable(false);
		Button4.addActionListener(this);
	
	
		frame.add(Button1);
		frame.add(Button2);
		frame.add(Button3);
		frame.add(Button4);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


