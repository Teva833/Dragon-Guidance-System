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
    List<String> traversed;

    /**
     * Constructor for objects of class Solver
     */
    public Solver()
    {
        // initialise instance variables
        traversed = new ArrayList<>();
    }
    
    public String findNode(String room, List<TNode<String>> rooms)
    {
        for(int i = 0; i < rooms.size(); i++)
        {
            List<TNode<String>> children = rooms.get(i).getChildren();
            for(int j = 0; j < children.size(); j++)
            {
                if(room.equals(children.get(j).getData()))
                {
                    return children.get(j).getParent().getData();
                }
            }
        }
        return null;
    }

    

    public List<String> pathFind(String start, String end, Graph<String> graph)
    {
        List<String> path = new ArrayList<>();
        path.add(start);
        traversed.add(start);
        if(start.equals(end))
        {
            return path;

        }
        List<String> neighbors = graph.getNeighbors(start);
        for(int i = 0; i < neighbors.size(); i++)
        {
            boolean passed = false;
            for(int j = 0; j < traversed.size(); j++)
            {
                if(neighbors.get(i).equals(traversed.get(j)))
                {
                    passed = true;
                    continue;
                }
            }
            if(passed)
            {
                continue;
            }
            start = neighbors.get(i);
            List<String> check = pathFind(start, end, graph);
            if(check != null)
            {
                for(int j = 0; j < check.size(); j++)
                {
                    path.add(check.get(j));
                }
                return path;
            }
        }
        //path.add(end);
        return null;
    }





}

