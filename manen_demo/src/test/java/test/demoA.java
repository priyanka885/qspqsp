package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoA {
@Test
 public void test()
 {
	Reporter.log("hi", true);
	 //modification
	 Reporter.log("bye",true);
 }
}
