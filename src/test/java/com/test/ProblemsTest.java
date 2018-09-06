package com.test;

import org.junit.Test;

public class ProblemsTest {
	/**
	 * 能被15整除输出FizzBuzz，能被3整除输出Fizz，能被5整除输出Buzz
	 * 
	 */
	/*@Test
	public void printProblemOneTest(){
		Problems.printProblemOne(100);
	}*/
	/**
	 * 能被3整除或者数字包含一个3输出Fizz，能被5整除或者数字包含一个5输出Buzz，其他情况直接输出数字
	 * 
	 */
	@Test
	public void printProblemTwoTest(){
		Problems.printProblemTwo(100);
	}
}
