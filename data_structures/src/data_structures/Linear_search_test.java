/**
 * 
 */
package data_structures;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author lnt
 *
 */
public class Linear_search_test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Before ");
	}

	@Test
	public void test() {
		Portfolio portfolio = new Portfolio();
		List<Stock> stocks = new ArrayList<Stock>();
	      Stock googleStock = new Stock();
	      Stock microsoftStock = new Stock();

	      stocks.add(googleStock);
	      stocks.add(microsoftStock);		

	      //Create the mock object of stock service
	      StockService stockServiceMock = mock(StockService.class);

		
		
		
		
		int Arr[]= {1,2};
		Linear_Search ls=new Linear_Search(Arr,2,2);
		assertEquals(2,ls.Search());  
		System.out.println("TEST");
        //assertEquals(-1,ls.Search());  
		//fail("Not yet implemented");
	}
	
	@Test
	public void test1() {
		int Arr[]= {1,2};
		int Arr1[]= {1,2};
		Linear_Search ls=new Linear_Search(Arr,2,2);
		Linear_Search s=new Linear_Search(Arr1,2,3);
		assertEquals(2,ls.Search());  
		assertEquals(-1,s.Search());  
		System.out.println("TEST1");
        //assertEquals(-1,ls.Search());  
		//fail("Not yet implemented");
	}
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}



	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}



}
