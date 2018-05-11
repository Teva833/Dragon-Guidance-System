import mayflower.*;

public class Node extends Actor
{
   private String val;
   private boolean visible;
   public void update()
   {
        if(visible)
        {
            Picture node = new Picture("node.png");
            node.resize(10,10);
            setPicture(node);
        }
   }
   public Node(String n)
   {
       val = n;
       visible = false;
   }
   public Node()
   {
       val = "";
       visible = false;
   }
   public String getVal()
   {
       return val;
   }
   public void changeState()
   {
       visible = !visible;
   }
}
