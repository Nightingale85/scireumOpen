package com.scireum.open.xml;

/**
 * Called by the XMLReader for a parsed sub-DOM tree.
 * 
 * @author aha
 * 
 */
public interface NodeHandler {

	void process(StructuredNode node);
}
