package GitHubPushAndImport;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MixedClassTest {

@Test
	public void Failit () {
		Assert.fail();
	}
	
	
	public void Passit() {
		System.out.println("PASS THIS");
	}
}
