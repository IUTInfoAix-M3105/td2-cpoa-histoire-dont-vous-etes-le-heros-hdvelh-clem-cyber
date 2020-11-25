/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple
{
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";

	private int id;
	/** Event identifier **/
	private GUIManager gui;
	/** Graphical User Interface **/
	private String playerAnswer;
	/** Text Version of player's answer **/
	private int chosenPath;
	/** Daughter's index chosen for the next event **/
	private Scanner reader;
	/* input reader **/
	static private int lastId;
	private Event[] daughters;


	public Event()
	{
		this.Ndata = null;
	}

	public <string> Event (GUIManager gui, string data)
	{
		this.Ndata = data;
		this.gui = gui;
		id = ++lastId;
		reader = gui.getInputReader();
	}

	public String getPlayerAnswer()
	{
		return this.playerAnswer;
	}

	public void setPlayerAnswer(String playerAnswerArg)
	{
		this.playerAnswer = playerAnswerArg;
	}

	public Scanner getReader()
	{
		return this.reader;
	}

	public void setReader(Scanner readerArg)
	{
		this.reader = readerArg;
	}

	public int getChosenPath()
	{
		return this.chosenPath;
	}

	public void setChosenPath(int chosenPathArg)
	{
		this.chosenPath = chosenPathArg;
	}

	/* Methods */
	public String getData()
	{
		return (String) this.Ndata;
	}

	public void setData(String data)
	{
		this.Ndata = data;
	}

	public Event getDaughterE(int i)
	{
		return this.daughters[i];
	}

	public void setDaughterE (Event daughterArg, int i)
	{
		this.daughters[i] = daughterArg;
	}

	public GUIManager getGui()
	{
		return this.gui;
	}

	public void setGui(GUIManager gui)
	{
		this.gui = gui;
	}

	public int getId()
	{
		return this.id;
	}

	public boolean IsFinal ()
	{
		return !this.hasDaughters();
	}

	public boolean isInRange (int index)
	{
		/* A compléter */
		return true;
	}

	public int interpretAnswer (String answer)
	{
		/* A compléter */
		return 0;
	}

	public Event run ()
	{
		/* A compléter */
		Event event = new Event();
		return event;
	}

	public String toString()
	{
		StringBuilder info = new StringBuilder();
		info.append("Event #");
		info.append(getId());
		info.append(" : ");
		info.append(getData().toString());
		return info.toString();
	}

}

// eof