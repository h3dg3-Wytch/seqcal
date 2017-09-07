package fib;

import org.junit.Test;

public class FibTest {

    @Test
    public void TestBasicSequence(){
        Solution.fib(1, 1, 5);
    }

    @Test
    public void TestSecondarySequence(){
        Solution.fib(2,6, 4);
    }

    @Test
    public void TestThirdSequence(){
        Solution.fib(3, 4,4 );
    }

}
