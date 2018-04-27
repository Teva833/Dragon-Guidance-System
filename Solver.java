import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Write a description of class Solver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Solver
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Solver
     */
    public Solver()
    {
        // initialise instance variables
        
    }
    
    public List<String> pathFind(String start, String end, AdjacencyListGraph<String> graph)
    {
        List<String> path = new ArrayList<>();
        path.add(start);

        path.add(end);
        return path;
    }
    
    
    

    
}
