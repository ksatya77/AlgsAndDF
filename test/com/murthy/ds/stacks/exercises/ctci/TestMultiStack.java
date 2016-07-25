package com.murthy.ds.stacks.exercises.ctci;

import org.junit.Test;

import junit.framework.TestCase;

public class TestMultiStack extends TestCase {


	@Test
	public void testPush() {
		MultiStack mStack = new MultiStack(5);
		mStack.push(0, 1);
		mStack.push(0, 6);
		mStack.toString(0);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testPushExceedCapacity() {
		try {
		MultiStack mStack = new MultiStack(1);
		mStack.push(0, 1);
		mStack.push(0, 6);
		} catch(Exception e){
			assertTrue(e instanceof RuntimeException);
			assertTrue(e.getMessage().equalsIgnoreCase("Stack Overflow"));
		}
	}

	@Test
	public void testEmptyPop() {
		try{
			MultiStack mStack = new MultiStack(2);
			int value = mStack.pop(1);
		} catch(Exception e) {
			assertTrue(e instanceof RuntimeException);
			assertEquals(e.getMessage(),"Stack is empty");
		}
	}
	
	@Test
	public void testPop() {
		MultiStack mStack = new MultiStack(2);
		mStack.push(0, 2);
		assertEquals(mStack.pop(0),2);
	}

	@Test
	public void testPeek() {
		MultiStack mStack = new MultiStack(2);
		mStack.push(0, 2);
		assertEquals(mStack.peek(0),2);
	}

	@Test
	public void testIsEmpty() {
		MultiStack mStack = new MultiStack(2);
		assertTrue(mStack.isEmpty(0));
	}

}
