import java.util.Queue;
import java.util.LinkedList;
import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.*;

public class MainRunner {

	public static String procName;
	public static int procLife;
	public static Queue<Process> processQueue = new LinkedList<>();
	
	public static void main(String[] args) 
	{
	
		//This is the main frame of the window
		JFrame mainWindow = new JFrame("OS Simulation");
		mainWindow.setSize(1600, 900);
	    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //All the buttons and display will be put into this panel
	    JPanel panel = new JPanel();
	    panel.setLayout(null);
	    
	    
	    //Creating the add process button that will add a new process
	    ImageIcon addIcon = new ImageIcon("D:\\Eclipse Program\\Eclipse WorkSpace\\SimulatingOS\\add.png", "an add icon");	    
	    JButton addProcess = new JButton("      Add a Process", addIcon);
	    addProcess.setBounds(15, 800, 200, 50);
	    
	    
	    //Creating an action event for the addProcess button
	    addProcess.addActionListener(new ActionListener()
	    		{
	    	
	    			
					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
						
						getProcessInput one = new getProcessInput();
						one.start();
						
						System.out.println(procName);
						System.out.println(procLife);

					
					}
	    			
	    			
	    		}
	    );
		
	    System.out.println(procName);
		System.out.println(procLife);
		
		DisplayProcessQueue one = new DisplayProcessQueue();
		one.start();
	    
	    panel.add(addProcess);
	    mainWindow.add(panel);
	   
	    mainWindow.setVisible(true);

	}
}
