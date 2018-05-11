import java.util.*;
/**
 * Write a description of interface SolveCapability here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface SolveCapability
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    
    
    String findNode(String room, List<TNode<String>> rooms);
    
    List<String> pathFind(String start, String end, Graph<String> graph);
}
