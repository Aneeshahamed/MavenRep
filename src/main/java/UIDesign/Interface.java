package UIDesign;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Interface {
	static JFrame f=new JFrame();
	static File src;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sh1;
	public static void main(String[] args) {
		Window();		
		Design_Actions();
	}
	private static void Design_Actions() {
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
		final JTextField T_Upload;
		final JTextField T_SaveTo;
		final JTextField T_Sheet, T_Username, T_Password;
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
		
		//Button
		JButton B_Upload,B_SaveTo,B_Launch;
		B_Upload = new JButton("");
		B_Upload.setBounds(440,55, 30,25);
		f.add(B_Upload);
		
		B_SaveTo = new JButton("");
		B_SaveTo.setBounds(440,95, 30,25);
		f.add(B_SaveTo);
		
		B_Launch = new JButton("Launch");
		B_Launch.setBounds(130,275, 80,25);
		f.add(B_Launch);
		//Actions
		B_Upload.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				JFileChooser dialog = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
		                 "xlsx", "xlsx");
				dialog.setFileFilter(filter);
				int returnValue = dialog.showOpenDialog(null);
				String FileName = dialog.getSelectedFile().getName();
				File Directory = dialog.getCurrentDirectory();
				String File_Location = Directory+"\\"+FileName;
				T_Upload.setText(File_Location);
				T_Sheet.setText("");
				//Excel
				try
				{
					src = new File(File_Location);
					fis = new FileInputStream(src);
					wb = new XSSFWorkbook(fis);
					int NumOfSheets = wb.getNumberOfSheets();
					String SheetNames[] = new String[NumOfSheets];
					for(int i=0; i<NumOfSheets; i++)
					{
						//Fill the data in T_Sheet
						SheetNames[i] = wb.getSheetName(i);
						String temp1 = T_Sheet.getText();						
						T_Sheet.setText(SheetNames[i]+";");
						String temp2 = T_Sheet.getText();
						String temp3 = temp1.concat(temp2);
						T_Sheet.setText(temp3);
					}					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		B_SaveTo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save");   			 
				int userSelection = fileChooser.showSaveDialog(f);				 
				if (userSelection == JFileChooser.APPROVE_OPTION)
				{
				    File fileToSave = fileChooser.getSelectedFile();
				    T_SaveTo.setText(fileToSave.getAbsolutePath());			    
				}	
			}
		});
		
		B_Launch.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String Upload_t = T_Upload.getText();
				String SaveTo_t = T_SaveTo.getText();
				String Sheet_t = T_Sheet.getText().trim();
				String Username_t = T_Username.getText().trim();
				String Password_t = T_Password.getText().trim();
				if(!Upload_t.isEmpty() && (!SaveTo_t.isEmpty()) && (!Sheet_t.isEmpty()) && (!Username_t.isEmpty()) && (!Password_t.isEmpty())  )
				{
					//Launch the Browser
					String path = System.setProperty("webdriver.chrome.driver","E:\\Automation\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
					WebDriverWait wait20 = new WebDriverWait(driver, 50);
					driver.get("https://google.com");
					driver.quit();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Fill all the details");
				}
			}
		});
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