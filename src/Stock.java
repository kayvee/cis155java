/** 
 * A STOCK REPRESENTS ONE SECURITY ON A STOCK EXCHANGE IN OUR SIMULATION
 * @author kvarjoy
 */

import java.util.Random;

public class Stock 
{
	private String industry;
	public String symbol; //a public variable is visible outside the class by other classes
	public double price; 
	public int ipoQty; // initial number of stock on sale

	public Stock() 		
	{
		setIndustry();
		setStockPrice();
		setIpoQty();
		
		symbol = setSymbol();
	}
	
	private String setSymbol() 
	{
		String returnValue = null;
		
		String firstLetter = getRandomLetter();
		
		for (int = 0; i <= 4; i++) 
		{
			
		}
		
		return returnValue;
	}

	private String getRandomLetter() {
		
		String result = null;
		Random r = new Random();
		
		int characterResult = r.nextInt() / 1000000;
		
		if (characterResult <= 10000000)
		{
			result = "A";
		}
		else
		{
			result = "B"; //26 different return values needed
		}
		return result;
	}

	public void printInfo()
	{
		System.out.println("price is now " + price);
		System.out.println("ipo qty is now " + ipoQty);
		System.out.println("industry is now " + industry);
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry() {
		Random ind = new Random();
		int l = ind.nextInt(100); // use value of l to determine which industry the stock belongs to
		
		if (l < 10)						//need 20 different industries
		{
			this.industry = "fishing";
		}
		else if (l < 20 && l > 10)
		{
			this.industry = "telecom";
		}
		else
		{
			this.industry = "education";
		}
	}

	private void setStockPrice()
	{
		Random p = new Random();
		price = p.nextDouble() * 100;
	}

	private void setIpoQty()
	{
		Random i = new Random();
		ipoQty = i.nextInt(15000000);
	}	
	
}
