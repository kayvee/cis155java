/** 
 * A STOCK REPRESENTS ONE SECURITY ON A STOCK EXCHANGE IN OUR SIMULATION
 * @author kvarjoy
 * 
 */

import java.util.Random;

public class Stock 
{
	public String symbol; //a public variable is visible outside the class by other classes
	public double price; 
	public int ipoQty; // initial number of stock on sale
	public String industry;

						//constructor, first thing that happens when an instance of this object is created
	public Stock() 		// POPULATE THIS STOCK WITH SOME INFORMATION
	{
		industry = "defense"; //word, string of characters
		symbol = "GEL"; //for our sim, we'll assign randomly determined symbol names
		
		//two different ways of initializing class variables
		setStockPrice();
		ipoQty = setIpoQty();
	}
	
	public void printPriceAndIpoqty()
	{
		System.out.println("price is now " + price);
		System.out.println();
		System.out.println("ipo qty is now " + ipoQty);
	}
	
	private void setStockPrice()
	{
		Random p = new Random();
		price = p.nextDouble() * 100;
		//System.out.println("stock price is " + price);
	}

	private int setIpoQty()
	{
		int returnValue = 0;
		
		Random i = new Random();
		returnValue = i.nextInt(15000000); //ipo is a larger # of stocks initially sold by bank
		//System.out.println("IPO quantity is " + returnValue);
		
		return returnValue;
	}	
}
