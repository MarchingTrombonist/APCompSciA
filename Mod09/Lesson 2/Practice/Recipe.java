public class Recipe {

	public Recipe(String theName) {
		name = theName;
	}

	public void setServings(Circle xx) {

	}

	public double getRetailCost() {

		int x = 13;
		double tempCost = pricePerCalorie(x) * calories * cost;
		return tempCost;

	}

	private double pricePerCalorie(int x) {

		return 15.21;
	}

	public int calories;
	public int carbs;
	public int fat;
	private double cost;
	public String name;
}