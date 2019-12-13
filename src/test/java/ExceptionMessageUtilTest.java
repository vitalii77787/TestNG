import Domain.ExceptionMessageUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionMessageUtilTest {
    String message = "Manisha";
    ExceptionMessageUtil messageUtil = new ExceptionMessageUtil(message);

    @Test(expectedExceptions = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil.salutationMessage());
    }
}
