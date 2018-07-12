package test.com.may;

import org.junit.*;

/**测试五个方法的执行的流程
 * １.@BeforeClass修饰的方法会在所有方法被调用前执行，而且该方法是静态的，
 * 所以当测试类被加载后接着就会运行它，而且内存中它只会存在一份实例，它比较适
 * 合加载配置文件
 * ２.@AfterClass所修饰的方法通常用来对资源的清理，比如关闭数据库的链接
 * ３.@Before和@After会在每个测试方法的前后各执行一次
 */
public class JunitFlowTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("this is boforeclass");

    }

    @Before
    public void setUp() throws Exception {
        System.out.println("this is before");
    }

    @AfterClass
    public static void tearDwonAfter() throws Exception {
        System.out.println("this is afterclass");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("this is after");
    }

    @Test
    public void test1() {
        System.out.println("this is test1");
    }

    @Test
    public void test2() {
        System.out.println("this is test2");
    }

}
