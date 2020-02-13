package UIDesign;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interface {
	static JFrame f=new JFrame();
	public static void main(String[] args) {
		Window();
		Design();
	}
	private static void Design() {
		JLabel L_Upload,L_SaveTo,L_Username,L_Password;
	}
	private static void Window() {	
		f.setVisible(true);
		f.setSize(600,450);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("C:\\Users\\user\\Desktop\\icon.jpg");
		f.setIconImage(img.getImage());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);	
	}
}
