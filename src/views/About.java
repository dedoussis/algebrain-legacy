package views;

import javax.swing.JPanel;
import javax.swing.JLabel;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class About extends JPanel {

	/**
	 * Create the panel.
	 */
	public About() {
		
		
		JLabel lblComputerAlgebraSystem = new JLabel("Computer Algebra System");
		lblComputerAlgebraSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblComputerAlgebraSystem.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JLabel lblMscInComputer = new JLabel("MSc in Computer Science, 2017 - Dissertation");
		lblMscInComputer.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAuthorDimitriosDedoussis = new JLabel("Author: Dimitrios Dedoussis");
		lblAuthorDimitriosDedoussis.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSupervisorDrViktor = new JLabel("Supervisor: Dr Victor Khomenko");
		lblSupervisorDrViktor.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(About.class.getResource("/resources/antlr.png")));
		
		JLabel lblAntlrUsedFor = new JLabel("ANTLR4 used for parsing.");
		lblAntlrUsedFor.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("©2017");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
						.addComponent(lblSupervisorDrViktor, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
						.addComponent(lblAuthorDimitriosDedoussis, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblMscInComputer, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
						.addComponent(lblComputerAlgebraSystem, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
						.addComponent(lblAntlrUsedFor, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblComputerAlgebraSystem)
					.addGap(12)
					.addComponent(lblMscInComputer)
					.addGap(12)
					.addComponent(lblAuthorDimitriosDedoussis)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSupervisorDrViktor)
					.addGap(12)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAntlrUsedFor)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		
		

	}

}
