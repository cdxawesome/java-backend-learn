package JavaWeb.test;

import JavaWeb.junit.demo01.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest
{
    Calculator calc;

    @BeforeEach
    public void init()
    {
        calc = new Calculator();
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd()
    {
        int result = calc.add(1, 2);
        Assertions.assertEquals(3, result);
    }

    /**
     * 测试sub方法
     */
    @Test
    public void testSub()
    {
        int result = calc.sub(1, 1);
        Assertions.assertEquals(0, result);
    }

    @AfterEach
    public void close()
    {
        System.out.println("close...");
    }
}
