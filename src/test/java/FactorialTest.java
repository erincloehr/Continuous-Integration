import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial3(){
        Assert.assertEquals(6, Factorial.calculate(3));
    }
}
