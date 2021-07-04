package InterviewBased;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Longest_EvenWord_test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals("No even length word present",Longest_EvenWord.findMaxLenEven("Sujit Kumar"));
	}
	
	@Test
	public void test1() {
		
		assertEquals("Hi",Longest_EvenWord.findMaxLenEven("Hi I am Sujit"));
	}
	
	@Test
	public void test11() {
		
		assertEquals("Suji",Longest_EvenWord.findMaxLenEven("Hi Suji"));
	}
	
	@Test
	public void test111() {
		
		assertEquals("Hi",Longest_EvenWord.findMaxLenEven("Hi Sujit"));
	}
	
	@Test
	public void test1111() {
		
		assertEquals("Suji",Longest_EvenWord.findMaxLenEven("Suji Hi"));
	}

}
