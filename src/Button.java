
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Button {
	ImageIcon icon;
	ImageIcon icon2;
	ImageIcon icon3;
	
	public static JButton AddStudent=new JButton();
	public static JButton AddClass=new JButton();
	public static JButton SendEmail=new JButton();
	public static JButton SendMessage=new JButton();
	public static JButton SearchStudent=new JButton();
	public static JButton Home=new JButton();
	public static JButton AddTest=new JButton();	
	public static JButton log;
	
	public JButton GetClose()
	{
		icon=new ImageIcon("images/cross2.png");
		icon2=new ImageIcon("images/cross.png");
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon2);
		log.setRolloverIcon(icon);
		log.setPressedIcon(icon);
		log.setDisabledIcon(icon);
		
		return log;
	}
	
	public JButton GetBack()
	{
		icon=new ImageIcon("images/back2.png");
		icon2=new ImageIcon("images/back.png");
		icon3=new ImageIcon("images/back3.png");
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon2);
		log.setRolloverIcon(icon);
		log.setPressedIcon(icon);
		log.setDisabledIcon(icon);
		
		return log;
	}
	
	public JButton GetAddStudent()
	{
		icon=new ImageIcon("images/AddStudent.png");
		icon2=new ImageIcon("images/AddStudent2.png");
		icon3=new ImageIcon("images/AddStudent3.png");
		
			AddStudent.setBounds(0, 170, 200, 50);
		AddStudent.setBorderPainted(false);
		AddStudent.setBorder(null);
		AddStudent.setMargin(new Insets(0, 0, 0, 0));
		AddStudent.setContentAreaFilled(false);
		AddStudent.setIcon(icon);
		AddStudent.setRolloverIcon(icon2);
		AddStudent.setPressedIcon(icon3);
		AddStudent.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				AddStudent.setIcon(new ImageIcon("images/AddStudent3.png"));
			AddStudent.setRolloverIcon(new ImageIcon("images/AddStudent3.png"));
			}
		};
		
		AddStudent.addActionListener(al);
		return AddStudent;
	}
	public JButton GetHome()
	{
		icon=new ImageIcon("images/Home.png");
		icon2=new ImageIcon("images/Home2.png");
		icon3=new ImageIcon("images/Home3.png");
		
			Home.setBounds(0, 120, 200, 50);
			Home.setBorderPainted(false);
			Home.setBorder(null);
			Home.setMargin(new Insets(0, 0, 0, 0));
			Home.setContentAreaFilled(false);
			Home.setIcon(icon);
			Home.setRolloverIcon(icon2);
			Home.setPressedIcon(icon3);
		Home.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				Home.setIcon(new ImageIcon("images/Home3.png"));
			Home.setRolloverIcon(new ImageIcon("images/Home3.png"));
			}
		};
		
		Home.addActionListener(al);
		return Home;
	}
	public JButton GetTest()
	{
		icon=new ImageIcon("images/AddTest.png");
		icon2=new ImageIcon("images/AddTest2.png");
		icon3=new ImageIcon("images/AddTest3.png");
		
			AddTest.setBounds(0, 420, 200, 50);
			AddTest.setBorderPainted(false);
			AddTest.setBorder(null);
			AddTest.setMargin(new Insets(0, 0, 0, 0));
			AddTest.setContentAreaFilled(false);
			AddTest.setIcon(icon);
			AddTest.setRolloverIcon(icon2);
			AddTest.setPressedIcon(icon3);
			AddTest.setDisabledIcon(icon);
		
		
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				AddTest.setIcon(new ImageIcon("images/AddTest3.png"));
				AddTest.setRolloverIcon(new ImageIcon("images/AddTest3.png"));
			}
		};
		
		AddTest.addActionListener(al);
		return AddTest;
	}
	public JButton GetAddClass()
	{
		icon=new ImageIcon("images/AddClass.png");
		icon2=new ImageIcon("images/AddClass2.png");
		icon3=new ImageIcon("images/AddClass3.png");
		
		
		AddClass.setBounds(0, 220, 200, 50);
		AddClass.setBorderPainted(false);
		AddClass.setBorder(null);
		AddClass.setMargin(new Insets(0, 0, 0, 0));
		AddClass.setContentAreaFilled(false);
		AddClass.setIcon(new ImageIcon("images/AddClass.png"));
		AddClass.setRolloverIcon(new ImageIcon("images/AddClass2.png"));
		AddClass.setPressedIcon(new ImageIcon("images/AddClass3.png"));
		AddClass.setDisabledIcon(icon);
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
		ResetAll();
		AddClass.setIcon(new ImageIcon("images/AddClass3.png"));
		AddClass.setRolloverIcon(new ImageIcon("images/AddClass3.png"));
			}
		};
		AddClass.addActionListener(al);
		return AddClass;
	}
	
	public JButton GetSearchStudent()
	{
		icon=new ImageIcon("images/SearchStudent.png");
		icon2=new ImageIcon("images/SearchStudent2.png");
		icon3=new ImageIcon("images/SearchStudent3.png");
		
		
		SearchStudent.setBounds(0, 270, 200, 50);
		SearchStudent.setBorderPainted(false);
		SearchStudent.setBorder(null);
		SearchStudent.setMargin(new Insets(0, 0, 0, 0));
		SearchStudent.setContentAreaFilled(false);
		SearchStudent.setIcon(icon);
		SearchStudent.setRolloverIcon(icon2);
		SearchStudent.setPressedIcon(icon3);
		SearchStudent.setDisabledIcon(icon);
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
			ResetAll();
			SearchStudent.setIcon(new ImageIcon("images/SearchStudent3.png"));
			SearchStudent.setRolloverIcon(new ImageIcon("images/SearchStudent3.png"));
			
			}
		};
		SearchStudent.addActionListener(al);
		return SearchStudent;
	
	}public JButton GetSendEmail()
	{
		icon=new ImageIcon("images/SendEmail.png");
		icon2=new ImageIcon("images/SendEmail2.png");
		icon3=new ImageIcon("images/SendEmail3.png");
			
	SendEmail.setBounds(0, 320, 200, 50);
	SendEmail.setBorderPainted(false);
	SendEmail.setBorder(null);
	SendEmail.setMargin(new Insets(0, 0, 0, 0));
	SendEmail.setContentAreaFilled(false);
	SendEmail.setIcon(icon);
	SendEmail.setRolloverIcon(icon2);
	SendEmail.setPressedIcon(icon3);
	SendEmail.setDisabledIcon(icon);
		ActionListener al=new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				SendEmail.setIcon(new ImageIcon("images/SendEmail3.png"));
				SendEmail.setRolloverIcon(new ImageIcon("images/SendEmail3.png"));
			}
		};
		SendEmail.addActionListener(al);
		return SendEmail;
	}
	public JButton GetSendMessage()
	{
		icon=new ImageIcon("images/SendMessage.png");
		icon2=new ImageIcon("images/SendMessage2.png");
		icon3=new ImageIcon("images/SendMessage3.png");
		
		
		SendMessage.setBounds(0, 370, 200, 50);
		SendMessage.setBorderPainted(false);
		SendMessage.setBorder(null);
		SendMessage.setMargin(new Insets(0, 0, 0, 0));
		SendMessage.setContentAreaFilled(false);
		SendMessage.setIcon(icon);
		SendMessage.setRolloverIcon(icon2);
		SendMessage.setPressedIcon(icon3);
		SendMessage.setDisabledIcon(icon);
		ActionListener al=new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				ResetAll();
				SendMessage.setIcon(new ImageIcon("images/SendMessage3.png"));	
				SendMessage.setRolloverIcon(new ImageIcon("images/SendMessage3.png"));
			}
		};
		SendMessage.addActionListener(al);
		return SendMessage;
	}
	public JButton GetLogin()
	{
		 icon=new ImageIcon("images/login1.jpg");
		 icon2=new ImageIcon("images/login2.jpg");
	 icon3=new ImageIcon("images/login3.jpg");
		
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon);
		log.setOpaque(false);
		log.setRolloverIcon(icon2);
		log.setPressedIcon(icon3);
		log.setDisabledIcon(icon);
		return log;
	}
	
	public JButton GetSave()
	{
		 icon=new ImageIcon("images/save1.jpg");
		 icon2=new ImageIcon("images/save2.jpg");
	 icon3=new ImageIcon("images/save3.jpg");
		
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon);
		log.setOpaque(false);
		log.setRolloverIcon(icon2);
		log.setPressedIcon(icon3);
		log.setDisabledIcon(icon);
		return log;
	}
	public JButton GetSet()
	{
		icon=new ImageIcon("images/sup1.jpg");
		 icon2=new ImageIcon("images/sup2.jpg");
	 icon3=new ImageIcon("images/sup3.jpg");
		
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon);
		log.setOpaque(false);
		log.setRolloverIcon(icon2);
		log.setPressedIcon(icon3);
		log.setDisabledIcon(icon);
		return log;
	}
	public void ResetAll()
	{
		AddStudent.setIcon(new ImageIcon("images/AddStudent.png"));
		AddStudent.setRolloverIcon(new ImageIcon("images/AddStudent2.png"));
		AddClass.setIcon(new ImageIcon("images/AddClass.png"));
		AddClass.setRolloverIcon(new ImageIcon("images/AddClass2.png"));
		SendEmail.setIcon(new ImageIcon("images/SendEmail.png"));
		SendEmail.setRolloverIcon(new ImageIcon("images/SendEmail2.png"));
		SendMessage.setIcon(new ImageIcon("images/SendMessage.png"));
		SendMessage.setRolloverIcon(new ImageIcon("images/SendMessage2.png"));
		SearchStudent.setIcon(new ImageIcon("images/SearchStudent.png"));
		SearchStudent.setRolloverIcon(new ImageIcon("images/SearchStudent2.png"));
		Home.setIcon(new ImageIcon("images/Home.png"));
		Home.setRolloverIcon(new ImageIcon("images/Home2.png"));
		AddTest.setIcon(new ImageIcon("images/AddTest.png"));
		AddTest.setRolloverIcon(new ImageIcon("images/AddTest2.png"));
		}
}