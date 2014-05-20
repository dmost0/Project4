
/**
 * DailySales class represents the accounting of one day in Eve's Pizza
 *
 */
public class DailySales {
	// Fields
	private int l, m, s, b;  //L = large, m = medium, s = small, b = breadsticks
	// Initialize constants
	final double SALESTAX = .06;
	final double LPRICE = 12.0; 
	final double MPRICE = 9.0; 
	final double SPRICE = 6.0;
	final double BPRICE= 3.0;
	
	
	/**
	 * Constructor for DailySales.
	 * @param l amount of large sold
	 * @param m amount of medium sold
	 * @param s amount of small sold
	 * @param b amount of bread sticks sold
	 */
	public DailySales(int l, int m, int s, int b)
	{
		// Set fields with parameter values
		this.l = l;
		this.m = m;
		this.s = s;
		this.b = b;
	}

	/**
	 * Calculates net sales for the day which is total sales minus total tax
	 * @return net sales for the day
	 */
	public double getNetSales()
	{
		return getTotalSales() - getTotalTax();
	}
	
	/**
	 * Calculates the profit for the day which is net sales minus daily operating cost
	 * @return profit, loss (negative), or neither (0)
	 */
	public double getProfit()
	{
		return getNetSales() - 1000;
	}
	
	/**
	 * Gets the amount of large pizzas sold
	 * @return Large pizzas sold
	 */
	public double getSalesLarge()
	{
		return l * LPRICE;
	}
	
	/**
	 * Gets the amount of medium pizzas sold
	 * @return medium pizzas sold
	 */
	public double getSalesMedium()
	{
		return m * MPRICE;
	}
	
	/**
	 * Gets the amount of small pizzas sold
	 * @return small pizzas sold
	 */
	public double getSalesSmall()
	{
		return s * SPRICE;
	}
	
	/**
	 * Gets the amount of bread sticks sold
	 * @return bread sticks sold
	 */
	public double getSalesStick()
	{
		return b * BPRICE;
	}
	
	/**
	 * Gets the total sales amount
	 * @return total sales
	 */
	public double getTotalSales()
	{
		return getSalesLarge() + getSalesMedium() + getSalesSmall() + getSalesStick();
	}
	
	/**
	 * Gets the total tax amount
	 * @return total tax
	 */
	public double getTotalTax()
	{
		return getTotalSales() * SALESTAX;
	}
	
	/**
	 * Returns whether the day held a profit or a loss.
	 * @return Profit or loss (greater than or equal to 0 is considered a profit).
	 */
	public boolean isProfit()
	{
		boolean isProfit = getProfit() >= 0 ? true: false;
		return isProfit;
	}
	
	/**
	 * Returns a string implementation of this class
	 * @return String implementation of this class
	 */
	public String toString()
	{
		return "The amount of large pizzas sold is " + getSalesLarge() + " The amount of medium sold is " + getSalesMedium() + " The amount of small sold is " + getSalesSmall() + " The amount of breadsticks sold is " + getSalesStick();
	}
	
}
