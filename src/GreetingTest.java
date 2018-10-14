import org.junit.Assert;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingTest {

    Greeting greeting;

    @Test
    public void simpleGreeting() throws Exception {
        greeting = new Greeting();
        assertEquals(greeting.greet("Bob"),"Hello, Bob");


    }


}
