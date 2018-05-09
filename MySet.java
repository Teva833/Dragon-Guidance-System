import java.util.LinkedList;

public class MySet<E> implements Set<E>
{
    private LinkedList<E> list;
    
    public MySet()
    {
        list = new LinkedList<E>();
    }
    
    public boolean isEmpty()
    {
        if(list.size() == 0)
        {
            return true;
        }
        return false;
    }
    
    public int size()
    {
        return list.size();
    }
    
    public boolean contains(Object obj)
    {
        if(list.indexOf(obj) > -1)
        {
            return true;
        }
        return false;
    }
    
    public boolean remove(Object obj)
    {
        if(list.indexOf(obj) > -1)
        {
            list.remove(obj);
            return true;
        }
        return false;
    }
    
    public boolean add(E item)
    {
        if(list.indexOf(item) > -1)
        {
            return false;
        }
        list.add(item);
        return true;
    }
}