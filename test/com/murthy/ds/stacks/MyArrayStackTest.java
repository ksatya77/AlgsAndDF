package com.murthy.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class MyArrayStackTest extends TestCase {

	@Test
	public void testIsEmpty() {
		MyArrayStack<Integer> testStack = new MyArrayStack<Integer>();
		assertTrue(testStack.isEmpty());
	}
	
	@Test
	public void testIsNotEmpty(){
		MyArrayStack<Integer> testStack = new MyArrayStack<Integer>();
		testStack.push(10);
		assertFalse(testStack.isEmpty());
	}
	
	
	@Test(expected = StackException.class )
	public void testExceedStackCapacity(){
		MyArrayStack<Integer> testStack = new MyArrayStack<Integer>(2);
		testStack.push(10);
		testStack.push(20);
		testStack.push(30);
	}

	
}
