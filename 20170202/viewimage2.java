import java.awt.*;
import javax.swing.*;
public class viewimage2{
public static void main(String[] args) {
	FrameMan fm = new FrameMan();
}
}
class FrameMan{
	JFrame frame;
	JPanel panel;
	JPanel panel2;
	JLabel label;
	JLabel label2;
	ImageIcon icon;
	ImageIcon icon2;
	public FrameMan(){
		openWindow();
	}
	private void openWindow(){
		frame = new JFrame("VIEWIMAGE");
		frame.setLocation(500,500);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		icon = new ImageIcon("image.png");
		panel = new JPanel();
		panel.setLocation(100,100);
		label = new JLabel(icon);
		panel.add(label);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3,3));
		icon2 = new ImageIcon("image2.png");
		panel2 = new JPanel();
		label2 = new JLabel(icon2);
		panel2.add(label2);

		con.add(panel);
		con.add(panel2);

		
		frame.setVisible(true);
	}
}