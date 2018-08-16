import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeTest {

	
    @Test
    public void test1() {
        int expected = 2;
        int actual = Prime.answer(1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2() {
        int expected = 3;
        int actual = Prime.answer(2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test3() {
        int expected = 5;
        int actual = Prime.answer(3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test4() {
        int expected = 17;
        int actual = Prime.answer(7);
        assertEquals(expected, actual);
    }    
    
    @Test
    public void test5() {
        int expected = 61;
        int actual = Prime.answer(18);
        assertEquals(expected, actual);
    }
}
