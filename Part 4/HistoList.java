//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
    private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
		boolean check = false;
		HistoNode temp;
		if (front==null)
			temp=null;
		else
			temp = new HistoNode(front.getLetter(),front.getLetterCount(),front.getNext());
		while (temp!=null)
		{
			if (temp.getLetter()==let)
			{
				if (front!=null&&front.getLetter()==let)
				{
					front.setLetterCount(front.getLetterCount()+1);
					check=true;
				}
				if (temp.getLetter()==let)
				{
					temp.setLetterCount(temp.getLetterCount()+1);
					check=true;
				}
			}
			temp=temp.getNext();
		}
		if (!check)
			front = new HistoNode(let,1,front);




	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		int currind=0;
		HistoNode temp;
		if (front!=null)
			temp = new HistoNode(front.getLetter(),front.getLetterCount(),front.getNext());
		else
			temp=null;
		while (temp!=null)
		{
			if (temp.getLetter()==let)
				return currind;
			temp=temp.getNext();
			currind++;
		}
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=null;
		int currind=0;
		if (front!=null)
			current = new HistoNode(front.getLetter(),front.getLetterCount(),front.getNext());
		else
			current=null;

		while (current!=null&&currind<=spot)
		{
			currind++;
			current=current.getNext();
		}
		return current;
	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		HistoNode temp = new HistoNode(front.getLetter(),front.getLetterCount(),front.getNext());
		while (temp!=null)
		{
			output+=temp.getLetter() + "=" + temp.getLetterCount() + " ";
			temp=temp.getNext();
		}
		return output;
	}
}