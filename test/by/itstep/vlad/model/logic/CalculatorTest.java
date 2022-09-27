package by.itstep.vlad.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
//        arrange(подготовка)
        int a = 10;
        int b = 3;
        int expected = 13;

//        action(запустить)
        int actual = Calculator.sum(a, b);


//        assert(утверждение) да или нет
        if (actual != expected) {
            Assert.fail();
        }

    }

    @Test
    public void testSub() {
//        arrange(подготовка)
        int a = 10;
        int b = 3;
        int expected = 7;

//        action(запустить)
        int actual = Calculator.sub(a, b);


//        assert(утверждение) да или нет
        if (actual != expected) {
            Assert.fail();
        }

    }

    @Test
    public void testMul() {
//        arrange(подготовка)
        int a = 9;
        int b = 3;
        int expected = 27;

//        action(запустить)
        int actual = Calculator.mul(a, b);


//        assert(утверждение) да или нет
        if (actual != expected) {
            Assert.fail();
        }

    }

    @Test
    public void testDiv() {
//        arrange(подготовка)
        int a = 9;
        int b = 3;
        int expected = 3;

//        action(запустить)
        int actual = Calculator.div(a, b);


//        assert(утверждение) да или нет
//        if (actual != expected) {
//            Assert.fail();
//        }

        Assert.assertEquals(expected, actual); // как if, только проще
        

    }

}
