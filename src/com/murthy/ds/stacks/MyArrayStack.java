package com.murthy.ds.stacks;

public class MyArrayStack<T> implements MyArrayStackInterface<T> {

	private static class MyArrayStackNode<T> {
		T data;
		MyArrayStackNode<T> next;
		
		public MyArrayStackNode(T dataIn){
			this.data = dataIn;
			this.next = null;
		}
	}
	
	private static final int DEFAULT_CAPACITY = 15;
	private int top;
	private T[] stack;
	
	public MyArrayStack(int initCapacity){
		if(initCapacity <= 0) stack = (T[])new Object[DEFAULT_CAPACITY];
		else stack = (T[])new Object[initCapacity];
		top = -1;
	}
	
	public MyArrayStack(){
		this(DEFAULT_CAPACITY);
	}
	
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	public T peek() throws StackException {
		// TODO Auto-generated method stub
		if(top == -1) throw new StackException("Stack is empty");
		return stack[top];
	}

	public T pop() throws StackException {
		// TODO Auto-generated method stub
		T item = peek();
		stack[top] = null;
		top--;
		return item;
	}

	public void push(T item) throws StackException {
		// TODO Auto-generated method stub
		if(top == DEFAULT_CAPACITY) throw new StackException("Stack has reached its capacity");
		top++;
		stack[top] = item;
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
