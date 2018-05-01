import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);


        System.out.println("What room are you near?");
        String from = sc.next();
        System.out.println("What you do you want to go to?");
        String to = sc.next();
        Tree t = new Tree();
        
        String fromNode = s.findNode(from, t.getHalls());
        String toNode = s.findNode(to, t.getHalls());
        
        
        List<String> path = s.pathFind(fromNode,toNode, m.getMap());
        for(int i = 0; i<path.size(); i++)
        {
            System.out.println(path.get(i));
        }
    
    }
}
