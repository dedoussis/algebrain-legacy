package common.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.system.domain.AbstractNode;
import common.system.domain.OperatorNode;

public class OperatorNodeTest {
	
	private OperatorNode ope1, ope2, ope3, ope4 = null;

	@Before
	public void setUp() throws Exception {
		ope1 = new OperatorNode("+");
		ope2 = new OperatorNode("diff");
		ope3 = new OperatorNode("=");
		ope4 = new OperatorNode("^");
		
		ope1.getChildren().add(ope2);
		ope1.getChildren().add(ope3);
	}
	
	@Test
	public void testOperatorNode(){
		Assert.assertTrue(ope1 instanceof OperatorNode);
		Assert.assertTrue(ope2 instanceof OperatorNode);
		Assert.assertTrue(ope3 instanceof OperatorNode);
	}
	@Test
	public void testSetKey() {
		ope2.setKey("simpl");
		assertEquals("simpl" , ope2.getKey());
	}

	@Test
	public void testGetKey() {
		assertEquals("+" , ope1.getKey());
	}

	@Test
	public void testGetChildren() {
		assertEquals(ope1.getChildren().get(0) , ope2);
		assertEquals(ope1.getChildren().get(1) , ope3);
	}

	@Test
	public void testSetChildren() {
		ArrayList<AbstractNode> newchildren = new ArrayList<AbstractNode>();
		newchildren.add(ope4);
		ope1.setChildren(newchildren);
		assertEquals(ope1.getChildren().get(0),ope4);
		}

	@Test
	public void testClone() throws CloneNotSupportedException {
		assertNotEquals(ope1.clone(), ope1);
		assertNotEquals(ope1.clone().getChildren().get(0), ope1.getChildren().get(0));
	}

}
