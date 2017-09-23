package testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.system.DollarNode;

public class DollarNodeTest {
	public static DollarNode dol1 = null;
	public static DollarNode dol2 = null;
	@Before
	public void setUp() throws Exception {
		dol1 = new DollarNode("a");
		dol2 = new DollarNode("b");
		
	}

	@Test
	public void testHashCode() {
		assertEquals(31+97,dol1.hashCode());
		assertEquals(31+98,dol2.hashCode());
	}

	@Test
	public void testDollarNode() {
		Assert.assertTrue(dol1 instanceof DollarNode);
		Assert.assertTrue(dol2 instanceof DollarNode);
	}

	@Test
	public void testSetKey() {
		dol1.setKey("x");
		assertEquals("x" , dol1.getKey());
	}

	@Test
	public void testGetKey() {
		assertEquals("a" , dol1.getKey());
	}

	@Test
	public void testEqualsObject() {
		Assert.assertTrue(dol1.equals(dol1));
		Assert.assertFalse(dol1.equals(dol2));
		
		Assert.assertTrue(dol1.equals(new DollarNode("a")));
	}

	@Test
	public void testCompareTo() {
		assertEquals(1,dol2.compareTo(dol1));
	}

}
