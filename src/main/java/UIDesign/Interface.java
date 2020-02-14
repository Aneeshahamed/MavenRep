package UIDesign;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface {
	static JFrame f=new JFrame();
	public static void main(String[] args) {
		Window();
		
		Design();
	}
	private static void Design() {
		JLabel L_Upload,L_SaveTo,L_Sheet,L_Username,L_Password;
		L_Upload = new JLabel("Upload File");  
		L_Upload.setBounds(50,50, 100,30);
		f.add(L_Upload);
		
		L_SaveTo = new JLabel("Save To");  
		L_SaveTo.setBounds(50,90, 100,30);
		f.add(L_SaveTo);
		
		L_Sheet = new JLabel("Sheet Name");  
		L_Sheet.setBounds(50,130, 100,30);
		f.add(L_Sheet);
		
		L_Username = new JLabel("User Name");  
		L_Username.setBounds(50,170, 100,30);
		f.add(L_Username);
		
		L_Password = new JLabel("Password");  
		L_Password.setBounds(50,210, 100,30);
		f.add(L_Password);
		//TextBox
		JTextField T_Upload,T_SaveTo,T_Sheet,T_Username,T_Password;
		T_Upload = new JTextField("");
		T_Upload.setBounds(130,55, 300,25);
		T_Upload.setEnabled(false);
		f.add(T_Upload);
		
		T_SaveTo = new JTextField("");
		T_SaveTo.setBounds(130,95, 300,25);
		T_SaveTo.setEnabled(false);
		f.add(T_SaveTo);
		
		T_Sheet = new JTextField("");
		T_Sheet.setBounds(130,135, 300,25);
		f.add(T_Sheet);
		
		T_Username = new JTextField("");
		T_Username.setBounds(130,175, 150,25);
		f.add(T_Username);
		
		T_Password = new JTextField("");
		T_Password.setBounds(130,215, 150,25);
		f.add(T_Password);
		
		JButton B_Upload,B_SaveTo,B_Launch;
		B_Upload = new JButton("");
		B_Upload.setBounds(440,55, 30,25);
		f.add(B_Upload);
		
		B_SaveTo = new JButton("");
		B_SaveTo.setBounds(440,95, 30,25);
		f.add(B_SaveTo);
		
		//Actions
	}
	private static void Window() {	
		f.setVisible(true);
		f.setSize(520,450);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("C:\\Users\\user\\Desktop\\icon.jpg");
		f.setIconImage(img.getImage());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);	
	}
}
