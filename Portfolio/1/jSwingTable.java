package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/*This is the beginning structure from the in class example 
 *(GoodSwingButton.java) with TreeFrame.java added and then heavily
 *modified into a table frame. Some of the changes only required a
 *simple name change (tree to table) while others required completely 
 *different arguments and methods.
 */
public class jSwingTable {
	public static void main(String args[]) {
		Runnable runner = new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Table Frame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//This next line links to the content we structured
				//from the TreeFrame.java example
				frame.getContentPane().add(new TablePanel());
				frame.setVisible(true);
				ContainerListener container = new ContainerAdapter() {
					public void componentAdded(final ContainerEvent e) {
						SwingWorker worker = new SwingWorker() {
							protected Object doInBackground()
									throws InterruptedException {
								return null;
							}
						//We removed some code here that was unnecessary
						//for our implementation
							
						};
						worker.execute();
					}
				};
				frame.getContentPane().addContainerListener(container);
				frame.setSize(800, 200);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
				//We also removed some unnecessary code here as well.
				frame.setVisible(true);
			}
		};
		SwingUtilities.invokeLater(runner);

	}
}


//Much of this next class and its methods was modelled from the TreeFrame
//example but differences between the tree and table are fairly clear with
//the commented changes.
class TablePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTable table; 
	private DefaultTableModel tModel;
	//We decided to add a variable to help track the column changes
	//in our table rather than override the TableModelEvent class.
	private int columnCount;

	public TablePanel() {
		// Layout Management of the Panel
		setLayout(new BorderLayout());

		// CREATE THE TABLEMODEL
		//Instead of an entire class (DefaultTreeModel we just needed a  
		//simple call to the default constructor
		tModel = new DefaultTableModel(5, 5);
		columnCount = 5;//and setting the column count variable

		// ADD TABLE LISTENER (i.e. when the table is altered in any way)
		tModel.addTableModelListener(createTableModelListener());

		// ADD THE Jtable to the main panel (in a scroll pane)
		table = new JTable(tModel);
		
		//We obviously cut out the code exclusive to the tree model
		
		// ADD THE JTABLE to the main panel (in a scroll pane)
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);

		// CREATE THE CONTROLLER BUTTONS TO MODIFY THE TABLE MODEL
		JPanel controllerButtonsPanel = createControllerButtonsPanel();

		// ADD THE CONTROLLER BUTTONS to the main panel.
		add(controllerButtonsPanel, BorderLayout.SOUTH);

	}

	
	private TableModelListener createTableModelListener() {
		/*
		 * Model listeners Note: any change to the table structure or the node
		 * value will result in tableModelEvent and a notification will be sent
		 * to the tableModelListener
		 */
		 //TableModelListener was different enough from TreeModelListener
		 //that we rewrote the entire method.
		 //The method also had no way of tracking the difference between
		 //Data alterations and column alterations so we added a variable
		 //to help us track and report that as well.
		return new TableModelListener() {
			
			//For this method the only arguments that were reported to it
			//were "1" for row addition/insertion, "-1" for row removal
			//and "0" for data alteration, column addition and column removal
			//@Override
			public void tableChanged(TableModelEvent e) {
				switch (e.getType()) {
				case TableModelEvent.INSERT:
					System.out.print("Row was added\n");
					break;
				case TableModelEvent.DELETE:
					System.out.print("Row was removed\n");
					break;
				//Since "0" was reported for 3 different changes
				//we tracked what actually happened with the use of the
				//columnCount variable
				case TableModelEvent.UPDATE:
					//If columnCount was the same then data must have been
					//changed
					if (tModel.getColumnCount() == columnCount)						
						System.out.print("Data was altered\n");
					//If there are more columns than the variable then
					//one must have been added.
					else if (tModel.getColumnCount() > columnCount) {
						System.out.print("Column was added\n");
						//and then update the column count
						columnCount = tModel.getColumnCount();
					} 
					//Then there must be less columns than before
					//and one was removed
					else {
						System.out.print("Column was removed\n");
						//and then update the column count
						columnCount = tModel.getColumnCount();
					}

				}

			}
		};
	}

	//This method more closely resembles the method in TreeFrame
	//but with the respective calls made by the buttons being different
	private JPanel createControllerButtonsPanel() {
		/*
		 * THESE ARE THE CONTROLLER BUTTONS FOR MODIFYING THE MODEL
		 * adding/removing rows and columns from the table
		 */
		JPanel buttonPanel = new JPanel();
		JButton addRow = new JButton("Add Row");
		JButton remRow = new JButton("Remove Row");
		JButton addCol = new JButton("Add Column");
		JButton remCol = new JButton("Remove Column");
		buttonPanel.add(addRow);
		buttonPanel.add(remRow);
		buttonPanel.add(addCol);
		buttonPanel.add(remCol);

		//Adds a row to the table. If a cell is selected adds above cell.
		addRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				int selected = table.getSelectedRow();
				if (selected == -1) {
					tModel.addRow(new Object[] {});
					return;
				}

				tModel.insertRow(selected, new Object[] {});

			}
		});
		
		//Removes a row from the table (does nothing when no rows exist).
		//If a cell is selected then it removes the row containing that cell.
		remRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				int selected = table.getSelectedRow();
				if (selected == -1) {
					if (tModel.getRowCount() == 0)
						return;
					tModel.removeRow(tModel.getRowCount() - 1);
					return;
				}

				tModel.removeRow(selected);

			}
		});

		//Adds a column to the table (at the end).
		//There was no method available to insert a column anywhere else
		addCol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				tModel.addColumn(null, new Object[] {});

			}
		});

		//Removes the last column. Does nothing when no columns exist.
		remCol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (tModel.getColumnCount() == 0)
					return;
				tModel.setColumnCount(tModel.getColumnCount() - 1);

			}
		});

		return buttonPanel;

	} 

}
