/** 
 * A STOCK REPRESENTS ONE SECURITY ON A STOCK EXCHANGE IN OUR SIMULATION
 * @author kvarjoy
 */

/**
 * Still to do: add hash/array for industry and symbol randomization
 * 				-need 20 different industries
 * 				-26 characters for symbol
 */

import java.util.Random;

public class Stock 
{
	private String industry;
	public String symbol = "";
	public double price; 
	public int ipoQty;

	private Random r = new Random();
	
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
		
		int characterResult = r.nextInt() * 1000000;
		
		if (characterResult <= 100000000)
		{
			result = "A";
		}
		else
		{
			result = "B";
		}
		return result;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry() {
		int l = r.nextInt(100); // use value of l to determine which industry the stock belongs to
		
		if (l < 10)
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
		price = r.nextDouble() * 100;
	}

	private void setIpoQty()
	{
		ipoQty = r.nextInt(15000000);
	}	
	
	public void printInfo()
	{
		System.out.println("price is now " + price);
		System.out.println("ipo qty is now " + ipoQty);
		System.out.println("industry is now " + industry);
		System.out.println("symbol is now " + symbol);
	}
	
}
