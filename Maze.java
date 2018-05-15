import mayflower.*;

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze
{
    Graph<String> map = new AdjacencyListGraph<String>();
    /**
     * Constructor for objects of class Map
     */
    public Maze()
    {
        // initialise instance variables
        //first floor
        map.add("6001S0");
        map.add("6001S1");
        map.add("6001S2");
        map.add("6001H0");
        map.add("6001H1");
        map.add("6001H2");
        map.add("6001H3");
        map.add("6001H4");
        map.add("6001H5");
        map.add("6001H6");
        map.add("6001H7");
        map.add("6001E0");
        map.add("6001E1");
        map.add("6001E2");
        map.add("6001E3");
        //second floor
        map.add("6002S0");
        map.add("6002S1");
        map.add("6002S2");
        map.add("6002H0");
        map.add("6002H1");
        map.add("6002H2");
        map.add("6002H3");
        map.add("6002H4");
        map.add("6002H5");
        //first floor edges
        map.addEdge("6001S0","6001H0");
        map.addEdge("6001H0","6001S0");
        //map.addEdge("6001H0","6001E0");
        //map.addEdge("6001E0","6001H0");
        map.addEdge("6001H0","6001E1");
        map.addEdge("6001E1","6001H0");
        map.addEdge("6001H0","6001H1");
        map.addEdge("6001H1","6001H0");
        map.addEdge("6001H1","6001H2");
        map.addEdge("6001H2","6001H1");
        map.addEdge("6001H2","6001H3");
        map.addEdge("6001H3","6001H2");
        map.addEdge("6001H3","6001H4");
        map.addEdge("6001H4","6001H3");
        map.addEdge("6001H4","6001S1");
        map.addEdge("6001S1","6001H4");
        map.addEdge("6001H4","6001H5");
        map.addEdge("6001H5","6001H4");
        map.addEdge("6001H5","6001H6");
        map.addEdge("6001H6","6001H5");
        map.addEdge("6001H6","6001H7");
        map.addEdge("6001H7","6001H6");
        map.addEdge("6001H7","6001E2");
        map.addEdge("6001E2","6001H7");
        map.addEdge("6001H7","6001E3");
        map.addEdge("6001E3","6001H7");
        map.addEdge("6001H7","6001S2");
        map.addEdge("6001S2","6001H7");
        //Stair Connections
        map.addEdge("6001S0","6002S0");
        map.addEdge("6002S0","6001S0");
        map.addEdge("6001S1","6002S1");
        map.addEdge("6002S1","6001S1");
        map.addEdge("6001S2","6002S2");
        map.addEdge("6002S2","6001S2");
        //Second Floor
        map.addEdge("6002S0","6002H0");
        map.addEdge("6002H0","6002S0");
        map.addEdge("6002H0","6002H1");
        map.addEdge("6002H1","6002H0");
        map.addEdge("6002H1","6002H2");
        map.addEdge("6002H2","6002H1");
        map.addEdge("6002H2","6002H3");
        map.addEdge("6002H3","6002H2");
        map.addEdge("6002H3","6002S1");
        map.addEdge("6002S1","6002H3");
        map.addEdge("6002H3","6002H4");
        map.addEdge("6002H4","6002H3");
        map.addEdge("6002H4","6002H5");
        map.addEdge("6002H5","6002H4");
        map.addEdge("6002H5","6002S2");
        map.addEdge("6002S2","6002H5");
    }
    public Graph<String> getMap()
    {
        return map;
    }

    
}
