
import java.util.List;
public class Runner
{
    // instance variables - replace the example below with your own
    
    public Runner()
    {
        
       
    }
    public static void main(String[] args)
    {
        Maze m = new Maze();
        Solver s = new Solver();
        List<String> path = s.pathFind("0","6", m.getMap());
        for(int i = 0; i<path.size(); i++)
        {
            System.out.println(path.get(i));
        }
    
    }
}
