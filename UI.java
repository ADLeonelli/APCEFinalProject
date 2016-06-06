package APCSFinalProject;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

import javax.swing.JMenuBar;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;

public class UI extends JFrame {
	public JPanel pan;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 444, 20);
		contentPane.add(toolBar);
		
		JButton btnHome = new JButton("Home");
		toolBar.add(btnHome);
		
		JButton btnAddRecipe = new JButton("Add Recipe");
		toolBar.add(btnAddRecipe);
		
		JButton btnMakeMenu = new JButton("Make Menu");
		toolBar.add(btnMakeMenu);
		
		JButton btnRecipeBook = new JButton("Recipe Book");
		toolBar.add(btnRecipeBook);
		
		//JPanel panel = new JPanel();
		//panel.setBounds(6, 21, 438, 251);
		//contentPane.add(panel);
		HomeP homePanel = new HomeP();
		homePanel.setBounds(6, 21, 438, 300);
		contentPane.add(homePanel);
		pan = homePanel;
		
		btnHome.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent event) {
				  contentPane.remove(pan);
				  HomeP homePanel = new HomeP();
				  homePanel.setBounds(6, 21, 438, 300);
				  contentPane.add(homePanel);
				  contentPane.repaint();
				  pan = homePanel;
			  }

			});
		
		
		btnAddRecipe.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent event) {
				  contentPane.remove(pan);
				  AddR addPanel = new AddR();
				  addPanel.setBounds(6, 21, 438, 300);
				  contentPane.add(addPanel);
				  contentPane.repaint();
				  pan = addPanel;
			  }

			});
		
		btnMakeMenu.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent event) {
				  contentPane.remove(pan);
				  MenuP MPanel = new MenuP();
				  MPanel.setBounds(6, 21, 438, 300);
				  contentPane.add(MPanel);
				  contentPane.repaint();
				  pan = MPanel;
			  }

			});
		
		btnRecipeBook.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent event) {
				  contentPane.remove(pan);
				  RecipeBookP RPanel;
				try {
					RPanel = new RecipeBookP();
					RPanel.setBounds(6, 21, 438, 300);
					  contentPane.add(RPanel);
					  contentPane.repaint();
					  pan = RPanel;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }

			});
		
		//AddR addPanel = new AddR();
		//addPanel.setBounds(6, 21, 438, 280);
		//contentPane.add(addPanel);
	}
}


