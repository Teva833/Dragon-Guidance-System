import mayflower.*;

public class Node extends Actor
{
   private String val;
   public void update()
   {
        
   }
   public Node(String n)
   {
       val = n;
       Picture node = new Picture("node.png");
       node.resize(10,10);
       setPicture(node);
   }
   public Node()
   {
       val = "";
       Picture node = new Picture("node.png");
       node.resize(10,10);
       setPicture(node);
   }
}
