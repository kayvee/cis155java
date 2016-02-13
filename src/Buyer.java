/** 
 * A BUYER
 * @author kvarjoy
 */

/** 
 * Still to do:
 */

import java.util.Random;

public class Buyer 
{
	
	public double budget;
	public int numTransactions;
	public double apt; // $ budgeted per transaction of stock
	public int name;
	Portfolio p; //collection of groups of stock we bought, transactions
	
	Random r = new Random();
	
	public Buyer()
	{
		establishBudget();
		establishBuyerName();
		
		establishNumTransactions();
		establishAPT();
		
		proveEstablishment();
	}

	/**
	 * apt expresses the amount we can spend per transaction, given whatever price is
	 * per stock, which will differ, per transaction
	 */
	private void establishAPT() 
	{
		apt = budget / numTransactions;
	}

	private void establishNumTransactions() 
	{
		numTransactions = r.nextInt(25); //limit of 25 transactions
	}

	private void establishBuyerName() 
	{
		name = r.nextInt(); //long and semi-unique
	}

	private void establishBudget() 
	{
		budget = r.nextInt() / 100;
		if (budget < 0)
		{
			budget = budget * -1;
		}
	}

	/**
	 * 1. take the budget, get numTransactions, determine apt DONE IN INSTANCE VARIABLES
	 * 2. get the market, randomly choose a stock to buy DONE IN FUNCTION ALREADY
	 * 3. get the price of the chosen stock, then divide apt by the stock's price
	 * 4. step 3 provides a volume (number) of stock to buy, numStock
	 * 5. make a transaction, wherein you buy the apt, buy numStock in step 4
	 * 6. push the transaction into the Buyer's portfolio
	 */
	public void buildRandomPortfolio(Market m) 
	{
		int ind = r.nextInt(6000);
		Stock l = m.market.get(ind);
		
		//prepare to make transaction at this point
		
		//define variables necessary to make a transaction / purchase of stocks
		
		//after transaction made Transaction t = new Transaction, set its variables
		
		//add transaction onto the Portfolio p belong to this buyer
		
		// project creates a large realistic market of stocks,
		//then it creates 1 buyer who fills up his/her portfolio with a random # of transactions
		//END
	}	
	
	private void proveEstablishment() 
	{
		System.out.println("buyer " + name + " has a budget of $" + budget + " with " + numTransactions + " transactions");
		System.out.println("allocated budget per transaction is " + apt);
	}	
	
}
