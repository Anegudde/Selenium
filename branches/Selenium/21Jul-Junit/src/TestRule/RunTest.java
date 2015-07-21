package TestRule;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.junit.*;
import org.testng.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;
public class RunTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeMethod
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterMethod
	public void tearDown() throws Exception {
	}
	
	@Rule
	public TestName name = new TestName();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("Hello World"+ " "+ name.getMethodName());
	}
	@Rule
	public Timeout timeout = new Timeout(20);

	@Test
	public void slowTestAskingForTrouble() throws InterruptedException {
	    Thread.sleep(1000 * 60);
	}

	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void exceptionExpected(){
	    throw new IllegalArgumentException("catch me if you can");
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	 
	@Test
	public void exceptionWithMessageExpected(){
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("catch me if you can");
	    throw new IllegalArgumentException("catch me if you can");
	}

	
	@Test
	public void slowTestWithExpectedException()throws InterruptedException {
	    thrown.expect(Exception.class);
	    thrown.expectMessage(
	        "test timed out after 20 milliseconds");
	    Thread.sleep(1000 * 60);
	}


}
