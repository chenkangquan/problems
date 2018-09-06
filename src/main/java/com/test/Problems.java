package com.test;

public class Problems {
	/**
	 * 能被15整除输出FizzBuzz，能被3整除输出Fizz，能被5整除输出Buzz
	 * @param num
	 */
	public static void printProblemOne(int num){
		assert(num>0);
		for(int i=1;i<=num;i++){
			if(i%15==0){
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}
	/**
	 * 能被3整除或者数字包含一个3输出Fizz，能被5整除或者数字包含一个5输出Buzz，其他情况直接输出数字
	 * @param num
	 */
	public static void printProblemTwo(int num){
		assert(num>0);
		for(int i=1;i<=num;i++){
			String temp=String.valueOf(i);
			if(i%3==0||(temp.indexOf("3")>=0&&(temp.indexOf("3")==temp.lastIndexOf("3")))){
				System.out.println("Fizz");
			}else if(i%5==0||(temp.indexOf("5")>=0&&(temp.indexOf("5")==temp.lastIndexOf("5")))){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}
}
