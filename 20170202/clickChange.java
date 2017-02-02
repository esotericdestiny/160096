import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class clickChange {
	public static void main(String[] args) {
		FrameMan man = new FrameMan();
	}
}
class FrameMan implements ActionListener {
	ImageIcon img;
	ImageIcon img2;
	JFrame frame;					
	JButton button;					
	JLabel label;
	JPanel panel;
				
	public FrameMan(){
		frame = new JFrame("ClickChange");
		frame.setLocation(500,500);		
		frame.setSize(300,300);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("image.png");
		img2 = new ImageIcon("image2.png");
			label = new JLabel(img);
			panel = new JPanel();
			button= new JButton("ClickToChange");
			button.addActionListener(this);
			button.setActionCommand("change");
		Container con = frame.getContentPane();
		panel.add(label);
		panel.add(button);
		con.add(panel);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("change")){
			label.setIcon(img);
			label.setIcon(img2);
		}
	}
}