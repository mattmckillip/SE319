package cs.iastate.edu.cs319;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.ExpandVetoException;
import javax.swing.tree.TreePath;

public class Lab2Swing extends JFrame {

	private JPanel contentPane;
	private JList<String> list;
	public DataModel listModel;
	private JTable table;
	private JTree tree;
	private DefaultMutableTreeNode node;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab2Swing frame = new Lab2Swing();
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
	public Lab2Swing() {
		
		//create frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create tabbed panel
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBounds(0, 0, 434, 262);
		contentPane.add(tabbedPane);
		
		//create jlist panel
		list = new JList<String>();
		list.setSelectionBackground(Color.YELLOW);
		JPanel listPanel = new JPanel();
		tabbedPane.addTab("List", null, listPanel, null);
		listPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(107, 183, 89, 23);
		listPanel.add(btnNewButton);
		listModel = new DataModel("companies.txt");
		list.setModel(listModel);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				// Identify the node that has been selected
				System.out.println(list.getSelectedValue());
				String response = JOptionPane.showInputDialog(null,
		                "What is the new company?",
		                "Enter new company name",
		                JOptionPane.QUESTION_MESSAGE);
		    	
				if (response != null){
					listModel.addElement(response);
			}
		}});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 405, 161);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		listPanel.add(scrollPane);

		scrollPane.setViewportView(list);
		
		JButton btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.setBounds(230, 183, 89, 23);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				// Identify the node that has been selected
				listModel.removeElement(list.getSelectedIndex());			
			}
		});
		
		listPanel.add(btnNewButton_1);
		
		
		// add tree panel
		tabbedPane.addTab("Tree", null, new TreePanel(), null);

		
		//create jtable panel
		JPanel tablePanel = new JPanel();
		tabbedPane.addTab("Table", null, tablePanel, null);
		tablePanel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(0, 0, 425, 230);
		tablePanel.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Kathy", "Smith", "25", "F", "false"},
				{"John", "Doe", "43", "M", "false"},
				{"Sue", "Black", "61", "F", "true"},
				{"Jane", "White", "17", "F", "true"},
				{"Joe", "Brown", "32", "M", "false"},
				{"Abby", "Dawn", "41", "F", "false"},
				{"Mila", "Manson", "26", "F", "true"},
				{"Jack", "Schmitt", "32", "M", "true"},
			},
			new String[] {
				"First Name", "Last Name", "Age", "Sex", "Vegetarian"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
	}
	
	  
}

class TreePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTree tree;
	private DefaultTreeModel tModel;

	public TreePanel() {
		// Layout Management of the Panel
		setLayout(new BorderLayout());

		// CREATE THE TREEMODEL
		tModel = createTreeModel();
		
		// CREATE THE JTREE and SET ITS PROPERTIES
		tree = new JTree(tModel);
		tree.setShowsRootHandles(true);
		tree.setRootVisible(true);
		tree.setEditable(false);
		
		// ADD TREE NODE LISTENERS (i.e. when a node in tree is selected)
		tree.addTreeSelectionListener(createTreeSelectionListener());

		// ADD TREE EXPANSION LISTENERS (i.e. when a tree node starts expanding or collapsing).
		tree.addTreeWillExpandListener(createTreeWillExpandListener());

		// ADD THE JTREE to the main panel (in a scroll pane)
		JScrollPane scroll = new JScrollPane(tree);
		add(scroll, BorderLayout.CENTER);

		// CREATE THE CONTROLLER BUTTONS TO MODIFY THE TREE MODEL
		JPanel controllerButtonsPanel = createControllerButtonsPanel();
		
		// ADD THE CONTROLLER BUTTONS to the main panel.
		add(controllerButtonsPanel, BorderLayout.SOUTH);

	}

	private TreeWillExpandListener createTreeWillExpandListener() {
		return new TreeWillExpandListener() {
			public void treeWillCollapse(TreeExpansionEvent evt)
					throws ExpandVetoException {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) evt
						.getPath().getLastPathComponent();

			}

			public void treeWillExpand(TreeExpansionEvent evt)
					throws ExpandVetoException {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) evt
						.getPath().getLastPathComponent();

			}

		};
	}

	private TreeSelectionListener createTreeSelectionListener() {
		return new TreeSelectionListener() {
			// valueChanged - fired when the selection changes.
			public void valueChanged(TreeSelectionEvent evt) {
				TreePath selectedPath = tree.getSelectionPath();
				
			}
		};

	}

	private DefaultTreeModel createTreeModel() {
		
		return new DefaultTreeModel(
				new DefaultMutableTreeNode("Animals") {
					{
						DefaultMutableTreeNode node_1;
						node_1 = new DefaultMutableTreeNode("Mammals");
							node_1.add(new DefaultMutableTreeNode("Human"));
							node_1.add(new DefaultMutableTreeNode("Kangaroo"));
							node_1.add(new DefaultMutableTreeNode("Elephant"));
							node_1.add(new DefaultMutableTreeNode("Goat"));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("Reptiles");
							node_1.add(new DefaultMutableTreeNode("Lizared"));
							node_1.add(new DefaultMutableTreeNode("Boa"));
							node_1.add(new DefaultMutableTreeNode("Iguana"));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("Birds");
							node_1.add(new DefaultMutableTreeNode("Duck"));
							node_1.add(new DefaultMutableTreeNode("Pigeon"));
							node_1.add(new DefaultMutableTreeNode("Turkey"));
							node_1.add(new DefaultMutableTreeNode("Goose"));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("Insects");
							node_1.add(new DefaultMutableTreeNode("Termite"));
							node_1.add(new DefaultMutableTreeNode("Ladybug"));
							node_1.add(new DefaultMutableTreeNode("Fly"));
							node_1.add(new DefaultMutableTreeNode("Ant"));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("Aquatic");
							node_1.add(new DefaultMutableTreeNode("Sword Fish"));
							node_1.add(new DefaultMutableTreeNode("Shark"));
							node_1.add(new DefaultMutableTreeNode("Whale"));
						add(node_1);
					}
				}
			);
	}

	private TreeModelListener createTreeModelListener() {
		/*
		 * Model listeners Note: any change to the tree structure or the node
		 * value will result in TreeModelEvent and a notification will be sent
		 * to the TreeModelListeners
		 */
		return new TreeModelListener() {
			public void treeNodesChanged(TreeModelEvent evt) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) (evt
						.getTreePath().getLastPathComponent());

			}

			public void treeNodesInserted(TreeModelEvent evt) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) (evt
						.getTreePath().getLastPathComponent());
				
			}

			public void treeNodesRemoved(TreeModelEvent evt) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) (evt
						.getTreePath().getLastPathComponent());

			}

			// need to have a drastic change or fired explicitly: remove the
			// root node
			public void treeStructureChanged(TreeModelEvent evt) {

				
			}
		};
	}

	private JPanel createControllerButtonsPanel() {
		/*
		 * THESE ARE THE CONTROLLER BUTTONS FOR MODIFYING THE MODEL
		 * adding/removing nodes from the tree create a panel which contains
		 * buttons for updating the tree
		 */
		JPanel buttonPanel = new JPanel();
		JButton addSib = new JButton("Add");
		
		JButton remNode = new JButton("Remove");

		buttonPanel.add(addSib);

		buttonPanel.add(remNode);
		// buttonPanel.add(remRoot);

		// adding a sibling action!
		addSib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				// Identify the node that has been selected
				DefaultMutableTreeNode selected = (DefaultMutableTreeNode) tree
						.getLastSelectedPathComponent();
				if (selected == null)
					return;

				// get the parent of the selected node
				DefaultMutableTreeNode parent = (DefaultMutableTreeNode) selected
						.getParent();
				if (parent == null)
					return;

				// add a new node after the selected node as a child of the
				// selected node's parent
				
				String response = JOptionPane.showInputDialog(null,
		                "What is the new animal?",
		                "Enter new animal name",
		                JOptionPane.QUESTION_MESSAGE);
		    	
				
				if (response != null){
				tModel.insertNodeInto(new DefaultMutableTreeNode(response),
						parent, parent.getIndex(selected) + 1);}

				/*
				 * Note: additions are done to the model, not the view. See
				 * below for the treeModelListener methods.
				 */
			}
		});


		// remove some selected node: you cannot remove the root node
		remNode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				// Identify the node that has been selected
				DefaultMutableTreeNode selected = (DefaultMutableTreeNode) tree
						.getLastSelectedPathComponent();
				if (selected == null)
					return;
				// Identify the parent of the selected node; we are not allowing
				// the root node to be removed
				if (selected.getParent() == null)
					return;

				// User the models remove method to remove the selected node
				tModel.removeNodeFromParent(selected);
			}
		});


		return buttonPanel;

	} // end of method getControllerButtonPanel

}


class DataModel extends AbstractListModel{
	//Instance variables
	private ArrayList<String> list;
	private String filename;
	
	public DataModel(String filen){
		filename = filen;
		try {
			list = readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private ArrayList<String> readFile() throws FileNotFoundException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(new FileReader(filename));
		ArrayList<String> companyList = new ArrayList<String>();
		while (in.hasNextLine()){
			companyList.add(in.nextLine());
		}
		return companyList;
	}
	
	private void updateFile(){
		//update instance variable
		try
		{
		    PrintWriter pr = new PrintWriter(filename);    

		    for (int i=0; i<list.size() ; i++)
		    {
		        pr.println(list.get(i));
		    }
		    pr.close();
		}
		catch (Exception e)
		{
		    e.printStackTrace();
		}
	}
	
	public void addElement (String s) {
		list.add(s);
		fireIntervalAdded(this,list.size()-1, list.size()-1);
		updateFile();

	}
	
	public void removeElement (int index) {
		System.out.println(list);
		list.remove(index);
		System.out.println(list);
		System.out.println("");
		this.fireIntervalRemoved(this, list.size()-1, list.size()-1);
		updateFile();

	}
	
	@Override
	public String getElementAt(int arg0) {
		return list.get(arg0);
	}

	@Override
	public int getSize() {
		return list.size();
	}
	

	
}


