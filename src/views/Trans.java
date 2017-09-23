package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import common.system.NodeFunctions;
import common.system.Rule;
import common.system.Transformation;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

public class Trans extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnSave;
	private JTextArea rulesTxtArea;
	private ComboBoxModel<Transformation> model = new DefaultComboBoxModel<Transformation>();
	private JComboBox<Transformation> selectCmbBox;
	private JButton btnPreview;
	private JButton btnDelete;
	private JTextArea txtrEditrules;
	private JPanel editPanel;
	private JButton btnClose;
	private JButton btnEdit;
	private JTabbedPane tabSpace;

	/**
	 * Launch the application.
	 */
	public static void main(int tab, ComboBoxModel<Transformation> inputModel) {
		try {
			Trans dialog = new Trans(tab, inputModel);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Trans(int tab, ComboBoxModel<Transformation> inputModel) {
		
		model = inputModel;
		
		initComponents();
		
		tabSpace.setSelectedIndex(tab);
		
		createEvents();

	}
	
	public void createEvents(){
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!rulesTxtArea.getText().matches("")){
					//ADD TO DM
			        ((DefaultComboBoxModel<Transformation>) model).addElement(new Transformation(NodeFunctions.textToArray(rulesTxtArea.getText())));
			        
			        //((DefaultComboBoxModel<Transformation>) mngModel).addElement(new Transformation(NodeFunctions.textToArray(rulesTxtArea.getText())));
			        rulesTxtArea.setText("");
			        
			        //BIND IT TO COMBO
			        selectCmbBox.setModel(model);
			        
			        
			       // cmbMngTrans.setModel(mngModel);
			        }
			        else {
						Object frame = null;
						JOptionPane.showMessageDialog((Component) frame,
						"No rules to be saved!",
					    "Transformation Error",
					    JOptionPane.ERROR_MESSAGE);
						
					}
					
				} catch (IOException  e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});	
		
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectCmbBox.getItemCount()>0){
				editPanel.setVisible(true);
					
				String rules = "";
				for (Rule rule : ((Transformation) selectCmbBox.getSelectedItem()).getRules()){
					rules = rules + rule +"\n";
				}
				txtrEditrules.setText(rules);
				}
				else{
					
					Object frame = null;
					JOptionPane.showMessageDialog((Component) frame,
					"There are no transformations stored.",
				    "Transformation Error",
				    JOptionPane.ERROR_MESSAGE);
				
			}
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editPanel.setVisible(false);
				if (selectCmbBox.getItemCount()!=0){
					final int i = selectCmbBox.getSelectedIndex();
					selectCmbBox.removeItemAt(i);
				
				}
				else{
				
						Object frame = null;
						JOptionPane.showMessageDialog((Component) frame,
						"There are no transformations stored.",
					    "Transformation Error",
					    JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editPanel.setVisible(false);
			}
		});
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnEdit.getText().matches("Edit")){
				txtrEditrules.setEditable(true);
				btnEdit.setText("Save");
				}
				else {
					try {
					txtrEditrules.setEditable(false);
					btnEdit.setText("Edit");
					editPanel.setVisible(false);
					
				
					if (!txtrEditrules.getText().matches("")){
					//remove old transformation
					final int i = selectCmbBox.getSelectedIndex();
					selectCmbBox.removeItemAt(i);
					
					//replace with new one
					Transformation newTrans = new Transformation(NodeFunctions.textToArray(txtrEditrules.getText()));
					((DefaultComboBoxModel<Transformation>) model).addElement(newTrans);
					selectCmbBox.setModel(model);
				
					Object frame = null;
					JOptionPane.showMessageDialog((Component) frame,
					"Transformation has been edited.",
				    "Success",
				    JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						Object frame = null;
						JOptionPane.showMessageDialog((Component) frame,
						"No rules to be saved!",
					    "Transformation Error",
					    JOptionPane.ERROR_MESSAGE);
					}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				
				
			}
		});
		
		
		
	}
	
	private void initComponents(){
		
		setTitle("Transformations");
		
		setBounds(100, 100, 650, 630);
		setMinimumSize(new Dimension(650,630));
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		tabSpace = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(tabSpace, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabSpace, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
					.addContainerGap())
		);
		{
			JPanel newTransPanel = new JPanel();
			newTransPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
			tabSpace.addTab("New Transformation Wizard", null, newTransPanel, null);
			JLabel lblRules = new JLabel("Rules:");
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
			btnSave = new JButton("Save");
			GroupLayout gl_newTransPanel = new GroupLayout(newTransPanel);
			gl_newTransPanel.setHorizontalGroup(
				gl_newTransPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_newTransPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_newTransPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_newTransPanel.createSequentialGroup()
								.addGroup(gl_newTransPanel.createParallelGroup(Alignment.TRAILING)
									.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
									.addComponent(lblRules, Alignment.LEADING))
								.addContainerGap())
							.addComponent(btnSave, Alignment.TRAILING)))
			);
			gl_newTransPanel.setVerticalGroup(
				gl_newTransPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_newTransPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblRules)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
						.addGap(24)
						.addComponent(btnSave))
			);
			{
				rulesTxtArea = new JTextArea();
				rulesTxtArea.setFont(new Font("Courier New", Font.PLAIN, 13));
				scrollPane.setViewportView(rulesTxtArea);
			}
			newTransPanel.setLayout(gl_newTransPanel);
		}
		{
			JPanel managePanel = new JPanel();
			managePanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
			tabSpace.addTab("Manage Transformations", null, managePanel, null);
			JLabel lblSelectTransformation = new JLabel("Select Transformation:");
			selectCmbBox = new JComboBox();
			selectCmbBox.setModel(model);
			selectCmbBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					editPanel.setVisible(false);
				}
			});
			
			btnDelete = new JButton("Delete");
			
			btnPreview = new JButton("Preview");
			
			
			editPanel = new JPanel();
			editPanel.setVisible(false);
			editPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
			GroupLayout gl_managePanel = new GroupLayout(managePanel);
			gl_managePanel.setHorizontalGroup(
				gl_managePanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_managePanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_managePanel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_managePanel.createSequentialGroup()
								.addGroup(gl_managePanel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblSelectTransformation)
									.addComponent(selectCmbBox, 0, 603, Short.MAX_VALUE))
								.addGap(7))
							.addGroup(gl_managePanel.createSequentialGroup()
								.addComponent(btnPreview)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnDelete)
								.addContainerGap())))
					.addGroup(gl_managePanel.createSequentialGroup()
						.addComponent(editPanel, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
						.addGap(12))
			);
			gl_managePanel.setVerticalGroup(
				gl_managePanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_managePanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblSelectTransformation)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(selectCmbBox, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_managePanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnDelete)
							.addComponent(btnPreview))
						.addGap(18)
						.addComponent(editPanel, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
						.addContainerGap())
			);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
			
			btnEdit = new JButton("Edit");
			
			btnClose = new JButton("Close");
			GroupLayout gl_editPanel = new GroupLayout(editPanel);
			gl_editPanel.setHorizontalGroup(
				gl_editPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_editPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_editPanel.createSequentialGroup()
								.addComponent(btnClose)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnEdit))
							.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)))
			);
			gl_editPanel.setVerticalGroup(
				gl_editPanel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_editPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnEdit)
							.addComponent(btnClose))
						.addContainerGap())
			);
			
			txtrEditrules = new JTextArea();
			txtrEditrules.setFont(new Font("Courier New", Font.PLAIN, 13));
			txtrEditrules.setEditable(false);
			scrollPane.setViewportView(txtrEditrules);
			editPanel.setLayout(gl_editPanel);
			managePanel.setLayout(gl_managePanel);
		}
		contentPanel.setLayout(gl_contentPanel);
		
	}

	
}
