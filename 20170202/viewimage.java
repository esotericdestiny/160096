import java.awt.*;
import javax.swing.*;
public class viewimage{
public static void main(String[] args) {
	FrameMan fm = new FrameMan();
}
}
class FrameMan{
	JFrame frame;
	JPanel panel;
	JLabel label;
	ImageIcon icon;
	public FrameMan(){
		openWindow();
		
	}
	private void openWindow(){
		frame = new JFrame("VIEWIMAGE");

		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		icon = new ImageIcon("image.png");
		panel = new JPanel();
		label = new JLabel(icon);
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
	}
}