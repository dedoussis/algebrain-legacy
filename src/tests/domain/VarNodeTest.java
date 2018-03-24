package tests.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import common.system.domain.VarNode;

public class VarNodeTest {
	private VarNode var1, var2 = null;

	@Before
	public void setUp() throws Exception {
		var1 = new VarNode("x");
		var2 = new VarNode("y");
	}

	@Test
	public void testVarNode() {
		assertTrue(var1 instanceof VarNode);
	}
	
	@Test
	public void testSetKey() {
		var1.setKey("z");
		assertEquals("z", var1.getKey());
	}
	
	@Test
	public void testGetKey() {
		assertEquals("x", var1.getKey());
	}
	
	@Test
	public void testCompareTo() {
		VarNode var3 = new VarNode("x");
		assertTrue(var1.compareTo(var2)!=0);
		assertEquals(0, var3.compareTo(var1));
	}

}
