import java.util.Random;

public class brainCenter 
{
	
	public static void main(String[] args) 		//main compilation unit, runs first
	{ 
		System.out.println("MAIN IS BEGINNING");
		
		Random r = new Random();
		System.out.println("random number is " + r.nextDouble());
		
		Stock l = new Stock();
		System.out.println("stock price is " + l.price);
		System.out.println("IPO quantity is " + l.ipoQty);

		
		int limit = 50000000;
		int randomOutput = r.nextInt();
		if(randomOutput > limit)
		{
			System.out.println("random exceeds " + limit);
		}
		else
		{
			System.out.println("random is under the limit, " + limit);
		}
		
//		Stock st = new Stock(); 
//		String ind = "telecom"; 
//		
//		if(st.industry.equalsIgnoreCase(ind))
//		{
//			System.out.println("the industry of this stock is telecom");
//		}
//		else
//		{
//			System.out.println("the industry of this stock is not telecom");
//			System.out.println("the industry of this stock is " + st.industry);
//		}	
//		
//		int limit = 1000;
//		if(st.ipoQty < limit)
//		{
//			System.out.println("IPO QTY EXCEEDS LIMIT OF " + limit);
//		}
//		else if(st.ipoQty <= limit)
//		{
//			System.out.println("IPO QTY FALLS WITHIN LIMIT OF " + limit);
//		}
//		else if(st.ipoQty == limit)
//		{
//			System.out.println("YOUR IPO QTY IS == 50000000");
//		}
	}
}