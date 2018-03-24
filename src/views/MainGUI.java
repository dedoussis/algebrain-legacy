package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.ActionMap;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.border.TitledBorder;

import common.system.NodeFunctions;
import common.system.domain.AbstractNode;
import common.system.domain.OperatorNode;
import common.system.domain.Rule;
import common.system.domain.Transformation;
import common.system.domain.VarNode;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JMenuBar;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrActiveStrTxtArea;
	private JTextPane txtpnHistorytxtarea;
	private JButton btnEnter;
	private JButton btnClearActiveString;
	private AbstractNode workspace;
	private static final String TEXT_SUBMIT = "text-submit";
	private static final String INSERT_BREAK = "insert-break";
	private JMenuItem mntmClearTerminal;
	private JMenuItem mntmCopy;
	private JMenuItem mntmPaste;
	private JMenuItem mntmSelectAll;
	private JMenuItem mntmNewTransformationWizard;
	private Trans transFrame;
	private JMenuItem mntmManageTransformations;
	private ComboBoxModel<Transformation> model = new DefaultComboBoxModel<Transformation>();
	private JComboBox<Transformation> transCmbBox;
	private JButton btnTransform;
	private JButton btnAddOpe;
	private Stack<AbstractNode> history = new Stack<AbstractNode>();
	private Stack<AbstractNode> tempHist = (Stack<AbstractNode>) history.clone();
	private JMenuItem mntmShowTree;
	private JMenuItem mntmCredits;
	private JMenuItem mntmNew;
	private JMenuItem mntmClose;
	private JMenuItem mntmLoadSetup;
	private JMenuItem mntmExportAstxt;
	private JMenuItem mntmImport;

	/**
	 * @wbp.nonvisual location=878,201
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {

		background();

		initComponents();

		createEvents();

	}

	private void createEvents() {

		InputMap input = txtrActiveStrTxtArea.getInputMap();
		KeyStroke enter = KeyStroke.getKeyStroke("ENTER");
		KeyStroke shiftEnter = KeyStroke.getKeyStroke("shift ENTER");
		KeyStroke up = KeyStroke.getKeyStroke("UP");
		input.put(shiftEnter, INSERT_BREAK); // input.get(enter)) =
												// "insert-break"
		input.put(enter, TEXT_SUBMIT);
		input.put(up, 5);

		ActionMap actions = txtrActiveStrTxtArea.getActionMap();
		actions.put(INSERT_BREAK, new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtrActiveStrTxtArea.append(" \n");
			}

		});

		actions.put(TEXT_SUBMIT, new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (!txtrActiveStrTxtArea.getText().matches("")) {
						workspace = NodeFunctions.expressionToNode(txtrActiveStrTxtArea.getText());

						workspace = NodeFunctions.cannonical(workspace);
						history.push(workspace);

						submit(workspace, false);
						txtrActiveStrTxtArea.setText("");

					} else {
						txtrActiveStrTxtArea.setText("");
						txtrActiveStrTxtArea.setCaretPosition(0);
						Object frame = null;
						JOptionPane.showMessageDialog((Component) frame, "No expression to be loaded!",
								"Expression Error", JOptionPane.ERROR_MESSAGE);

					}

				} catch (IOException | CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		actions.put(5, new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (!tempHist.isEmpty())
					txtrActiveStrTxtArea.setText(NodeFunctions.expression(tempHist.pop()));
				else
					tempHist = (Stack<AbstractNode>) history.clone();

			}

		});

		ActionListener active = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!txtrActiveStrTxtArea.getText().matches("")) {
						workspace = NodeFunctions.expressionToNode(txtrActiveStrTxtArea.getText());
						workspace = NodeFunctions.cannonical(workspace);
						history.push(workspace);

						submit(workspace, false);
						txtrActiveStrTxtArea.setText("");
					} else {
						Object frame = null;
						JOptionPane.showMessageDialog((Component) frame, "No expression to be loaded!",
								"Expression Error", JOptionPane.ERROR_MESSAGE);

					}

				} catch (IOException | CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				btnClearActiveString.transferFocusBackward();

			}
		};

		btnEnter.addActionListener(active);

		btnClearActiveString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrActiveStrTxtArea.setCaretPosition(0);
				txtrActiveStrTxtArea.setText("");
				btnClearActiveString.transferFocusBackward();

			}
		});

		mntmClearTerminal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnHistorytxtarea.setText("");
			}
		});

		mntmCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringSelection stringSelection = new StringSelection(txtrActiveStrTxtArea.getSelectedText());
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
			}
		});

		mntmPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrActiveStrTxtArea.paste();
			}
		});

		mntmSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrActiveStrTxtArea.selectAll();
			}
		});

		mntmNewTransformationWizard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				transFrame = new Trans(0, model);

				JOptionPane.showMessageDialog(null, transFrame.getContentPane(), "Transformations",
						JOptionPane.PLAIN_MESSAGE);

			}
		});

		mntmManageTransformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				transFrame = new Trans(1, model);

				JOptionPane.showMessageDialog(null, transFrame.getContentPane(), "Transformations",
						JOptionPane.PLAIN_MESSAGE);
			}
		});

		mntmShowTree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Tree treePane = new Tree(workspace);
				JOptionPane.showMessageDialog(null, treePane, "Expression Tree", JOptionPane.PLAIN_MESSAGE);
			}
		});

		mntmCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				About aboutPane = new About();
				JOptionPane.showMessageDialog(null, aboutPane, "About", JOptionPane.PLAIN_MESSAGE);
			}
		});

		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI frame = new MainGUI();
				frame.main(null);
			}
		});

		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		mntmLoadSetup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setup();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		mntmExportAstxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				export();
			}
		});

		mntmImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				importTxt();
			}
		});

		btnAddOpe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (transCmbBox.getItemCount() != 0 && workspace != null) {
						Transformation selectTr = (Transformation) transCmbBox.getSelectedItem();
						ArrayList<String> qualifiers = new ArrayList<String>();
						for (Rule i : selectTr.getRules()) {
							if (NodeFunctions.isOperator(i.getLhs())) {
								OperatorNode iOpe = (OperatorNode) i.getLhs();
								if (!iOpe.getKey().matches("[\\+\\-\\/\\*\\^]|sin|cos|tan|log|ln|e")) {
									if (!qualifiers.contains(iOpe.getKey()))
										qualifiers.add(iOpe.getKey());
								}
							}
						}

						OperatorNode newWorkspace = new OperatorNode(selectTr.toString());
						newWorkspace.getChildren().clear();
						newWorkspace.getChildren().add(workspace.clone());
						ButtonGroup bG = new ButtonGroup();
						if (NodeFunctions.isOperator(selectTr.getRules().get(0).getLhs())) {
							OperatorNode firstLhs = (OperatorNode) selectTr.getRules().get(0).getLhs();
							if (firstLhs.getKey().matches(selectTr.toString()) && firstLhs.getChildren().size() > 1) {
								JPanel paramPanel = new JPanel();

								for (int i = 0; i < qualifiers.size(); i++) {
									JRadioButton rdbtn = new JRadioButton(qualifiers.get(i));
									if (i == 0)
										rdbtn.setSelected(true);
									bG.add(rdbtn);
									paramPanel.add(rdbtn);
								}

								for (int i = 1; i < firstLhs.getChildren().size(); i++) {
									JLabel paramText = new JLabel("\nParameter #" + (i + 1) + ": ");
									JTextField paramExpr = new JTextField();
									paramExpr.setColumns(20);

									paramPanel.add(paramText);
									paramPanel.add(paramExpr);
								}

								Object frame = null;
								JOptionPane.showMessageDialog((Component) frame, paramPanel,
										"Declare remaining parameters", JOptionPane.PLAIN_MESSAGE);

								for (Component comp : paramPanel.getComponents()) {
									if (comp instanceof JTextField) {
										if (!((JTextField) comp).getText().equals(""))
											newWorkspace.getChildren().add(NodeFunctions.cannonical(
													NodeFunctions.expressionToNode(((JTextField) comp).getText())));
									}

								}
								for (Enumeration<AbstractButton> buttons = bG.getElements(); buttons
										.hasMoreElements();) {
									AbstractButton button = buttons.nextElement();
									if (button.isSelected()) {
										newWorkspace.setKey(button.getText());
									}
								}

								if (newWorkspace.getChildren().size() > 1) {
									workspace = newWorkspace;
									history.push(workspace);
									submit(workspace, true);
								}
							} else {
								workspace = newWorkspace;
								history.push(workspace);
								submit(workspace, true);
								return;
							}
						}
					} else if (workspace != null)
						showTransformationError();
					else
						showWorkspaceError();

				} catch (CloneNotSupportedException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		btnTransform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (transCmbBox.getItemCount() != 0 && workspace != null) {
						Transformation selectTr = (Transformation) transCmbBox.getSelectedItem();

						workspace = selectTr.transform(workspace);
						workspace = NodeFunctions.cannonical(workspace);
						history.push(workspace);
						submit(workspace, true);

					} else if (workspace != null)
						showTransformationError();
					else
						showWorkspaceError();

				} catch (CloneNotSupportedException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

	private void initComponents() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(MainGUI.class.getResource("/resources/icon_128.png")));
		setTitle("Computer Algebra System");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		setMinimumSize(new Dimension(850, 600));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmNew = new JMenuItem("New");

		mnFile.add(mntmNew);

		mntmImport = new JMenuItem("Import...");

		mnFile.add(mntmImport);

		mntmExportAstxt = new JMenuItem("Export as .txt");

		mnFile.add(mntmExportAstxt);

		mntmClose = new JMenuItem("Close");

		mnFile.add(mntmClose);

		JMenu mnTransformations = new JMenu("Transformations");
		menuBar.add(mnTransformations);

		mntmNewTransformationWizard = new JMenuItem("New Transformation Wizard");

		mnTransformations.add(mntmNewTransformationWizard);

		mntmManageTransformations = new JMenuItem("Manage Transformations");

		mnTransformations.add(mntmManageTransformations);

		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);

		mntmShowTree = new JMenuItem("Show Tree");

		mnTools.add(mntmShowTree);

		mntmClearTerminal = new JMenuItem("Clear Terminal");

		mnTools.add(mntmClearTerminal);

		mntmLoadSetup = new JMenuItem("Load Setup");

		mnTools.add(mntmLoadSetup);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmUserManual = new JMenuItem("User Manual");
		mnHelp.add(mntmUserManual);

		JMenuItem mntmContact = new JMenuItem("Contact");
		mnHelp.add(mntmContact);

		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);

		mntmCredits = new JMenuItem("Credits");

		mnAbout.add(mntmCredits);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel terminalPanel = new JPanel();
		terminalPanel.setBorder(new TitledBorder(null, "Terminal", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel transformationPanel = new JPanel();
		transformationPanel.setBorder(
				new TitledBorder(null, "Transformation", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(terminalPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(transformationPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(terminalPanel, GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(transformationPanel,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		transCmbBox = new JComboBox<Transformation>();
		transCmbBox.setModel(model);

		btnTransform = new JButton("Transform");

		btnAddOpe = new JButton("Include Operator");
		GroupLayout gl_transformationPanel = new GroupLayout(transformationPanel);
		gl_transformationPanel.setHorizontalGroup(gl_transformationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_transformationPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_transformationPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(transCmbBox, 0, 816, Short.MAX_VALUE)
								.addGroup(gl_transformationPanel.createSequentialGroup().addComponent(btnAddOpe)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnTransform)))
						.addContainerGap()));
		gl_transformationPanel.setVerticalGroup(gl_transformationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_transformationPanel.createSequentialGroup().addContainerGap()
						.addComponent(transCmbBox, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_transformationPanel.createParallelGroup(Alignment.BASELINE).addComponent(btnAddOpe)
								.addComponent(btnTransform))
						.addContainerGap()));
		transformationPanel.setLayout(gl_transformationPanel);

		JScrollPane historyScrollPane = new JScrollPane();
		historyScrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY));

		btnEnter = new JButton("Enter");

		btnClearActiveString = new JButton("Clear Active String");

		JScrollPane activeTxtPane = new JScrollPane();
		activeTxtPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GroupLayout gl_terminalPanel = new GroupLayout(terminalPanel);
		gl_terminalPanel
				.setHorizontalGroup(gl_terminalPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_terminalPanel.createSequentialGroup().addContainerGap()
								.addGroup(gl_terminalPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_terminalPanel.createSequentialGroup()
												.addComponent(activeTxtPane, GroupLayout.DEFAULT_SIZE, 816,
														Short.MAX_VALUE)
												.addContainerGap())
										.addGroup(Alignment.TRAILING,
												gl_terminalPanel.createSequentialGroup()
														.addComponent(historyScrollPane, GroupLayout.DEFAULT_SIZE, 816,
																Short.MAX_VALUE)
														.addContainerGap())
										.addGroup(Alignment.TRAILING, gl_terminalPanel.createSequentialGroup()
												.addComponent(btnClearActiveString)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnEnter)))));
		gl_terminalPanel
				.setVerticalGroup(
						gl_terminalPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_terminalPanel.createSequentialGroup().addContainerGap()
										.addComponent(historyScrollPane, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(activeTxtPane, GroupLayout.PREFERRED_SIZE, 51,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(gl_terminalPanel.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnEnter).addComponent(btnClearActiveString))
										.addContainerGap()));

		txtrActiveStrTxtArea = new JTextArea();

		txtrActiveStrTxtArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		activeTxtPane.setViewportView(txtrActiveStrTxtArea);

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(txtrActiveStrTxtArea, popupMenu);

		mntmCopy = new JMenuItem("Copy");

		popupMenu.add(mntmCopy);

		mntmPaste = new JMenuItem("Paste");

		popupMenu.add(mntmPaste);

		mntmSelectAll = new JMenuItem("Select All");

		popupMenu.add(mntmSelectAll);

		txtpnHistorytxtarea = new JTextPane();
		txtpnHistorytxtarea.setFont(new Font("Courier New", Font.PLAIN, 13));
		txtpnHistorytxtarea.setEditable(false);
		historyScrollPane.setViewportView(txtpnHistorytxtarea);
		terminalPanel.setLayout(gl_terminalPanel);
		contentPane.setLayout(gl_contentPane);

	}

	private void submit(AbstractNode workspace, boolean sys) throws CloneNotSupportedException, IOException {
		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());

		String manipulator;
		if (sys)
			manipulator = "Sys";
		else
			manipulator = "You";

		txtpnHistorytxtarea.setText(
				txtpnHistorytxtarea.getText() + "[" + timeStamp + "] " + manipulator + ": " + workspace + "\n");

		printCommand(workspace);
	}

	public void export() {
		try {
			String timeStamp = new SimpleDateFormat("dd-MM-yy,HH:mm:ss").format(new Date());
			PrintWriter writer = new PrintWriter("CAS_Terminal_[" + timeStamp + "].txt", "UTF-8");
			writer.println(txtpnHistorytxtarea.getText());
			writer.close();
			txtpnHistorytxtarea.setText(txtpnHistorytxtarea.getText() + "[" + timeStamp.split(",")[1]
					+ "] Sys: CAS_Terminal_[" + timeStamp + "].txt file exported sucessfully! \n");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void importTxt() {
		try {
			JFileChooser chooser = new JFileChooser();
			int returnVal = chooser.showOpenDialog(null); // replace null with
															// your swing
															// container
			File file = null;
			if (returnVal == JFileChooser.APPROVE_OPTION)
				file = chooser.getSelectedFile();

			txtpnHistorytxtarea.setText("");
			BufferedReader in = new BufferedReader(new FileReader(file));

			String line = in.readLine();
			while (line != null) {
				txtpnHistorytxtarea.setText(txtpnHistorytxtarea.getText() + line + "\n");
				line = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public void background() {
		Timer timer = new Timer();
		TimerTask myTask = new TimerTask() {
			@Override
			public void run() {
				tempHist = (Stack<AbstractNode>) history.clone();
			}
		};

		timer.schedule(myTask, 10000, 10000);
	}

	public void printCommand(AbstractNode workspace) throws IOException {
		String extra = "";
		if (NodeFunctions.isVar(workspace)) {
			switch (((VarNode) workspace).getKey()) {
			case "help":
				extra = "Computer Algebra System. Version 1.\n\n" + "Preset Commands: \n\n"
						+ "clear        Clears terminal history.\n" + "close        Disposes current window.\n"
						+ "help         Display help text in terminal window.\n"
						+ "import       Import terminal resources from local file system.\n"
						+ "manager      Initiates transformation manager wizard.\n"
						+ "rules        Prints set of rules of the selected transformation.\n"
						+ "save         Exports terminal to txt.\n"
						+ "setup        Set up preset differentiation and simplification transformations.\n"
						+ "transform    Transform current workspace using selected transformation.\n"
						+ "wizard       Initiate new transformation wizard.\n\n"
						+ "See also User Manual on the top menu or contact Dimitrios Dedoussis.\n";
				break;
			case "rules":
				if (transCmbBox.getItemCount() > 0) {
					for (Rule rule : ((Transformation) transCmbBox.getSelectedItem()).getRules()) {
						extra = extra + rule + "\n";
					}
				} else {
					showTransformationError();
				}
				break;
			case "clear":
				txtpnHistorytxtarea.setText("");
				break;
			case "close":
				dispose();
				break;
			case "save":
				export();
				break;
			case "import":
				importTxt();
				break;
			case "manager":
				transFrame = new Trans(1, model);
				JOptionPane.showMessageDialog(null, transFrame.getContentPane(), "Transformations",
						JOptionPane.PLAIN_MESSAGE);
				break;
			case "transform":
				try {
					if (transCmbBox.getItemCount() != 0) {
						Transformation selectTr = (Transformation) transCmbBox.getSelectedItem();
						Stack<AbstractNode> tempHist2 = (Stack<AbstractNode>) history.clone();
						tempHist2.pop();
						workspace = selectTr.transform(tempHist2.peek());

						history.push(workspace);
						String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
						txtpnHistorytxtarea.setText(
								txtpnHistorytxtarea.getText() + "[" + timeStamp + "] Sys: " + workspace + "\n");

					} else
						showTransformationError();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case "wizard":
				transFrame = new Trans(0, model);
				JOptionPane.showMessageDialog(null, transFrame.getContentPane(), "Transformations",
						JOptionPane.PLAIN_MESSAGE);
				break;
			case "setup": {
				setup();
				break;
			}
			default:
				break;
			}
		}
		if (!extra.matches("")) {
			String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
			txtpnHistorytxtarea.setText(txtpnHistorytxtarea.getText() + "[" + timeStamp + "] Sys: \n\n" + extra + "\n");
		}

	}

	public void setup() throws IOException {
		boolean created = false;
		for (int i = 0; i < model.getSize(); i++) {
			if (model.getElementAt(i).toString().matches("diff|simpl"))
				created = true;
		}

		if (!created) {
			try {

				File file = new File("transformations/.");
				for (String fileName : file.list()) {

					String fileRules = readFile("transformations/" + fileName);
					Transformation trans = new Transformation(NodeFunctions.textToArray(fileRules));

					((DefaultComboBoxModel<Transformation>) model).addElement(trans);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			Object frame = null;
			JOptionPane.showMessageDialog((Component) frame, "Preset transformations have already been created.",
					"Load Setup Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public String readFile(String fileName) throws IOException {
		Scanner scanner = new Scanner(new FileReader(fileName));
		String text = scanner.useDelimiter("\\A").next();
		scanner.close();
		return text;
	}

	public void showTransformationError() {
		Object frame = null;
		JOptionPane.showMessageDialog((Component) frame, "No transformation has been selected!", "Transformation Error",
				JOptionPane.ERROR_MESSAGE);
	}

	public void showWorkspaceError() {
		Object frame = null;
		JOptionPane.showMessageDialog((Component) frame, "Workspace is empty!", "Workspace Error",
				JOptionPane.ERROR_MESSAGE);
	}

}
