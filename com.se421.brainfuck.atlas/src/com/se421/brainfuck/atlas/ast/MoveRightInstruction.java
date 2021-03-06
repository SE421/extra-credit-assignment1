package com.se421.brainfuck.atlas.ast;

import org.eclipse.core.runtime.SubMonitor;

import com.ensoftcorp.atlas.core.db.graph.EditableGraph;
import com.ensoftcorp.atlas.core.db.graph.Node;
import com.se421.brainfuck.atlas.common.XCSGExtension;
import com.se421.brainfuck.atlas.parser.support.ParserSourceCorrespondence;

public class MoveRightInstruction extends Instruction {

	public MoveRightInstruction(ParserSourceCorrespondence sc) {
		super(sc);
	}

	public String toString(){
		return ">";
	}
	
	@Override
	public Type getType() {
		return Type.MOVE_RIGHT;
	}
	
	@Override
	public Node index(EditableGraph graph, Node containerNode, SubMonitor monitor) {
		// create the instruction node
		Node instructionNode = super.index(graph, containerNode, monitor);
		instructionNode.tag(XCSGExtension.Brainfuck.MoveRightInstruction);
		return instructionNode;
	}
	
}
