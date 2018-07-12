package test.com.may; 

import com.may.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 1.测试方法上必须使用@Test进行修饰
 * 2.测试方法必须使用public void 进行修饰,不能带有任何的参数
 * 3.新建一个元代码目录来存放我们的测试代码
 * 4.测试类的包应该和被测试类保持一致
 * 5.测试单元中的每个方法必须可以独立测试,测试方法间不能有任何的依赖
 * 6.测试类使用Test作为类名的后缀(不是必须)
 * 7.测试方法用test作为方法的前缀(不是必须)
 */

/**
 * 测试用例只是用来达到预期的结果,但是逻辑错误无能为力
 */
public class CalculateTest { 

@Test
public void testAdd() throws Exception {
    assertEquals(6, new Calculate().add(3,3));
} 

/** 
* 
* Method: subtract(int a, int b) 
* 
*/ 
@Test
public void testSubtract() throws Exception {
    assertEquals(3, new Calculate().subtract(7,4));
} 

/** 
* 
* Method: multiply(int a, int b) 
* 
*/ 
@Test
public void testMultiply() throws Exception {
    assertEquals(12, new Calculate().multiply(2,6));
} 

/** 
* 
* Method: divide(int a, int b) 
* 
*/ 
@Test
public void testDivide() throws Exception {
    assertEquals(4, new Calculate().divide(8,2));
} 


} 

