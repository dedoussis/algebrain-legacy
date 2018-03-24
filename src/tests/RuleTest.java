package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import common.system.DollarNode;
import common.system.NumNode;
import common.system.OperatorNode;
import common.system.Rule;
import common.system.VarNode;

public class RuleTest {
	OperatorNode ope1 = null;
	OperatorNode ope2 = null;
	VarNode var1 = null;
	DollarNode dol1 = null;
	NumNode num1 = null;
	Rule rul1 = null;
	@Before
	public void setUp() throws Exception {
		ope1 = new OperatorNode("diff");
		ope2 = new OperatorNode("is_const");
		var1 = new VarNode("x");
		dol1 = new DollarNode("a");
		num1 = new NumNode(1);
		
		ope1.getChildren().add(var1);
		ope2.getChildren().add(dol1);
		
		rul1 = new Rule(ope1, num1, ope2);
	}

	@Test
	public void testRule() {
		assertTrue(rul1 instanceof Rule);
	}
	
	@Test
	public void testGetLhs() {
		assertTrue(rul1.getLhs().equals(ope1));
	}
	
	@Test
	public void testGetRhs() {
		assertTrue(rul1.getRhs().equals(num1));
	}

	@Test
	public void testGetCondition() {
		assertTrue(rul1.getCondition().equals(ope2));
	}
	@Test
	public void testSetLhs() {
		rul1.setLhs(num1);
		assertTrue(rul1.getLhs().equals(num1));
	}
	
	@Test
	public void testSetRhs() {
		rul1.setRhs(ope1);
		assertTrue(rul1.getRhs().equals(ope1));
	}

	@Test
	public void testSetCondition() {
		rul1.setCondition(ope1);
		assertTrue(rul1.getCondition().equals(ope1));
	}
}
