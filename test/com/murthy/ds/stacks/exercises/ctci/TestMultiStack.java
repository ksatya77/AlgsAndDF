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
	public void testPop() {
		fail("Not yet implemented");
	}

	@Test
	public void testPeek() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

}
