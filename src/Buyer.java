import java.util.Random;


public class Buyer {
	
	public double budget;
	public int name;
	Portfolio p;
	
	public Buyer()
	{
		establishBudget();
		establishBuyerName();
		buildPortfolio();
		
		proveSet();
	}

	private void buildPortfolio() {

	}

	private void proveSet() {
		System.out.println("buyer " + name + " has a budget of $" + budget);
	}


	private void establishBuyerName() {
		Random r = new Random();
		name = r.nextInt(); //long and semi-unique
	}

	private void establishBudget() {
		Random r = new Random();
		budget = r.nextInt() / 100;
	}
	
}
