package by.itstep.vlad.model.logic;

import static org.junit.Assert.*;
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
            fail();
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
            fail(); // Assert.fail , если нет импорта(import static org.junit.Assert.*;)
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
            fail();
        }

    }

    @Test(timeout = 3000)
    public void testMulPower() {
//        arrange(подготовка)
        int a = 9;
        int b = 3;
        Calculator.mul(a, b);

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

        assertEquals(expected, actual); // как if, только проще


    }

    @Test(expected = ArithmeticException.class) // ArithmeticException.class - возврат результата(деление на 0)
    public void testDivByZero() {
//        arrange(подготовка)
        int a = 9;
        int b = 0;
        Calculator.div(a, b);// фантомный метод

    }


}
