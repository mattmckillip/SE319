package cs.iastate.edu.cs319;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class AssemblyGUIv2 {

	private JFrame frmAntlrAssemblyHelper;
	private JTable outputTable;
	private JTable registerTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssemblyGUIv2 window = new AssemblyGUIv2();
					window.frmAntlrAssemblyHelper.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AssemblyGUIv2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAntlrAssemblyHelper = new JFrame();
		frmAntlrAssemblyHelper.setTitle("ANTLR Assembly Helper - Group 20");
		frmAntlrAssemblyHelper.setBounds(100, 100, 745, 612);
		frmAntlrAssemblyHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAntlrAssemblyHelper.getContentPane().setLayout(null);
		
	    JMenuBar menubar = new JMenuBar();
	    JMenu file = new JMenu("File");
	    file.setMnemonic(KeyEvent.VK_F);

	    JMenuItem eMenuItem = new JMenuItem("Exit");
	    eMenuItem.setMnemonic(KeyEvent.VK_E);
	    eMenuItem.setToolTipText("Exit application");
	    eMenuItem.addActionListener(new ActionListener() {
	    @Override
	    	public void actionPerformed(ActionEvent event) {
	            System.exit(0);
	        }
	    });

	    file.add(eMenuItem);
	    menubar.add(file);
	    
	    JMenu run = new JMenu("Run");
	    file.setMnemonic(KeyEvent.VK_F);

	    JMenuItem translateMenuItem = new JMenuItem("Translate");
	    JMenuItem guiMenuItem = new JMenuItem("Show Tree");

	    run.add(translateMenuItem);
	    run.add(guiMenuItem);

	    menubar.add(run);

	    frmAntlrAssemblyHelper.setJMenuBar(menubar);
		
		JLabel lblAssemblyCode = new JLabel("Assembly Code");
		lblAssemblyCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAssemblyCode.setBounds(10, 11, 174, 14);
		frmAntlrAssemblyHelper.getContentPane().add(lblAssemblyCode);
		
		JLabel lbRegisterValues = new JLabel("Register Values");
		lbRegisterValues.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbRegisterValues.setBounds(369, 343, 147, 14);
		frmAntlrAssemblyHelper.getContentPane().add(lbRegisterValues);
		
		JLabel lblTranslatedOutput = new JLabel("Translated Output");
		lblTranslatedOutput.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTranslatedOutput.setBounds(369, 11, 247, 14);
		frmAntlrAssemblyHelper.getContentPane().add(lblTranslatedOutput);

		
		JScrollPane inputScrollPane = new JScrollPane();
		inputScrollPane.setBounds(10, 36, 343, 462);
		frmAntlrAssemblyHelper.getContentPane().add(inputScrollPane);
		
		JEditorPane inputEditorPane = new JEditorPane();
		inputScrollPane.setViewportView(inputEditorPane);
		
		JButton btnTranslate = new JButton("Translate");
		btnTranslate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTranslate.setBounds(10, 513, 343, 29);
		frmAntlrAssemblyHelper.getContentPane().add(btnTranslate);
		
		JScrollPane OutputScrollPane = new JScrollPane();
		OutputScrollPane.setBounds(366, 36, 353, 299);
		frmAntlrAssemblyHelper.getContentPane().add(OutputScrollPane);
		
		outputTable = new JTable();
		OutputScrollPane.setViewportView(outputTable);
		outputTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		outputTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Instruction", "Translated Output"
			}
		));
		
		JScrollPane RegisterScrollPane = new JScrollPane();
		RegisterScrollPane.setBounds(369, 368, 350, 174);
		frmAntlrAssemblyHelper.getContentPane().add(RegisterScrollPane);
		
		registerTable = new JTable();
		RegisterScrollPane.setViewportView(registerTable);
		registerTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Register", "Value"
			}
		));
		registerTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	}
}
