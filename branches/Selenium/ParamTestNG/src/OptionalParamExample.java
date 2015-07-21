import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParamExample {

	@Parameters("param one")
	@Test
	public void testOptionParamOne(@Optional("vikram") String paramOne) {

		System.out.println("Parameter passed from XML ::" + paramOne);
	}

	@Parameters("param two")
	@Test
	public void testOptionParamTwo(@Optional("two") String paramTwo) {

		System.out.println("Optional value passed ::" + paramTwo);
	}
}