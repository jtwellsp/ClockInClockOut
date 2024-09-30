import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//import Emp.PUNCH_STATUS;

public class Login implements ActionListener{
	
	JFrame frame = new JFrame();
	JFrame frame1 = new JFrame();
	JFrame frame2 = new JFrame();
	
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JButton Adminbutton = new JButton("Admin");
	JButton Button1 = new JButton("Clock In");
	JButton Button2 = new JButton("Start Lunch");
	JButton Button3 = new JButton("Report");
	JButton Button4 = new JButton("Clock out");
	JButton Button5 = new JButton("End Lunch");
	JButton Addnew = new JButton("Create User");
	JButton lo = new JButton("Show log");
	JButton request = new JButton("Report");
	JButton pay = new JButton("Show pay");
	JButton ShowEmp = new JButton("See Employees");
	JButton Enter = new JButton("Enter");
	
	
	JButton Button6 = new JButton("Exit");
	
	
	JTextField username = new JTextField();
	
	JPasswordField userPasswordField = new JPasswordField();
	
	JLabel userLabel= new JLabel("Username:");
	JLabel PasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	JLabel messageLabel2 = new JLabel();
	
	
	JLabel pinLabel= new JLabel("Pin:");
	JLabel lnameLabel = new JLabel("Last name:");
	JLabel fnameLabel= new JLabel("First name :");
	JLabel salaryLabel = new JLabel("Salary?:");
	JLabel AddminLabel= new JLabel("Admin?:");
	JLabel passwordLabel = new JLabel("Password:");
	
	JTextField pin = new JTextField();
	JTextField lname = new JTextField();
	JTextField fname = new JTextField();
	JTextField salary = new JTextField();
	JTextField Addm = new JTextField();
	JTextField pass = new JTextField();
	
	JTextArea arr = new JTextArea(200,20);
	
	Emp n= new Emp();
	
	//Timep tt=new Timep();
	
	time tt=new time();
	
	Report r = new Report();
	
	ArrayList<Emp> user = new ArrayList<>();
	
	ArrayList<Report> log = new ArrayList<>();
	
	//HashMap<String,String> logininfo = new HashMap<String,String>();
	
	//Login(HashMap<String,String> loginInfoOriginal){
	Login(ArrayList<Emp> userlist){
		//logininfo = loginInfoOriginal;
		
		user = userlist;
		
		
		userLabel.setBounds(50,100,75,25);
		PasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(50,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,12));
		
		messageLabel2.setBounds(50,300,250,35);
		messageLabel2.setFont(new Font(null,Font.ITALIC,12));
		
		arr.setBounds(0,0,420,350);
		
		username.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		Adminbutton.setBounds(325,200,100,25);
		Adminbutton.setFocusable(false);
		Adminbutton.addActionListener(this);
		
		frame.add(userLabel);
		frame.add(PasswordLabel);
		frame.add(messageLabel);
		frame.add(messageLabel2);
		frame.add(username);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(Adminbutton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame2.remove(frame2);
		frame2.dispose();
		frame1.remove(frame1);
		frame1.dispose();
		
		frame1.setVisible(false);
		frame2.setVisible(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			username.setText("");
			userPasswordField.setText("");
		}
		if(e.getSource()==loginButton) {
			frame2.remove(frame2);
			frame2.dispose();
			frame1.remove(frame1);
			frame1.dispose();
			frame1.setVisible(false);
			frame2.setVisible(false);
			int userID = Integer.parseInt(username.getText());
			String password = String.valueOf(userPasswordField.getPassword());
			
			for (int i = 0; i < user.size(); i++){
				
				if (user.get(i).getEmployeeID()== userID && user.get(i).getPassword().equals(password)){
					messageLabel.setText("Login successful");
					frame.remove(frame);
					frame.dispose();
					
					n.setEmployeeID(userID);
					//Next Next = new Next(userID);
					
					Button1.setBounds(50,100,150,50);
					Button1.setFocusable(false);
					Button1.addActionListener(new ActionListener(){
						@Override
	                    public void actionPerformed( ActionEvent e ) {
							
							String clockin = "Clock in";
							messageLabel.setText("Clocked in at: "+ time.getDateTime());
							String info = time.getDateTime();
							messageLabel2.setText("By: "+ n.getEmployeeID());
							int emplo=n.getEmployeeID();
							
							
							
							log.add(new Report(clockin,emplo,info));
							
							
							
						
			                
	                    }
					});
					
					
					Button2.setBounds(50,150,150,50);
					Button2.setFocusable(false);
					Button2.addActionListener(new ActionListener(){
						@Override
	                    public void actionPerformed( ActionEvent e ) {
							String lunch = "Lunch";
							messageLabel.setText("Started lunch at: "+ time.getDateTime());
							String info = time.getDateTime();
							messageLabel2.setText("By: "+ n.getEmployeeID());
							int emplo=n.getEmployeeID();
							
							log.add(new Report(lunch,emplo,info));
							
						
			                
	                    }
					});
					
					Button3.setBounds(50,200,150,50);
					Button3.setFocusable(false);
					Button3.addActionListener(new ActionListener(){
						@Override
	                    public void actionPerformed( ActionEvent e ) {
							
							messageLabel.setText("Going to clock in report");
							messageLabel2.setText("By: "+ n.getEmployeeID());
							
							frame1.remove(frame1);
							frame1.dispose();
							
							frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frame2.setSize(420,420);
							
							Button6.setBounds(350,350,70,25);
							Button6.setFocusable(false);
							Button6.addActionListener(new ActionListener(){
								@Override
			                    public void actionPerformed( ActionEvent e ) {
									
									frame.setLayout(null);
									frame.setVisible(true);
									frame2.remove(frame2);
									frame2.dispose();
									
									username.setText("");
									userPasswordField.setText("");
									
								}
							});
							
							
							frame2.setLayout(null);
							frame2.setVisible(true);
							
							frame2.add(arr);
							frame2.add(Button6);
							
							
							
							arr.setText(log.toString());
							
							
						
			                
	                    }
					});
					
					
					Button4.setBounds(200,100,150,50);
					Button4.setFocusable(false);
					Button4.addActionListener(new ActionListener(){
						@Override
	                    public void actionPerformed( ActionEvent e ) {
							String Clockout = "Clock out";
							messageLabel.setText("Clocked out at: "+ time.getDateTime());
							String info = time.getDateTime();
							messageLabel2.setText("By: "+ n.getEmployeeID());
							int emplo=n.getEmployeeID();
							
							log.add(new Report(Clockout,emplo,info));
							
							
						
			                
	                    }
					});
					
					Button5.setBounds(200,150,150,50);
					Button5.setFocusable(false);
					Button5.addActionListener(new ActionListener(){
						@Override
	                    public void actionPerformed( ActionEvent e ) {
							String Endlunch = "Endlunch";
							messageLabel.setText("Ended Lunch at: "+ time.getDateTime());
							String info = time.getDateTime();
							messageLabel2.setText("By: "+ n.getEmployeeID());
							int emplo=n.getEmployeeID();
							
							log.add(new Report(Endlunch,emplo,info));
						
			                
	                    }
					});
					
					
					Button6.setBounds(200,200,150,50);
					Button6.setFocusable(false);
					Button6.addActionListener(new ActionListener(){
						@Override
	                    public void actionPerformed( ActionEvent e ) {
							
							frame.setLayout(null);
							frame.setVisible(true);
							frame2.remove(frame2);
							frame2.dispose();
							frame1.remove(frame1);
							frame1.dispose();
							frame1.setVisible(false);
							frame2.setVisible(false);
							Button1.setVisible(false);
							Button2.setVisible(false);
							Button3.setVisible(false);
							username.setText("");
							userPasswordField.setText("");
							
						
			                
	                    }
					});
				
				
					frame1.add(Button1);
					frame1.add(Button2);
					frame1.add(Button3);
					frame1.add(Button4);
					frame1.add(Button5);
					frame1.add(Button6);
					frame1.add(messageLabel);
					frame1.add(messageLabel2);
					
				
					frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame1.setSize(420,420);
					
					frame1.setLayout(null);
					frame1.setVisible(true);
					
				}
			}
			
		}
		if(e.getSource()==Adminbutton) {
			
				int userID = Integer.parseInt(username.getText());
				String password = String.valueOf(userPasswordField.getPassword());
				frame2.remove(frame2);
				frame2.dispose();
				frame1.remove(frame1);
				frame1.dispose();
				frame1.setVisible(false);
				frame2.setVisible(false);
				for (int i = 0; i < user.size(); i++){
					
					if (user.get(i).getEmployeeID()== userID && user.get(i).getPassword().equals(password) && user.get(i).getIsAdmin_int()==1){
						
						messageLabel.setText("Login successful");
						frame.remove(frame);
						frame.dispose();
						
						Addnew.setBounds(50,100,150,50);
						Addnew.setFocusable(false);
						Addnew.addActionListener(new ActionListener(){
							@Override
		                    public void actionPerformed( ActionEvent e ) {
								
								frame1.remove(frame1);
								frame1.dispose();
								
								frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame2.setSize(420,420);
								
								
								
								pinLabel.setBounds(50,50,75,25);
								lnameLabel.setBounds(50,100,75,25);
								fnameLabel.setBounds(50,150,75,25);
								salaryLabel.setBounds(50,200,75,25);
								AddminLabel.setBounds(50,250,75,25);
								passwordLabel.setBounds(50,300,75,25);
								
								pin.setBounds(125,50,200,25);
								lname.setBounds(125,100,200,25);
								fname.setBounds(125,150,200,25);
								salary.setBounds(125,200,200,25);
								Addm.setBounds(125,250,200,25);
								pass.setBounds(125,300,200,25);
								
								Button6.setBounds(350,350,70,25);
								Button6.setFocusable(false);
								Button6.addActionListener(new ActionListener(){
									@Override
				                    public void actionPerformed( ActionEvent e ) {
										
										
										frame.setLayout(null);
										frame.setVisible(true);
										frame2.remove(frame2);
										frame2.dispose();
										frame1.setVisible(false);
										frame2.setVisible(false);
										username.setText("");
										userPasswordField.setText("");
										
									}
								});
								
								Enter.setBounds(125,350,100,25);
								Enter.setFocusable(false);
								Enter.addActionListener(new ActionListener(){
									@Override
				                    public void actionPerformed( ActionEvent e ) {
										String pp = pass.getText();
										int p = Integer.parseInt(pin.getText());
										String ln=lname.getText();
										String fn=fname.getText();
										int s = Integer.parseInt(salary.getText());
										int a = Integer.parseInt(Addm.getText());
										
										user.add(new Emp(p,ln,fn,s,a,pp));
									
						                
				                    }
								});
								
								frame2.add(Button6);
								frame2.add(Enter);
								frame2.add(pinLabel);
								frame2.add(pin);
								
								//int p = Integer.parseInt(pin.getText());
								frame2.add(lnameLabel);
								frame2.add(lname);
								//String ln=lname.getText();
								frame2.add(fnameLabel);
								frame2.add(fname);
								//String fn=fname.getText();
								frame2.add(salaryLabel);
								frame2.add(salary);
								//int s = Integer.parseInt(salary.getText());
								frame2.add(AddminLabel);
								frame2.add(Addm);
								//int a = Integer.parseInt(Addm.getText());
								frame2.add(passwordLabel);
								frame2.add(pass);
								
								//user.add(new Emp(p,ln,fn,s,a,pp));
								
							
				                
								frame2.setLayout(null);
								frame2.setVisible(true);
		                    }
						});
						
						
						ShowEmp.setBounds(50,150,150,50);
						ShowEmp.setFocusable(false);
						ShowEmp.addActionListener(new ActionListener(){
							@Override
		                    public void actionPerformed( ActionEvent e ) {
								
								frame1.remove(frame1);
								frame1.dispose();
								
								frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame2.setSize(420,420);
								
								Button6.setBounds(350,350,70,25);
								Button6.setFocusable(false);
								Button6.addActionListener(new ActionListener(){
									@Override
				                    public void actionPerformed( ActionEvent e ) {
										
										frame1.setLayout(null);
										frame1.setVisible(true);
										username.setText("");
										userPasswordField.setText("");
										
									}
								});
								
								
								frame2.setLayout(null);
								frame2.setVisible(true);
								
								frame2.add(arr);
								frame2.add(Button6);
								
								
								
								arr.setText(user.toString());
								
								
							
				                
		                    }
						});
							
				                
		           
						
						lo.setBounds(50,200,150,50);
						lo.setFocusable(false);
						lo.addActionListener(new ActionListener(){
							@Override
		                    public void actionPerformed( ActionEvent e ) {
								
								frame1.remove(frame1);
								frame1.dispose();
								
								frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame2.setSize(420,420);
								
								Button6.setBounds(350,350,70,25);
								Button6.setFocusable(false);
								Button6.addActionListener(new ActionListener(){
									@Override
				                    public void actionPerformed( ActionEvent e ) {
										
										frame1.setLayout(null);
										frame1.setVisible(true);
										username.setText("");
										userPasswordField.setText("");
										
									}
								});
								
								
								frame2.setLayout(null);
								frame2.setVisible(true);
								
								frame2.add(arr);
								frame2.add(Button6);
								
								
								
								arr.setText(log.toString());
								
								
							
				                
		                    }
						});
						
						
						Button4.setBounds(200,100,150,50);
						Button4.setFocusable(false);
						Button4.addActionListener(new ActionListener(){
							@Override
		                    public void actionPerformed( ActionEvent e ) {
								String Clockout = "Clock out";
								messageLabel.setText("Clocked out at: "+ time.getDateTime());
								String info = time.getDateTime();
								messageLabel2.setText("By: "+ n.getEmployeeID());
								int emplo=n.getEmployeeID();
								
								log.add(new Report(Clockout,emplo,info));
								
								
							
				                
		                    }
						});
						
						Button5.setBounds(200,150,150,50);
						Button5.setFocusable(false);
						Button5.addActionListener(new ActionListener(){
							@Override
		                    public void actionPerformed( ActionEvent e ) {
								String Endlunch = "Endlunch";
								messageLabel.setText("Ended Lunch at: "+ time.getDateTime());
								String info = time.getDateTime();
								messageLabel2.setText("By: "+ n.getEmployeeID());
								int emplo=n.getEmployeeID();
								
								log.add(new Report(Endlunch,emplo,info));
							
				                
		                    }
						});
						
						
						Button6.setBounds(200,200,150,50);
						Button6.setFocusable(false);
						Button6.addActionListener(new ActionListener(){
							@Override
		                    public void actionPerformed( ActionEvent e ) {
								frame.setLayout(null);
								frame.setVisible(true);
								frame2.remove(frame2);
								frame2.dispose();
								frame1.remove(frame1);
								frame1.dispose();
								frame1.setVisible(false);
								frame2.setVisible(false);
								Addnew.setVisible(false);
								ShowEmp.setVisible(false);
								lo.setVisible(false);
								username.setText("");
								userPasswordField.setText("");
								
								
							
				                
		                    }
						});
					
					
						frame1.add(Addnew);
						frame1.add(lo);
						frame1.add(request);
						frame1.add(pay);
						frame1.add(ShowEmp);
						frame1.add(Button6);
						frame1.add(messageLabel);
						frame1.add(messageLabel2);
						
					
						frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame1.setSize(420,420);
						
						frame1.setLayout(null);
						frame1.setVisible(true);
					
				}
				
			}
			
		}
		
		
	}	
}
