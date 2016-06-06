package APCSFinalProject;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class AddR extends JPanel {
	private JTextField txtAddRecipe;
	private JTextField txtName;
	private JTextField txtRecipe;
	private JTextField textField;
	private JTextField txtDishType;
	private Choice choice;
	private JTextArea textArea;
	public MenuMaker mm = new MenuMaker();

	/**
	 * Create the panel.
	 */
	
	public AddR() {
		setLayout(null);
		
		txtAddRecipe = new JTextField();
		txtAddRecipe.setEditable(false);
		txtAddRecipe.setText("ADD RECIPE");
		txtAddRecipe.setBounds(155, 6, 95, 28);
		add(txtAddRecipe);
		txtAddRecipe.setColumns(10);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setText("NAME:");
		txtName.setBounds(6, 40, 87, 28);
		add(txtName);
		txtName.setColumns(10);
		
		txtRecipe = new JTextField();
		txtRecipe.setEditable(false);
		txtRecipe.setText("RECIPE:");
		txtRecipe.setBounds(6, 80, 87, 28);
		add(txtRecipe);
		txtRecipe.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(327, 265, 117, 29);
		add(btnAdd);
		
		textArea = new JTextArea();
		textArea.setBounds(115, 86, 329, 127);
		add(textArea);
		
		textField = new JTextField();
		textField.setBounds(105, 40, 339, 28);
		add(textField);
		textField.setColumns(10);
		
		txtDishType = new JTextField();
		txtDishType.setEditable(false);
		txtDishType.setText("DISH TYPE:");
		txtDishType.setBounds(6, 225, 87, 28);
		add(txtDishType);
		txtDishType.setColumns(10);
		
		choice = new Choice();
		choice.setBounds(113, 226, 331, 27);
		choice.add("Pasta");
		choice.add("Red Meat");
		choice.add("White Meat");
		choice.add("Salad");
		choice.add("Soup");
		choice.add("Bread");
		add(choice);
		
		btnAdd.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent event) {
				mm.addRecipe(textField.getText(), textArea.getText(), choice.toString());
				textArea.setText("");
				textField.setText("");
				try {
					mm.save();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			  }

			});

	}
}
