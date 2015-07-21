import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestGrid {
	
	@Parameters("Option")
	@Test
	public void check(String ValuefromXML)
	{
		System.out.println("success"+ ValuefromXML);
	}

}
