
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FrameBuilder2 {
	final JFrame frame=new JFrame();
	PanelBuilder panelb=new PanelBuilder();
	JPanel SidePanel=panelb.GetSide();
	JPanel TopPanel=panelb.GetTop();
	JPanel MainPanel=panelb.GetMain();
	JPanel BottomPanel=panelb.GetBottom();
	Button Buttons=new Button();
	public JFrame GetMain()
	{
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		int x=screensize.width;
		int y=screensize.height;
		
		frame.setBounds(x/6, y/8, 850, 550);
		frame.setUndecorated(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton close=Buttons.GetClose();
		frame.getContentPane().setBackground(Color.WHITE);
		close.setBounds(830, 0, 20, 20);
		frame.add(close);
		frame.add(BottomPanel);
		frame.add(TopPanel);
		frame.add(SidePanel);
		frame.add(MainPanel);
		
		ActionListener closing=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
			}
			
		};
		close.addActionListener(closing);
		return frame;
	}
}
