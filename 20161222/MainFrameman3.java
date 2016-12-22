import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainFrameman3{
public static void main(String[] args) {
	FrameMan fm = new FrameMan();
}
}
class FrameMan implements ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	//ImageIcon icon;
	JButton button;
	int num=0;
	public FrameMan(){
		openWindow();
		
	}
	private void openWindow(){
		frame = new JFrame();

		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//icon = new ImageIcon("1.png");
		panel = new JPanel();
		label = new JLabel("Hello");
		button = new JButton("Click Me!");
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(num%2==0){
		label.setText("Aoki!");
	}else{
		label.setText("Hello");
	}
	num++;
	}
}