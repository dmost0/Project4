import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DailySalesTest {
	DailySales day1, day2, day3;
	
	//Student
	DailySales day1Student, day2Student, day3Student;

	@Before
	public void setUp() throws Exception {
		day1 = new DailySales(56, 49, 29, 30);
		day2 = new DailySales(31, 40, 29, 30);
		day3 = new DailySales(113, 184, 82, 209);
		//STUDENT - create three DailySales objects different
		//than those above.  Use your DailySales objects
		//in the STUDENT tests.
		day1Student = new DailySales(156, 0, 75, 23);
		day2Student = new DailySales(20, 10, 5, 0);
		day3Student = new DailySales(0, 0, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
		day1 = day2 = day3 = null;
		//STUDENT - set your DailyObjects to null
		day1Student = day2Student = day3Student = null;
	}

	@Test
	public void testGetSalesLarge() {
		assertEquals(672.00, day1.getSalesLarge(), .001);
		assertEquals(372.00, day2.getSalesLarge(), .001);
		assertEquals(1356.00, day3.getSalesLarge(), .001);
	}
	
	@Test
	public void testGetSalesLargeSTUDENT() {
		assertEquals(1872.00, day1Student.getSalesLarge(), .001);
		assertEquals(240.00, day2Student.getSalesLarge(), .001);
		assertEquals(0.00, day3Student.getSalesLarge(), .001);

	}

	@Test
	public void testGetSalesMedium() {
		assertEquals(441.00, day1.getSalesMedium(), .001);
		assertEquals(360.00, day2.getSalesMedium(), .001);
		assertEquals(1656.00, day3.getSalesMedium(), .001);
	}

	@Test
	public void testGetSalesSmall() {
		assertEquals(174.00, day1.getSalesSmall(), .001);
		assertEquals(174.00, day2.getSalesSmall(), .001);
		assertEquals(492.00, day3.getSalesSmall(), .001);
	}

	@Test
	public void testGetSalesStick() {
		assertEquals(90.00, day1.getSalesStick(), .001);
		assertEquals(90.00, day2.getSalesStick(), .001);
		assertEquals(627.00, day3.getSalesStick(), .001);
	}

	@Test
	public void testGetTotalTax() {
		assertEquals(82.62, day1.getTotalTax(), .01);
		assertEquals(59.76, day2.getTotalTax(), .01);
		assertEquals(247.86, day3.getTotalTax(), .01);
	}

	@Test
	public void testGetTotalTaxSTUDENT() {
		assertEquals(143.46, day1Student.getTotalTax(), .01);
		assertEquals(21.6, day2Student.getTotalTax(), .01);
		assertEquals(0, day3Student.getTotalTax(), .01);
	}
	
	@Test
	public void testGetTotalSales() {
		assertEquals(1377.00, day1.getTotalSales(), .01);
		assertEquals(996.00, day2.getTotalSales(), .01);
		assertEquals(4131.00, day3.getTotalSales(), .01);
	}

	@Test
	public void testGetNetSales() {
		assertEquals(1294.38, day1.getNetSales(), .01);
		assertEquals(936.24, day2.getNetSales(), .01);
		assertEquals(3883.14, day3.getNetSales(), .01);
	}

	@Test
	public void testGetNetSalesSTUDENT() {
		assertEquals(2247.54, day1Student.getNetSales(), .01);
		assertEquals(338.4, day2Student.getNetSales(), .01);
		assertEquals(0, day3Student.getNetSales(), .01);
	}
	
	@Test
	public void testGetProfit() {
		assertEquals(294.38, day1.getProfit(), .01);
		assertEquals(-63.76, day2.getProfit(), .01);
		assertEquals(2883.14, day3.getProfit(), .01);
	}

	@Test
	public void testGetProfitSTUDENT() {
		assertEquals(1247.54, day1Student.getProfit(), .01);
		assertEquals(-661.6, day2Student.getProfit(), .01);
		assertEquals(-1000, day3Student.getProfit(), .01);
	}

	@Test
	public void testIsProfit() {
		assertTrue(day1.isProfit());
		assertFalse(day2.isProfit());
		assertTrue(day3.isProfit());
	}

}
