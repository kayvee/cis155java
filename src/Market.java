/** 
 * A MARKET
 * @author kvarjoy
 */

/** 
 * Still to do:
 */

import java.util.ArrayList;

public class Market 
{
	
	public ArrayList<Stock> market = new ArrayList<Stock>();

	public Market(int sizeOfMarket) 
	{
		for (int i = 0; i <= sizeOfMarket; i++)
		{
			Stock l = new Stock();
			market.add(l);
		}
	}
	
	public void printMarket()
	{
		for (Stock st : market)
		{
			System.out.println("stock symbol: " + st.symbol + " @ price $" + st.price);
		}
	}

}
