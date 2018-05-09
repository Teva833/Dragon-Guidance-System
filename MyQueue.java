import java.util.LinkedList;
public class MyQueue<E> implements Queue<E>
{
    private LinkedList list;
    public MyQueue()
    {
        list = new LinkedList();
    }
    /**
	 *	Return the Object on the top of the Stack
	 *	If the Stack is empty, return null
	 */
	public E peek()
	{
	    if(list.isEmpty() == true)
	    {
	        return null;
	    }
	    return (E)(list.get(0));
	}
	
	/**
	 *	Add item to the top of the Stack
	 */
	public boolean add(E item)
	{
	   list.add(item); 
	   return true;
	}
	
	/**
	 *	Remove the Object from the top of the Stack and return it
	 *	If the Stack is empty, return null
	 */
	public E remove()
	{
	    if(list.isEmpty() == true)
	    {
	        return null;
	    }
	    return (E)(list.remove(0));
	}
	
	/**
	 *	Return true is this Stack is empty
	 */
	public  boolean isEmpty()
	{
	    if(list.size() == 0)
	    {
	       return true;
	    }
	    return false;
	}
	
	/**
	 *	Return the number of Objects that are in this Stack
	 */
	public int size()
	{
	    return list.size();
	}
}