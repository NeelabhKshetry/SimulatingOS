import java.awt.event.*;
import javax.swing.*;
import java.lang.Integer.*;
import java.util.concurrent.*;


public class getProcessInput extends Thread
{
	public void setname(String name)
	{
		if(name.length()!=0)
			MainRunner.procName = name;
		else
			MainRunner.procName = "systemProcess";
		
		System.out.println(MainRunner.procName);
	}
	
	public void setLife(String life)
	{
		if(life.length()!=0)
			MainRunner.procLife = Integer.parseInt(life);
		else
			MainRunner.procLife = 120;
		//this.prosLife = life;
	}
	//private CountDownLatch latch1;
	public void run()
	{
		
		JFrame getProcessWindow = new JFrame("Add a Process");
		getProcessWindow.setSize(530, 300);
		getProcessWindow.setLayout(null);
		//getProcessWindow.getContentPane().setLayout(new FlowLayout());
	    
	    //JTextField processName = new JTextField("Enter the process name...", 25);
		JTextField processName = new JTextField(25);
	    processName.setBounds(30, 15, 400, 50);
	    processName.setHorizontalAlignment(JTextField.RIGHT);
	    JTextField pName = new JTextField("Process Name (Default = systemProcess");
	    pName.setBorder(null);
	    pName.setBackground(null);
	    pName.setBounds(330, 70, 100, 25);

	    JTextField processLife = new JTextField();
	    //JTextArea processLife = new JTextArea("Enter the lifeTime...");
	    processLife.setBounds(230, 100, 200, 40);
	    processLife.setHorizontalAlignment(JTextField.RIGHT);
	    JTextField pLife = new JTextField("Process LifeTime(int) default=120");
	    pLife.setBorder(null);
	    pLife.setBackground(null);
	    pLife.setBounds(250, 145, 200, 25);
	    
	    ImageIcon addIcon = new ImageIcon("D:\\Eclipse Program\\Eclipse WorkSpace\\SimulatingOS\\add.png", "an add icon");
	    JButton addProcessB = new JButton("    Add", addIcon);
	    addProcessB.setBounds(15, 200, 120, 50);
	    
	    getProcessWindow.setVisible(true);
	    //this.latch1 = MainRunner.latch;
	    
	    addProcessB.addActionListener(new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent arg1)
	    			{
	    				String name, life;
	    				name = processName.getText();
	    				setname(name);
	    				life = processLife.getText();
	    				setLife(life);
	    				getProcessWindow.dispose();
	    				
	    				Process one = new Process(MainRunner.procName, MainRunner.procLife);
	    				System.out.println(MainRunner.procName);
						System.out.println(MainRunner.procLife);
	    				MainRunner.processQueue.add(one);
	    			}
	    		});
	    
	    
	    
	    getProcessWindow.add(processName);
	    getProcessWindow.add(processLife);
	    getProcessWindow.add(pLife);
	    getProcessWindow.add(pName);
	    getProcessWindow.add(addProcessB);
	    //getProcessWindow.pack();
	    getProcessWindow.setVisible(true);
		
//	}
	
	
	
	}
}
