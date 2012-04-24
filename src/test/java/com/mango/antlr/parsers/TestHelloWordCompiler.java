package com.mango.antlr.parsers;

import static org.junit.Assert.assertEquals;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class TestHelloWordCompiler {

	@Test
	public void testCompile() {
		HelloWordCompiler compiler = new HelloWordCompiler();
		CommonTree ast = compiler.compile("Hello word!");
		Tree leftChild = ast.getChild(0);
		Tree rightChild = ast.getChild(1);
			 
		//check ast structure
		assertEquals(HelloWordParser.SALUTATION, leftChild.getType());
		assertEquals(HelloWordParser.ENDSYMBOL, rightChild.getType());
			 

	}

}
