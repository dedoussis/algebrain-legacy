package common.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import common.system.domain.DollarNode;
import common.system.domain.NumNode;

public class NumNodeTest {
	private NumNode num1 = null;

	@Before
	public void setUp() throws Exception {
		num1 = new NumNode(5);
	}

	@Test
	public void testNumNode() {
		assertTrue(num1 instanceof NumNode);
	}

	@Test
	public void testSetKey() {
		num1.setKey(16);
		assertEquals(16, num1.getKey());
	}
	
	@Test
	public void testGetKey() {
		assertEquals(5, num1.getKey());
	}
	

}
