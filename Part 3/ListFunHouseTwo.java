//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = null;
	}
	
	public void add(Comparable data)
	{
		ListNode temp = new ListNode(data,theList);
		theList=temp;
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
   		int count=0;
   		ListNode temp = theList;
   		while (temp!=null)
   		{
   			count++;
   			temp=temp.getNext();
   		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		theList.setNext(new ListNode(theList.getValue(),theList.getNext()));
				
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode temp=theList;
   		while (temp.getNext()!=null)
   		{
   			temp=temp.getNext();
   		}
   		temp.setNext(new ListNode(temp.getValue(),null));
		
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
		ListNode temp = theList;
		while(temp!=null)
		{
			temp.setNext(temp.getNext().getNext());
			temp=temp.getNext();
		}
	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		int count=1;
		ListNode tempeh = theList;
		while (tempeh!=null)
		{
			if (count%x==0)
			{
				tempeh.setValue(value);
			}
			tempeh=tempeh.getNext();
			count++;
		}
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		int count=1;
		ListNode tempeh=theList;
		while (tempeh!=null)
		{
			if (count%x==x-1)
			{
				if (tempeh.getNext()!=null) 
				{
					tempeh.setNext(tempeh.getNext().getNext());
					count++;
				}
			}
			tempeh=tempeh.getNext();
			count++;
		}	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output="";
   	ListNode temp = theList;
	while (temp!=null)
   	{
   		output+=temp.getValue()+" ";
   		temp=temp.getNext();
   	}
   	return output;
   }			
	
}