package com.bang.test;


import org.junit.Test;

import com.bang.main.MyList;

public class TestDemo {
	
	@Test
	public void test1(){
		MyList<String> myList=new MyList<>();
		myList.add("aaaaa");
		myList.add("bbbbb");
		myList.add(4, "cccc");
		for(int i=0;i<myList.getSize();i++){
			System.out.println(myList.get(i));
		}
	}
	
	@Test
	public void test2(){
		MyList<String> myList=new MyList<>();
		myList.add("aaaaa");
		myList.add("bbbbb");
		myList.add("cccc");
		myList.remove(2);
		for(int i=0;i<myList.getSize();i++){
			System.out.println(myList.get(i));
		}
	}
	
	@Test
	public void test3(){
		MyList<String> myList=new MyList<>();
		myList.add("aaaaa");
		myList.add("bbbbb");
		myList.add("cccc");
		System.out.println(myList.get(2));
	}
	
	
	
	
}
