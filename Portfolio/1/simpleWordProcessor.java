package portfolio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.TextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import javax.swing.ScrollPaneConstants;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class simpleWordProcessor extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simpleWordProcessor frame = new simpleWordProcessor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public simpleWordProcessor() {
		setTitle("Simple Word Processor - Group 20");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 572);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NumberOfWordsLabel = new JLabel("Number of Words - 0");
		NumberOfWordsLabel.setBounds(750, 490, 150, 15);
		contentPane.add(NumberOfWordsLabel);
		
		JTabbedPane tabbedEditorPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedEditorPanel.setBounds(10, 87, 887, 399);
		contentPane.add(tabbedEditorPanel);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedEditorPanel.addTab("Word Editor", null, scrollPane, null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JTextArea textEditor = new JTextArea();
		scrollPane.setViewportView(textEditor);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedEditorPanel.addTab("Spreadsheet Editor", null, scrollPane_1, null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel NumberOfLinesLabel = new JLabel("Number of Lines - 0");
		NumberOfLinesLabel.setBounds(420, 490, 128, 15);
		contentPane.add(NumberOfLinesLabel);
		
		JPanel settingsPanel = new JPanel();
		settingsPanel.setBounds(10, 11, 887, 68);
		contentPane.add(settingsPanel);
		settingsPanel.setLayout(null);
		
		JComboBox fontCombo = new JComboBox();
		fontCombo.setBounds(10, 10, 105, 20);
		settingsPanel.add(fontCombo);
		fontCombo.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Calibri", "Times New Roman"}));
		
		JButton fontSmallerBTN = new JButton("A");
		fontSmallerBTN.setBounds(200, 40, 50, 25);
		settingsPanel.add(fontSmallerBTN);
		fontSmallerBTN.setFont(new Font("Tahoma", Font.BOLD, 8));
		
		JComboBox fontSizeCombo = new JComboBox();
		fontSizeCombo.setBounds(118, 10, 42, 20);
		settingsPanel.add(fontSizeCombo);
		fontSizeCombo.setModel(new DefaultComboBoxModel(new String[] {"8", "10", "11", "12", "13", "14", "16", "20", "24", "28", "36"}));
		
		JButton fontLargerBTN = new JButton("A");
		fontLargerBTN.setBounds(200, 10, 50, 25);
		settingsPanel.add(fontLargerBTN);
		fontLargerBTN.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton boldBTN = new JButton("B");
		boldBTN.setFont(new Font("Tahoma", Font.BOLD, 11));
		boldBTN.setBounds(10, 40, 50, 25);
		settingsPanel.add(boldBTN);
		
		JButton italicBTn = new JButton("I");
		italicBTn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		italicBTn.setBounds(60, 40, 50, 25);
		settingsPanel.add(italicBTn);
		
		JButton underlinedBTN = new JButton("U");
		underlinedBTN.setFont(new Font("Tahoma", Font.BOLD, 11));
		underlinedBTN.setBounds(110, 40, 50, 25);
		settingsPanel.add(underlinedBTN);
		
		JComboBox fontColorCombo = new JComboBox();
		fontColorCombo.setModel(new DefaultComboBoxModel(new String[] {"Black", "Red", "Green", "Blue", "Yellow", "Grey", "Purple"}));
		fontColorCombo.setBounds(420, 10, 85, 20);
		settingsPanel.add(fontColorCombo);
		
		JComboBox backgroundColorCombo = new JComboBox();
		backgroundColorCombo.setModel(new DefaultComboBoxModel(new String[] {"Black", "Red", "Green", "Blue", "Yellow", "Orange", "Purple"}));
		backgroundColorCombo.setBounds(420, 40, 85, 20);
		settingsPanel.add(backgroundColorCombo);
		
		Label fontColorLabel = new Label("Font Color");
		fontColorLabel.setBounds(351, 10, 62, 22);
		settingsPanel.add(fontColorLabel);
		
		Label backgroundColorLabel = new Label("Background Color");
		backgroundColorLabel.setBounds(313, 40, 100, 22);
		settingsPanel.add(backgroundColorLabel);
		
		JButton leftBTN = new JButton("Left");
		leftBTN.setBounds(575, 10, 100, 25);
		settingsPanel.add(leftBTN);
		
		JButton rigthBTN = new JButton("Right");
		rigthBTN.setBounds(775, 10, 100, 25);
		settingsPanel.add(rigthBTN);
		
		JButton centerBTN = new JButton("Center");
		centerBTN.setBounds(675, 10, 100, 25);
		settingsPanel.add(centerBTN);
		
		JLabel lblSpacing = new JLabel("Spacing");
		lblSpacing.setBounds(575, 40, 50, 20);
		settingsPanel.add(lblSpacing);
		
		JComboBox lineSpacingCombo = new JComboBox();
		lineSpacingCombo.setBounds(625, 40, 50, 20);
		settingsPanel.add(lineSpacingCombo);
		lineSpacingCombo.setModel(new DefaultComboBoxModel(new String[] {"1.0", "1.5", "2", "3.5", "3"}));
	}
}
