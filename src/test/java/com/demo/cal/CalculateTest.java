package com.demo.cal;

import org.junit.Test;

import junit.framework.TestCase;
/**
 * 编写测试类分单元测试各个单元模块是否正常运行
 * @author User
 *
 */
public class CalculateTest extends TestCase {
	private Calculate calculate = new Calculate();
	@Test
	public void testadd(){
		//assertEquals 用来比对结果和期望值是否相同
		assertEquals(10,calculate.add(4, 6));
	}
	@Test
	public void testsubstract(){
		assertEquals(1,calculate.substract(5, 4));
	}
	@Test
	public void testmultiply(){
		assertEquals(24, calculate.multiply(4, 6));
	}
	@Test
	public void testdivide(){
		assertEquals(2, calculate.divide(6, 3));
	}

}
