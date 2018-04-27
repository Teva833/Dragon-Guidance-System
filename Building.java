import mayflower.*;
/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building extends Stage
{
    public void update()
    {
        
    }
    public Building()
    {
        setBackground("600Map.png");
        //second floor
        addActor(new Node(), 204, 105); //2f stair top
        addActor(new Node(), 204, 150); // 621 622 624
        addActor(new Node(), 204, 208); //623 626
        addActor(new Node(), 204, 286); // 625 627 628 630
        addActor(new Node(), 204, 335); //2f stair mid
        addActor(new Node(), 143, 335); //2f stair mid hall
        addActor(new Node(), 204, 378); //629 631 632 634
        addActor(new Node(), 204, 448); //Rest rooms 633
        addActor(new Node(), 204, 490); //2f stair bot
        //first floor
        
    }
}
