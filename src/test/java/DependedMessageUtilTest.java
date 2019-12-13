import Domain.DependedMessageUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependedMessageUtilTest {

    String message = "Manisha";
    DependedMessageUtil messageUtil = new DependedMessageUtil(this.message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "Manisha";
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(dependsOnMethods = { "initEnvironmentTest" })
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test
    public void initEnvironmentTest() {
        System.out.println("This is initEnvironmentTest");
    }
}
