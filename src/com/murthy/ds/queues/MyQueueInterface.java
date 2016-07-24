package com.murthy.ds.queues;

import java.util.NoSuchElementException;

public interface MyQueueInterface<T> {
	
	public void add(T item);
	
	public T remove() throws NoSuchElementException;
	
	public void peek() throws NoSuchElementException;
	
	public boolean isEmpty();

}
