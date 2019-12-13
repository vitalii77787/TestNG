package Domain;

public class MessageUtil {
    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message) {
        this.message = message;
    }

    // add "Hi!" to the message
    public String salutationMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }

    // prints the message
    public String printMessage() {
        System.out.println(message);
        return message;
    }

    // add "www." to the message
    public String exitMessage() {
        message = "www." + message;
        System.out.println(message);
        return message;
    }
}
