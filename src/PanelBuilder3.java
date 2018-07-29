import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PanelBuilder3 {
	JPanel panel=new JPanel();
	Button Buttons=new Button();
	public static JPanel MainPanel=new JPanel();
	final JButton AddStudent=Buttons.GetAddStudent();
	final JButton SearchStudent=Buttons.GetSearchStudent();
	final  JButton AddClass=Buttons.GetAddClass();
	final JButton AddTest=Buttons.GetTest();
	final JButton SendMessage=Buttons.GetSendMessage();
	final JButton SendEmail=Buttons.GetSendEmail();
	final JButton Home=Buttons.GetHome();
	public AddClass AddClassPanel=new AddClass();
	public AddNewStudent AddStudentPanel=new AddNewStudent();
	public SearchStudent SearchStudentPanel=new SearchStudent();
	public SendMessage SendMessagePanel=new SendMessage();
	public Home HomePanel=new Home();
	public SendMail SMail=new SendMail();
	public AddTestPanel ATest=new AddTestPanel();
	
	public JPanel GetMain()
	{
		MainPanel.setBounds(210, 60,630, 440);
		MainPanel.add(AddClassPanel);
		MainPanel.add(AddStudentPanel);
		MainPanel.add(SearchStudentPanel);
		MainPanel.add(HomePanel);
		MainPanel.add(SMail);
		MainPanel.add(SendMessagePanel);
		MainPanel.add(ATest);
		CleanAll();
		HomePanel.setVisible(true);
		ActionListener AClass=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				AddClassPanel.setVisible(true);
			}
		};
		AddClass.addActionListener(AClass);
		
		ActionListener AStudent=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				AddStudentPanel.setVisible(true);
			}
		};
		AddStudent.addActionListener(AStudent);
		
		ActionListener SStudent=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				SearchStudentPanel.setVisible(true);
			}
		};
		SearchStudent.addActionListener(SStudent);
		
		ActionListener GHome=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				HomePanel.setVisible(true);
			}
		};
		Home.addActionListener(GHome);
		
		ActionListener Smail=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				SMail.setVisible(true);
			}
		};
		SendEmail.addActionListener(Smail);
		
		
		ActionListener Smessage=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				SendMessagePanel.setVisible(true);
			}
		};
		SendMessage.addActionListener(Smessage);
		ActionListener AddingTest=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				CleanAll();
				ATest.setVisible(true);
			}
		};
		AddTest.addActionListener(AddingTest);
		
		return MainPanel;
	}	
	
	public JPanel GetSide()
	{
		panel.setBounds(0, 0, 200, 600);
		panel.setBackground(new Color(0.2f, 0.2f, 0.2f,1.0f));
		panel.add(AddStudent);
		panel.add(AddClass);
		panel.add(SendMessage);
		panel.add(SendEmail);
		panel.add(Home);
		panel.add(SearchStudent);
		panel.add(AddTest);
		panel.setLayout(null);

		return panel;
	}
	
	public JPanel GetTop()
	{
		JPanel TopPanel=new JPanel();
		TopPanel.setBounds(0,0,850, 50);
		TopPanel.setBackground(new Color(0.2f, 0.2f, 0.2f,1.0f));
		return TopPanel;
	}
	
	public JPanel GetBottom()
	{
		JPanel BottomPanel=new JPanel();
		BottomPanel.setBounds(0,520, 850, 40 );
		BottomPanel.setBackground(new Color(0.2f, 0.2f, 0.2f,1.0f));
		return BottomPanel;
	}
	public void CleanAll()
	{
		AddClassPanel.setVisible(false);
		AddStudentPanel.setVisible(false);
		SearchStudentPanel.setVisible(false);
		HomePanel.setVisible(false);
		SendMessagePanel.setVisible(false);
		SMail.setVisible(false);
		ATest.setVisible(false);
	}
}
