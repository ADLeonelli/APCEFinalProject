package APCSFinalProject;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecipeBookP extends JPanel {
	private JTextField txtRecipeBook;

	/**
	 * Create the panel.
	 * @throws FileNotFoundException 
	 */
	public RecipeBookP() throws FileNotFoundException {
		setLayout(null);
		
		txtRecipeBook = new JTextField();
		txtRecipeBook.setEditable(false);
		txtRecipeBook.setText("Recipe Book");
		txtRecipeBook.setBounds(167, 6, 94, 28);
		add(txtRecipeBook);
		txtRecipeBook.setColumns(10);
		Scanner scan = new Scanner(new File("src/APCSFinalProject/RecipeBook"));
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(26, 46, 404, 239);
		String text = new String();
		while (scan.hasNext()){
			text += scan.nextLine() + "\n";
		}
		textArea.setText(text);
		add(textArea);

	}

}
