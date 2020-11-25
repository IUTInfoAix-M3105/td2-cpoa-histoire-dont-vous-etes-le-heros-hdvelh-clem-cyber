/**
 * File: NodeMultiple.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class NodeMultiple
{
	public static final int ERROR_STATUS_INDEX_OUT_OF_RANGE = -1;
	public static final String ERROR_MSG_INDEX_OUT_OF_RANGE = "Index out of range";
	public static int NODE_MAX_ARITY = 10;
	private NodeMultiple[] daughters;
	public Object Ndata;

	public String toString()
	{
		StringBuilder info = new StringBuilder();
		info.append(getData().toString());
		return info.toString();
	}

	public NodeMultiple getDaughterN(int i)
	{
		if (i >= NODE_MAX_ARITY || i < 0)
			ErrorNaiveHandler.abort(ERROR_STATUS_INDEX_OUT_OF_RANGE, ERROR_MSG_INDEX_OUT_OF_RANGE+'@'+getClass()+".getDaughter()");
		return daughters[i];
	}

	public void setDaughter(NodeMultiple daughter, int i)
	{
		this.daughters[i] = daughter;
	}

	public NodeMultiple[] getDaughters()
	{
		return this.daughters;
	}

	public void setDaughters(NodeMultiple[] daughtersAdd)
	{
		int i = 0;
		while (daughtersAdd[i] != null && i < NODE_MAX_ARITY)
			daughtersAdd[i] = this.daughters[i];
	}

	public void addDaughter(NodeMultiple daughter)
	{
		if (daughter == null)
			return;
		int i = 0;
		while (this.daughters[i] != null && i < NODE_MAX_ARITY)
			i++;
		if (i < NODE_MAX_ARITY)
			this.daughters[i] = daughter;
	}

	public Object getData()
	{
		return Ndata;
	}

	public void setData(Object data)
	{
		Ndata = data;
	}

	public boolean hasDaughters()
	{
		if (daughters == null)
			return false;
		int i = 0;
		while (i < daughters.length && daughters[i] != null)
			++i;
		return i < daughters.length;
	}

	public NodeMultiple()
	{
		this.Ndata = null;
		daughters = new NodeMultiple[NODE_MAX_ARITY];
	}

	public NodeMultiple(Object data)
	{
		this();
		this.Ndata = data;
	}
}

// eof