package JUnitTest;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class CaclulatorTest {
    @Test
    public void add() throws Exception {
        assertEquals(4,new Caclulator().add(2,2));
    }

    @Test
    public void sub() throws Exception {
        assertEquals(4,new Caclulator().sub(6,2));
    }

    @Test
    public void mul() throws Exception {
        assertEquals(12,new Caclulator().mul(3,4));
    }

    @Test
    public void div() throws Exception {
        assertEquals(3,new Caclulator().div(12,4));
    }

    @Before
public void before() throws Exception {
    System.out.println("Before");
} 

@After
public void after() throws Exception {
    System.out.println("After");
}

} 
