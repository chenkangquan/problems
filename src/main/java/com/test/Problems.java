package com.test;

public class Problems {
	/**
	 * �ܱ�15�������FizzBuzz���ܱ�3�������Fizz���ܱ�5�������Buzz
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
	 * �ܱ�3�����������ְ���һ��3���Fizz���ܱ�5�����������ְ���һ��5���Buzz���������ֱ���������
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
