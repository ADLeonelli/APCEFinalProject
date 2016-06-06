package APCSFinalProject;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JTextArea;

public class HomeP extends JPanel {
	private JTextField txtMenuMaker;
	private JTextField txtByAlexandreLeonelli;

	/**
	 * Create the panel.
	 */
	public HomeP() {
		setLayout(null);
		
		txtMenuMaker = new JTextField();
		txtMenuMaker.setEditable(false);
		txtMenuMaker.setText("MENU MAKER");
		txtMenuMaker.setBounds(168, 6, 103, 28);
		add(txtMenuMaker);
		txtMenuMaker.setColumns(10);
		
		txtByAlexandreLeonelli = new JTextField();
		txtByAlexandreLeonelli.setEditable(false);
		txtByAlexandreLeonelli.setText("By Alexandre Leonelli");
		txtByAlexandreLeonelli.setBounds(289, 266, 155, 28);
		add(txtByAlexandreLeonelli);
		txtByAlexandreLeonelli.setColumns(10);
		
		JTextArea txtrInstructionsGoHere = new JTextArea();
		txtrInstructionsGoHere.setEditable(false);
		txtrInstructionsGoHere.setText("Instructions Go here");
		txtrInstructionsGoHere.setBounds(37, 46, 378, 208);
		add(txtrInstructionsGoHere);

	}
}