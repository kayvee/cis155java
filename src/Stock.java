/** 
 * A STOCK REPRESENTS ONE SECURITY ON A STOCK EXCHANGE IN OUR SIMULATION
 * @author kvarjoy
 */

import java.util.Random;

public class Stock 
{
	private String industry;
	public String symbol = "";
	public double price; 
	public int ipoQty;

	public Stock() 		
	{
		setIndustry();
		setStockPrice();
		setIpoQty();
		setSymbol();
	}
	
	private void setSymbol() 
	{	
		for (int i = 0; i < 4; i++) 
		{
			String l = getRandomLetter();
			symbol = symbol + l;
		}	
	}

	private String getRandomLetter() {
		String result;
		Random r = new Random();
		
		int characterResult = r.nextInt() * 1000000;
		
		if (characterResult <= 100000000)
		{
			result = "A";
		}
		else
		{
			result = "B"; //26 different return values needed //DO THIS**
		}
		return result;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry() {
		Random ind = new Random();
		int l = ind.nextInt(100); // use value of l to determine which industry the stock belongs to
		
		if (l < 10)						//need 20 different industries //DO THIS**
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
	
	public void printInfo()
	{
		System.out.println("price is now " + price);
		System.out.println("ipo qty is now " + ipoQty);
		System.out.println("industry is now " + industry);
		System.out.println("symbol is now " + symbol);
	}
	
}
