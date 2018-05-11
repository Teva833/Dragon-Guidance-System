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
        
        boolean done = false;
        Maze m = new Maze();
        Solver s = new Solver();
        Scanner sc = new Scanner(System.in);
        String fromNode = null;
        String toNode = null;

       while(!done)
       {
            System.out.println("What room are you near?");
            String from = sc.next();
            System.out.println("What room do you want to go to?");
            String to = sc.next();
            Tree t = new Tree();

            fromNode = s.findNode(from, t.getHalls());
            toNode = s.findNode(to, t.getHalls());
            if(fromNode != null && toNode != null)
            {
                done = true;
            }
            else
            {
                System.out.println("Sorry, the room you entered does not exist.");
                System.out.println("Please try again.");
                System.out.println("");
            }
       }
       sc.close();
        
        
        List<String> path = s.pathFind(fromNode,toNode, m.getMap());
        System.out.println("Here is your path.");
        for(int i = 0; i < path.size(); i++)
        {
            System.out.println(path.get(i));
            
        }
    
    }
}
