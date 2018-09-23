package setup;

import org.testng.Assert;

public class Assertions {

	public static void assertTrue(boolean assertion) {
		try {
			Assert.assertTrue(assertion);
			System.out.println("Test Passed");
		} catch (Exception e) {
			System.out.println("Test failed");
		}
	}
	
	public static void assertFalse(boolean assertion) {
		try {
			Assert.assertFalse(assertion);
			System.out.println("Test Passed");
		} catch (Exception e) {
			System.out.println("Test failed");
		}
	}
	
	public static void assertEquals(String expected, String actual) {
		try {
			Assert.assertEquals(expected, actual);
			System.out.println("Test Passed");
		} catch (Exception e) {
			System.out.println("Test failed");
		}
	}
	
	public static void assertNotEquals(String expected, String actual) {
		try {
			Assert.assertNotEquals(expected, actual);
			System.out.println("Test Passed");
		} catch (Exception e) {
			System.out.println("Test failed");
		}
	}
}
