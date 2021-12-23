/* -- JFLAP 4.0 --
 *
 * Copyright information:
 *
 * Susan H. Rodger, Thomas Finley
 * Computer Science Department
 * Duke University
 * April 24, 2003
 * Supported by National Science Foundation DUE-9752583.
 *
 * Copyright (c) 2003
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms are permitted
 * provided that the above copyright notice and this paragraph are
 * duplicated in all such forms and that any documentation,
 * advertising materials, and other materials related to such
 * distribution and use acknowledge that the software was developed
 * by the author.  The name of the author may not be used to
 * endorse or promote products derived from this software without
 * specific prior written permission.
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED
 * WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */
 
package automata;

import automata.*;

/**
 * A node object is a data structure used in graph algorithms.
 * It stores a State object and a color.  This object is used 
 * to find the unreachable states in an automaton.
 * 
 * @see automata.StateAutomaton
 *
 * @author Ryan Cavalcante
 */

public class Node {
    /**
     * Creates a Node object with no state and no color.
     */
    public Node() {
	myState = null;
	myColor = "";
    }

    /**
     * Creates a Node object with <CODE>state</CODE> and no
     * color.
     * @param state the state contained by the Node object
     */
    public Node(StateAutomaton state) {
	myState = state;
	myColor = "";
    }
    
    /**
     * Creates a Node object with <CODE>state</CODE> and 
     * <CODE>color</CODE>.
     * @param state the state contained by the Node object
     * @param color the color of the node.
     */
    public Node(StateAutomaton state, String color) {
	myState = state;
	myColor = color;
    }

    /**
     * Returns the state contained by the Node object.
     * @return the state contained by the Node object.
     */
    public StateAutomaton getState() {
	return myState;
    }

    /**
     * Returns the color of the Node object.
     * @return the color of the Node object.
     */
    public String getColor() {
	return myColor;
    }

    /**
     * Colors the node white.
     */
    public void colorWhite() {
	myColor = WHITE;
    }

    /**
     * Colors the Node grey.
     */
    public void colorGrey() {
	myColor = GREY;
    }

    /**
     * Colors the Node black.
     */
    public void colorBlack() {
	myColor = BLACK;
    }

    /**
     * Returns true if the Node is white.
     * @return true if the Node is white.
     */
    public boolean isWhite() {
	if(myColor.equals(WHITE)) return true;
	return false;
    }

    /**
     * Returns true if the Node is grey.
     * @return true if the Node is grey.
     */
    public boolean isGrey() {
	if(myColor.equals(GREY)) return true;
	return false;
    }

    /**
     * Returns true if the Node is black.
     * @return true if the Node is black.
     */
    public boolean isBlack() {
	if(myColor.equals(BLACK)) return true;
	return false;
    }

    /**
     * Returns a string representation of the Node object, returning
     * a string representation of its state and color.
     * @return a string representation of the Node object.
     */
    public String toString() {
	return "STATE: " + myState.toString() + " COLOR: " + myColor;
    }

    /** Color of node. */
    protected String myColor;
    /** State of node. */
    protected StateAutomaton myState;
    /** String for white. */
    protected static final String WHITE = "white";
    /** String for grey. */
    protected static final String GREY = "grey";
    /** String for black. */
    protected static final String BLACK = "black";
}
