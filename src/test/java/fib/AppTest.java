package fib;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void TestParameters(){
        App.main(new String[]{"1", "2"});
        assertEquals( "ERROR: Please enter the correct amount of paramters!\n",outContent.toString());
    }

    @Test
    public void TestInputs(){

        App.main(new String[]{"1", "2", "temp.txt"});
        assertEquals("ERROR: Please only enter digits!\n", errContent.toString());
    }

    @Test
    public void ConfirmApp(){
        App.main(new String[]{"1", "1", "5"});
        assertEquals("1 1 2 3 5 8 13 \n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}
