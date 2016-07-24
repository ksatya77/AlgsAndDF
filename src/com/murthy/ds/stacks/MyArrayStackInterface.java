package com.murthy.ds.stacks;

public interface MyArrayStackInterface<T> {

	/*
	* Tests if the Stack is empty
	*/
	public boolean isEmpty();
	
	/*
	* Returns top item without its removal
	*/
	public T peek() throws StackException;
	
	/*
	* Removes and returns the item at the top of the stack
	*/
	public T pop() throws StackException;
	
	/*
	* Inserts an item on to the top of the stack
	*/
	public void push(T item) throws StackException;
	
	/**
	* Removes all items from the stack
	*/
	public void clear();
}

