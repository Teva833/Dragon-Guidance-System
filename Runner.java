
import java.util.Scanner;
import java.util.List;
import java.io.*;
import mayflower.*;
public class Runner
{
    // instance variables - replace the example below with your own

    public Runner()
    {

    }

        public static void main(String[] args)
        {
    
            Building b = new Building();
            Mayflower may =  new Mayflower("Dragon Guidance System", 800, 600, new Building());
    
            boolean done = false;
            Maze m = new Maze();
            Solver s = new Solver();
            Tree t = new Tree();
            Scanner sc = new Scanner(System.in);
            String fromNode = null;
            String toNode = null;
            String filename = null;
    
            System.out.println("Do you have a schedule file? (Y for yes)");
            if(sc.next().equals("Y"))
            {
                System.out.println("Please enter the file name without the .txt");
                filename = sc.next() + ".txt";
                try
                {
                    File file = new File(filename);
                    Scanner in = new Scanner(file);
                    top:
                    while(in.hasNextLine())
                    {
                        b = new Building();
                        may.setStage(b);
                        String str = in.nextLine();
                        String [] rooms = str.split(" ");
                        String from = rooms[0];
                        String to = rooms[1];
                        fromNode = s.findNode(from, t.getHalls());
                        toNode = s.findNode(to, t.getHalls());
    
                        List<String> path = s.pathFind(fromNode, toNode, m.getMap());
                        System.out.println("Here is your path.");
                        for(int i = 0; i < path.size(); i++)
                        {
                            writeToFile("output.txt", path.get(i)+ " ", true);
                        }
    
                        b.matchPath(path);
                        checker:
                        while(true)
                        {
                            System.out.println("Are you ready for the next path? (Y for yes)");
                            String question = sc.next();
                            if(in.hasNextLine() && question.equals("Y"))
                            {
                                break checker;
                            }
                            else if(!in.hasNextLine() && question.equals("Y"))
                            {
                                break top;
                            }
    
                        }
                        fromNode = null;//null everything before running again?
                        toNode = null;
    
                        to = null;
                        from = null;
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
    
            /*
            try
            {
            File file = new File(filename);
            Scanner in = new Scanner(file);
            while(in.hasNextLine())
            {
            String str = in.nextLine();
            String [] rooms = str.split(" ");
            String from = rooms[0];
            String to = rooms[1];
            fromNode = s.findNode(from, t.getHalls());
            toNode = s.findNode(to, t.getHalls());
    
            List<String> path = se.pathFind(fromNode, toNode, m.getMap());
            System.out.println("Here is your path.");
            Building b = new Building();
            new Mayflower("Dragon Guidance System", 800, 600, new Building());
            b.matchPath(List<String>);
            }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
             */
    
            else
            {
                while(!done)
                {
                    System.out.println("What room are you near?");
                    String from = sc.next();
                    System.out.println("What room do you want to go to?");
                    String to = sc.next();
    
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
                    writeToFile("output.txt", path.get(i)+ " ", true);
                }
            }
            System.out.println("Thank you for using Dragon Guidance System.");
            
           
    }
    private static void writeToFile(String fileName, String s, boolean append)
    {
            // TO-DO
            // Don't forget to close the stream after you are done!
            try
            {
                FileWriter fw = new FileWriter(fileName, append);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw, true);
                
                out.println(s);
                out.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}
