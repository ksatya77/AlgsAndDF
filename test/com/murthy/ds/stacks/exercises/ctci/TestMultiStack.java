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
