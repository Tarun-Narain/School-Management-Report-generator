import javax.swing.*;

public class MAIN 
{
	private static FrameBuilder frame=new FrameBuilder(); 
	private static JFrame LoginFrame=frame.GetLoginFrame();
	private static JFrame MainFrame;
	public static PanelBuilder Panels=new PanelBuilder();
	
	public static void main(String[] args) {
		Panels.focusinit();
	}
	
	protected void Successful()
	{
		LoginFrame.dispose();
		System.out.println("Logged-in");
		MainFrame=frame.GetMain();
		MainFrame.setVisible(true);
	}
	
}
