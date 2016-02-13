public class brainCenter 
{
	
	public static void main(String[] args) 		//main compilation unit, runs first
	{ 
		
		System.out.println("MAIN IS BEGINNING");
		
		Stock st = new Stock(); 
		
		System.out.println("stock named " + st.symbol + " is priced at $" + st.price);
		System.out.println("the industry of this stock is " + st.industry);

		String ind = "telecom"; 
		
		if(st.industry.equalsIgnoreCase(ind))
		{
			System.out.println("the industry of this stock is telecom");
		}
		else
		{
			System.out.println("the industry of this stock is not telecom");
			System.out.println("the industry of this stock is " + st.industry);
		}	
		
		int limit = 1000;
		if(st.ipoQty < limit)
		{
			System.out.println("IPO QTY EXCEEDS LIMIT OF " + limit);
		}
		else if(st.ipoQty <= limit)
		{
			System.out.println("IPO QTY FALLS WITHIN LIMIT OF " + limit);
		}
		else if(st.ipoQty == limit)
		{
			System.out.println("YOUR IPO QTY IS == 50000000");
		}
	}
}