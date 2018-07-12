package test.com.may;

import com.may.Calculate;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 对测试的一些注解进行解释
 */
public class AnnotationTest {
    /**
     * １.@Test：将一个普通的方法修饰成为一个测试方法
     *      @Test(expected=**.class)
     *      @Test(timeout=毫秒)
     * 2.@BeforeClass：它会在所有的方法运行前执行，static修饰
     * 3.@AfterClass:它会在所有的方法运行介乎后被执行，static修饰
     * 4.@Before:会在每一个测试方法被运行前比执行一次
     * 5.@After：会在每一个测试方法运行后被执行一次
     * 6.@Ignore:修饰的测试方法会被测试运行器忽略
     * 7.@RunWith:可以更改测试运行器,只要继承org.junit.runner.Runner
     *
     */

    @Test(expected = ArithmeticException.class)
    public void testDivide() {
        assertEquals(2, new Calculate().divide(6,0));
    }

    @Ignore("有点错误")
    @Test(timeout = 2000)
    public void testWhile() {
        while(true) {
            System.out.println("run forever");
        }
    }

    @Test(timeout = 3000)
    public void testReadFile() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
