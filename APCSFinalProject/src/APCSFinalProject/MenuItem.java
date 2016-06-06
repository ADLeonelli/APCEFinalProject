package APCSFinalProject;

public class MenuItem {
	public String name;
	public String Recipe;
	public String Type;
	
	MenuItem(String n, String r, String t){
		setName(n);
		setRecipe(r);
		setType(t);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipe() {
		return Recipe;
	}

	public void setRecipe(String recipe) {
		Recipe = recipe;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return name + "\n" + Recipe + "\n" + Type + "\n\n";
	}
	
	
	
	
}
