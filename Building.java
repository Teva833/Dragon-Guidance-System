import mayflower.*;
/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
public class Building extends Stage
{
    public void update()
    {

    }

    public Building()
    {
        setBackground("600Map.png");
        //second floor
        addActor(new Node("6002S0"), 204, 105); //2f stair top
        addActor(new Node("6002H0"), 204, 150); //621 622 624
        addActor(new Node("6002H1"), 204, 208); //623 626
        addActor(new Node("6002H2"), 204, 286); //625 627 628 630
        addActor(new Node("6002H3"), 204, 335); //2f stair mid
        addActor(new Node("6002S1"), 143, 335); //2f stair mid hall
        addActor(new Node("6002H4"), 204, 378); //629 631 632 634
        addActor(new Node("6002H5"), 204, 448); //Rest rooms 633
        addActor(new Node("6002S2"), 204, 490); //2f stair bot
        //first floor
        addActor(new Node("6001S0"), 620, 110); //1f stair top
        addActor(new Node("6001H0"), 620, 153); //1f hall top
        addActor(new Node("6001E0"), 500, 153); //1f hall top left
        addActor(new Node("6001E1"), 680, 153); //1f hall top right
        addActor(new Node("6001H1"), 620, 185); //604 605
        addActor(new Node("6001H2"), 620, 235); //606 607
        addActor(new Node("6001H3"), 620, 290); //611 612
        addActor(new Node("6001H4"), 620, 322); //1f T Hall
        addActor(new Node("6001S1"), 550, 322); //1f to 300 mid stairs
        addActor(new Node("6001H5"), 620, 385); //613 615 616
        addActor(new Node("6001H6"), 620, 450); //1f Rest rooms confrence
        addActor(new Node("6001H7"), 620, 491); //1f bot hall T
        addActor(new Node("6001E2"), 680, 491); //1f bot exit right
        addActor(new Node("6001E3"), 570, 491); //1f bot to band hall
        addActor(new Node("6001S2"), 620, 522); //1f bot stairs
    }

    public Actor[] getNodes()
    {
        return getActors();
    }

    public void matchPath(List<String> path)
    {
        Actor[] nodes = getActors();
        for(int i = 0; i < path.size(); i++)
            for(int j = 0; j < nodes.length; j++)
            {
                Node n = (Node) nodes[j];
                if(n.getVal() == path.get(i))
                    n.changeState();
            }
    }
}
