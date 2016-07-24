package com.murthy.ds.stacks.exercises.ctci;

public class MultiStack {
	
	private int[] values;
	private int[] sizes;
	private int stackCapacity;
	
	public MultiStack(int capacity){
		stackCapacity = capacity;
		values = new int[stackCapacity * 3];
		sizes = new int[3];
	}
	
	public void push(int stackNum, int value) throws RuntimeException{
		if(sizes[stackNum] == stackCapacity) throw new RuntimeException("Stack Overflow");
		
		int top = sizes[stackNum];
		int offset = stackNum * stackCapacity;
		values[offset+top] = value;
		sizes[stackNum]++;
		
	}
	
	public int pop(int stackNum) throws RuntimeException {
		
		return 0;
	}
	
	public int peek(int stackNum) throws RuntimeException {
		
		return 0;
	}
	
	public boolean isEmpty() {
		
		return false;
	}
	
	public void toString(int stackNum){
		int start = stackNum*stackCapacity;
		for(int i=start; i<start+sizes[stackNum];i++){
			System.out.println(values[i]);
		}
	}
	

}
