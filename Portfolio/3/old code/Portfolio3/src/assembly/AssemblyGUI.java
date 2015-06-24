package assembly;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AssemblyGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Assembly IDE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(600,400));
		frame.setContentPane(createContainers());
		//frame.pack();
		frame.setVisible(true);
	}
	
	static JPanel createContainers(){
		final String grammerFile = "Assembly.g4";
		final String inputFile = "assemblyOut.txt";
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		JLabel welcome = new JLabel("Welcome to the Assembly IDE!");
		welcome.setFont(new Font("Arial", Font.BOLD, 20));
		final JTextArea input = new JTextArea("Write Assembly Code Here!");
		final JLabel output = new JLabel("Output appears here");
		JPanel buttonPanel = new JPanel();
		JButton executeButton = new JButton("Execute");
		
		executeButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String str = "Error: See Console";
						try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(inputFile))){
							input.write(fileOut);
						}
						catch (IOException ioe){
							ioe.printStackTrace();
						}
						try {
							AssemblyTree tr = new AssemblyTree();
							str = tr.parse(inputFile,grammerFile,"start");
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						output.setText(str);
					}
				});
		
		JButton treeButton = new JButton("Show Tree");
		
		treeButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(inputFile))){
							input.write(fileOut);
						}
						catch (IOException ioe){
							ioe.printStackTrace();
						}
						try {
							Runtime.getRuntime().exec("java org.antlr.v4.runtime.misc.TestRig Assembly start -gui < " + inputFile);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				});
		
		buttonPanel.add(executeButton);
		buttonPanel.add(treeButton);
		mainPanel.add(welcome);
		mainPanel.add(input);
		mainPanel.add(buttonPanel);
		mainPanel.add(output);
		return mainPanel;
	}

}
