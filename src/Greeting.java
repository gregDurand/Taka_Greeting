public class Greeting {
    public String greet(String name) {
        String greeting;

        if (name == null) {
            greeting = "Hello, my friend";
        } else {
            greeting = "Hello, " + name;
        }

        return greeting;
    }
}
