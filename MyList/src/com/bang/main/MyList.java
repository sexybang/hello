package com.bang.main;

import java.util.Arrays;

/**
 * 简陋实现自己的arrayList
 * @author LB
 *
 */

public class MyList<T> {
	
	private final static int DEFAULT_CAPACITY=10; 
	private Object[] elements;
	private int size;
	
	public MyList(){
		this(DEFAULT_CAPACITY);
	}
	
	public MyList(int capacity){
		if(capacity<0){
			throw new IllegalArgumentException("capacity error");
		}
		elements=new Object[capacity];
	}
	
	//添加元素
	public boolean add(T element){
		checkSize(size+1);
		elements[size]=element;
		size++;
		return true;
	}
	
	//在指定位置添加元素
	public boolean add(int index,T element){
		if(index>size||index<0){
			return false;
		}
		System.arraycopy(elements, index, elements, index, size-index);
		elements[index]=element;
		size++;
		return true;
	}
	
	private void checkSize(int oldCapacity){
		if(oldCapacity>elements.length){
			int newSize=size*2;
			elements=Arrays.copyOf(elements, newSize);
		}
	}
	
//	移除元素
	public boolean remove(int index){
		if(index<0||index>size){
			return false;
		}else{
			System.arraycopy(elements, index+1, elements, index, elements.length-index-1 );
			size--;
			return true;
		}
	}

//	移除指定元素
	public boolean remove(T element){
		if(element==null){
			return false;
		}else{
			for(int i=0;i<size;i++){
				if(element==elements[i]){
					System.arraycopy(elements, i+1, elements, i, elements.length-i-1 );
					size--;
					return true;
				}
			}
		}
		return false;
	}
	
//	获取指定元素
	public T get(int index){
		if(index<0||index>size){
			return null;
		}else{
			return (T) elements[index];
		}
	}

	public int getSize() {
		return size;
	}
	
	
	
}
