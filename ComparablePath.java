import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class ComparableList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparablePath
{
    // instance variables - replace the example below with your own
    List<String> path;
    int counter;

    /**
     * Constructor for objects of class ComparableList
     */
    public ComparablePath()
    {
        counter = 0;
        path = new ArrayList<>();
        
    }
    
    public void addToPath(String s)
    {
        path.add(s);
    }
    
    public List<String> getPath()
    {
        return path;
    }
    
    public void addToCount(int c)
    {
        counter += c;
    }
    
    public int getCount()
    {
        return counter;
    }
    
    
    

    
}
