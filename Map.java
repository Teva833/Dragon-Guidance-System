import mayflower.*;

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map
{
    Graph<Integer> map = new AdjacencyListGraph<Integer>();
    
    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        // initialise instance variables
        map.add(0);
        map.add(1);
        map.add(2);
        map.add(3);
        map.add(4);
        map.add(5);
        map.add(6);
        //add edges
        map.addEdge(0,1);
        map.addEdge(0,2);
        map.addEdge(1,3);
        map.addEdge(2,4);
        map.addEdge(3,6);
        map.addEdge(4,5);
        map.addEdge(5,3);
    }

    
}
