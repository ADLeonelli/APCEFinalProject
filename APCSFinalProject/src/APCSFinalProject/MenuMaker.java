package APCSFinalProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MenuMaker {
	ArrayList<MenuItem> recipes;
	
	MenuMaker(){
		recipes = new ArrayList<MenuItem>();
	}
	
	public void addRecipe(String n, String r, String t){
		recipes.add(new MenuItem(n, r, t));
		System.out.println(recipes.toString());
	}
	
	public MenuItem getRecipe(int i){
		return recipes.get(i);
	}
	
	public void save() throws FileNotFoundException {
	    PrintWriter pw = new PrintWriter(new FileOutputStream("src/APCSFinalProject/RecipeBook"));
	        pw.println(recipes.toString());
	    pw.close();
	}
	
}
