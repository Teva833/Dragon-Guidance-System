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

    public List<String> pathFind(String start, String end, AdjacencyListGraph<String> graph)
    {
        List<String> path = new ArrayList<>();
        path.add(start);
        traversed.add(start);
        if(start.equals(end))
        {
            return path;

        }
        List<String> neighbors = graph.getNeighbors(start);
        for(int i = 0; i < neighbors.length(); i++)
        {
            boolean passed = false;
            for(int j = 0; j < traversed.length(); j++)
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
                for(int i = 0; i < check.length(); i++)
                {
                    path.add(check.get(i));
                }
                return path;
            }
        }
        //path.add(end);
        return null;
    }





}

