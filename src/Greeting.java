public class Greeting {
    public String greet(String name) {
        String greeting = "Hello, ";

        if (name == "") {
            greeting = greeting +"my friend.";
        } else {
            greeting = greeting + name + ".";
        }

        return greeting;
    }
}
