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
		
		int stackSize = sizes[stackNum];
		int top = stackNum * stackCapacity+stackSize;
		values[top] = value;
		sizes[stackNum]++;
		
	}
	
	public int pop(int stackNum) throws RuntimeException {
		int stackSize = sizes[stackNum];
		if(stackSize == 0) throw new RuntimeException("Stack is empty");
		
		int top = stackNum*stackCapacity+stackSize;
		int retValue = values[top-1];
		values[top-1]=0;
		sizes[stackNum]--;
		return retValue;
	}
	
	public int peek(int stackNum) throws RuntimeException {
		int stackSize = sizes[stackNum];
		if(stackSize == 0) throw new RuntimeException("Stack is empty");
		
		int top = stackNum*stackCapacity+stackSize;
		int retValue = values[top-1];
		values[top-1]=0;
		return retValue;
	}
	
	public boolean isEmpty(int stackNum) {
		
		return sizes[stackNum] == 0;
	}
	
	public void toString(int stackNum){
		int start = stackNum*stackCapacity;
		for(int i=start; i<start+sizes[stackNum];i++){
			System.out.println(values[i]);
		}
	}
	

}
