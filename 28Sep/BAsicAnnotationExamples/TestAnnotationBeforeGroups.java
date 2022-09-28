package BAsicAnnotationExamples;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestAnnotationBeforeGroups {
	MessageUtil messageUtil = new MessageUtil("Test method");
    @BeforeGroups({"testOne", "testTwo"})
    public void beforeGroups(){
      System.out.println("beforeGroups method executed before testOne group");
    }
    @Test(groups={"testOne"})
    public void testMethod(){
      Assert.assertEquals("Test method", messageUtil.printMessage());
    }
    
    @Test(groups= {"testTwo"})
    public void testMethod1() {
    	System.out.println("TestMethod2");
    }
}
