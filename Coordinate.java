
/**
 * Write a description of class Coordinate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordinate
{
    int x;
    int y;
    Coordiante parent;
    
    public Coordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.parent = null;
        
    }
    
    public Coordinate(int x, int y, Coordinate parent)
    {
        this.x = x;
        this.y = y;
        this.parent = parent;
        
    }
    
    public int getX()
    {
        return x;   
    }
    
    public int getY()
    {
        return y;   
    }
    
    public Coordinate getParent()
    {
        return parent;   
    }

    
    
}
