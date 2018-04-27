import mayflower.*;

public class Node extends Actor
{
   public void update()
   {
        
   }
   public Node()
   {
       Picture node = new Picture("node.png");
       node.resize(10,10);
       setPicture(node);
   }
}
