package tests.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import common.system.domain.DollarNode;
import common.system.domain.NumNode;
import common.system.domain.OperatorNode;
import common.system.domain.Rule;
import common.system.domain.Transformation;

public class TransformationTest {
	
	private Transformation fibonacci = null;
	private ArrayList<Rule> rules = null; 
	
	@Before
	public void setUp() throws Exception {
		 rules = new ArrayList<Rule>();
		 OperatorNode ope1 = new OperatorNode("f");
		 ope1.getChildren().add(new NumNode(0));
		 
		 OperatorNode ope2 = new OperatorNode("f");
		 ope2.getChildren().add(new NumNode(1));
		 
		 rules.add(new Rule(ope1, new NumNode(0), null));
		 rules.add(new Rule(ope2, new NumNode(1), null));
		 
		 OperatorNode opePlus = new OperatorNode("+");
		 OperatorNode opeF1 = new OperatorNode("f");
		 OperatorNode opeF2 = new OperatorNode("f");
		 opePlus.getChildren().add(opeF1);
		 opePlus.getChildren().add(opeF2);
		 
		 OperatorNode opeMinus1 = new OperatorNode("-");
		 OperatorNode opeMinus2 = new OperatorNode("-");
		 opeF1.getChildren().add(opeMinus1);
		 opeF2.getChildren().add(opeMinus2);
		 
		 opeMinus1.getChildren().add(new DollarNode("a"));
		 opeMinus1.getChildren().add(new NumNode(1));
		 
		 opeMinus2.getChildren().add(new DollarNode("a"));
		 opeMinus2.getChildren().add(new NumNode(2));
		 
		 OperatorNode opeFPlus = new OperatorNode("f");
		 opeFPlus.getChildren().add(new DollarNode("a"));
		 
		 rules.add(new Rule(opeFPlus, opePlus, null));
		 fibonacci = new Transformation(rules);
	}

	@Test
	public void testTransformation() {
		assertTrue(fibonacci instanceof Transformation);
	}
	
	@Test
	public void testGetRules() {
		assertEquals(rules, fibonacci.getRules());
	}
	
	@Test
	public void testSetRules() {
		ArrayList<Rule> newRules = new ArrayList<Rule>();
		fibonacci.setRules(newRules);
		assertEquals(newRules, fibonacci.getRules());
	}
	
	@Test
	public void testToString() {
		assertEquals(((OperatorNode) rules.get(0).getLhs()).getKey(), fibonacci.toString());
	}
	
	@Test
	public void testMatchingTransform() throws CloneNotSupportedException {
		OperatorNode trialOpe1 = new OperatorNode("f");
		trialOpe1.getChildren().add(new NumNode(10));
		assertEquals("55", fibonacci.transform(trialOpe1).toString());
		
		OperatorNode trialOpe2 = new OperatorNode("f");
		trialOpe2.getChildren().add(new NumNode(0));
		assertEquals("0", fibonacci.transform(trialOpe2).toString());
		
		OperatorNode trialOpe3 = new OperatorNode("f");
		trialOpe3.getChildren().add(new NumNode(1));
		assertEquals("1", fibonacci.transform(trialOpe3).toString());
	}
	
	@Test
	public void testNonMatchingTransform() throws CloneNotSupportedException {
		DollarNode nonMatchingNode = new DollarNode("a");
		assertEquals(nonMatchingNode, fibonacci.transform(nonMatchingNode));
	}
	
	
}
