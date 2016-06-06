package APCSFinalProject;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class MenuP extends JPanel {
	private JTextField txtWeeklyMenu;

	/**
	 * Create the panel.
	 */
	public MenuP() {
		setLayout(null);
		
		txtWeeklyMenu = new JTextField();
		txtWeeklyMenu.setText("WEEKLY MENU");
		txtWeeklyMenu.setBounds(166, 6, 106, 28);
		add(txtWeeklyMenu);
		txtWeeklyMenu.setColumns(10);
		
		JTextArea txtrMenuGoesHere = new JTextArea();
		txtrMenuGoesHere.setText("menu goes here");
		txtrMenuGoesHere.setBounds(18, 52, 410, 231);
		add(txtrMenuGoesHere);

	}
}
