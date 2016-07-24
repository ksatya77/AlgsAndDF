package com.murthy.ds.queues;

import java.util.NoSuchElementException;

public class MyQueue<T> implements MyQueueInterface<T> {
	
	public static class MyQueueNode<T> {
		private T data;
		private MyQueueNode<T> next;
		
		public MyQueueNode(T dataIn){
			this.data = dataIn;
		}
	}
	
	private MyQueueNode<T> first;
	private MyQueueNode<T> last;

	public void add(T item) {
		// TODO Auto-generated method stub
		MyQueueNode newNode = new MyQueueNode(item);
		if(last != null){
			last.next = newNode;
		}
		last = newNode;
		if(first == null)
			first = last;
		
	}

	public T remove() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(first == null) throw new NoSuchElementException();
		T item = first.data;
		first = first.next;
		if(last == null)
			last = first;
		return item;
		
	}

	public void peek() throws NoSuchElementException {
		// TODO Auto-generated method stub
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
