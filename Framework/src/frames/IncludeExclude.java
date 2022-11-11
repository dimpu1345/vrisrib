package frames;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class IncludeExclude {
	@BeforeMethod
	public static void Test()
	{
		System.out.println("BEFORE");
	}
	
	@Test
	public static void eduloan()
	{
		System.out.println("For Education");
	}
	
	@Test
	public static void marriageloan()
	{
		System.out.println("For Marriage");
	}
	@Test
	public static void gold()
	{
		System.out.println("For Gold...");
	}
	
	@Test
	public static void carloan()
	{
		System.out.println("For cars...");
		
	}
	
	@BeforeClass
    public  void before()
	{
		System.out.println("I will Execute first");
	}
	
	@AfterClass
	public  void After()
	{
		System.out.println("I will Execute last");
	}
	
	@BeforeMethod
	public  void bm()
	{
		System.out.println("Before Every method");
	}
	@AfterMethod
	public  void am()
	{
		System.out.println("After every method");
	}
	@AfterTest
	public  void afttest()
	{
		System.out.println("After");		
	}
	
	@BeforeSuite
	public  void bfs()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public  void afs()
	{
		System.out.println("");
	}
	
	
	
	
	

}
