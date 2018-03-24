package views;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import common.system.NodeFunctions;
import common.system.domain.AbstractNode;

import java.awt.Font;

public class Tree extends JPanel {
	private JTextArea treeTxtArea;

	/**
	 * Create the panel.
	 */
	public Tree(AbstractNode workspace) {
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
					.addGap(1))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
		);
		
		treeTxtArea = new JTextArea();
		treeTxtArea.setEditable(false);
		treeTxtArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		scrollPane.setViewportView(treeTxtArea);
		setLayout(groupLayout);
		
		treeTxtArea.setText(NodeFunctions.expression(workspace) + "\n" + NodeFunctions.tree(workspace));
		

	}

}
