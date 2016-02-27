/** 
 * A STOCK REPRESENTS ONE SECURITY ON A STOCK EXCHANGE IN OUR SIMULATION
 * @author kvarjoy
 */

import java.util.Random;

public class Stock 
{
	public String industry;
	public String symbol = "";
	public double price; 
	public int ipoQty;

	private Random r = new Random();
	
	private String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String[] industries = new String[]
			{"advertising", "aerospace", "airlines", "biotechnology", "broadcasting",
			 "chemicals", "computers", "constructions", "credit", "food", 
			 "gas", "insurance", "internet", "media", "metals", 
			 "oil", "pharmaceuticals", "realestate", "security", "shipping"
			};
	
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
			int index = r.nextInt(letters.length());
			char l = letters.charAt(index);
			symbol = symbol + l;
		}	
	}

	public void setIndustry() {
		int index = r.nextInt(industries.length);
		
		this.industry = industries[index];		
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

//public String getIndustry() {
//	return industry;
//}	
