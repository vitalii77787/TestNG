import Domain.MessageUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageUtilTest {
    String message = ".com";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(groups = {"functest", "checkintest", "checkintest"})

    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "tutorialspoint" + ".com";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test(groups = { "functest" })

    public void testingExitMessage() {
        System.out.println("Inside testExitMessage()");
        message = "www." + "tutorialspoint"+".com";
        Assert.assertEquals(message, messageUtil.exitMessage());
    }
}
