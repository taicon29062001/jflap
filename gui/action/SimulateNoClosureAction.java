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
 
package gui.action;

import automata.fsa.FiniteStateAutomaton;
import automata.Automaton;
import automata.AutomatonSimulator;
import gui.environment.Environment;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.KeyStroke;
import java.io.Serializable;

/**
 * This is the action used for the stepwise simulation of data without
 * closure, that is, without lambda transitions being automatically
 * traversed.
 * 
 * @author Thomas Finley
 */

public class SimulateNoClosureAction extends SimulateAction {
    /**
     * Instantiates a new <CODE>SimulateNoClosureAction</CODE>.
     * @param automaton the automaton that input will be simulated on
     * @param environment the environment object that we shall add our
     * simulator pane to
     */
    public SimulateNoClosureAction(Automaton automaton,
			  Environment environment) {
	super(automaton, environment);
	putValue(NAME, "Step by State...");
	putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke
		 (KeyEvent.VK_R, MAIN_MENU_MASK+InputEvent.SHIFT_MASK));
    }

    /**
     * Returns the simulator for this automaton.
     * @param automaton the automaton to get the simulator for
     * @return a simulator for this automaton
     */
    protected AutomatonSimulator getSimulator(Automaton automaton) {
	    return new automata.fsa.FSAStepByStateSimulator(automaton);
    }

    /**
     * This particular action may only be applied to finite state
     * automata.
     * @param object the object to test for applicability
     * @return <CODE>true</CODE> if the passed in object is a finite
     * state automaton, <CODE>false</CODE> otherwise
     */
    public static boolean isApplicable(Serializable object) {
	return object instanceof FiniteStateAutomaton;
    }
}
