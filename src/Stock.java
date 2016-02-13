/** 
 * A STOCK REPRESENTS ONE SECURITY ON A STOCK EXCHANGE IN OUR SIMULATION
 * @author kvarjoy
 * 
 */
public class Stock 
{
	public String symbol; //a public variable is visible outside the class by other classes
	public double price; 
	public int ipoQty; // initial number of stock on sale
	public String industry;

						//constructor, first thing that happens when an instance of this object is created
	public Stock() 		// POPULATE THIS STOCK WITH SOME INFORMATION
	{
		System.out.println("I just called the constructor...");
		industry = "defense"; //word, string of characters
		price = 55.0; //price is a double, a number with decimals
		ipoQty = 50000000; //an integer, no decimals
		symbol = "GEL"; //for our sim, we'll assign randomly determined symbol names
	}
}
