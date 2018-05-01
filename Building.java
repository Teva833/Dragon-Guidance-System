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
        addActor(new Node(), 204, 150); //621 622 624
        addActor(new Node(), 204, 208); //623 626
        addActor(new Node(), 204, 286); //625 627 628 630
        addActor(new Node(), 204, 335); //2f stair mid
        addActor(new Node(), 143, 335); //2f stair mid hall
        addActor(new Node(), 204, 378); //629 631 632 634
        addActor(new Node(), 204, 448); //Rest rooms 633
        addActor(new Node(), 204, 490); //2f stair bot
        //first floor
        addActor(new Node(), 620, 110); //1f stair top
        addActor(new Node(), 620, 153); //1f hall top
        addActor(new Node(), 500, 153); //1f hall top left
        addActor(new Node(), 680, 153); //1f hall top right
        addActor(new Node(), 620, 185); //604 605
        addActor(new Node(), 620, 235); //606 607
        addActor(new Node(), 620, 290); //611 612
        addActor(new Node(), 620, 322); //1f T Hall
        addActor(new Node(), 550, 322); //1f to 300 mid stairs
        addActor(new Node(), 620, 385); //613 615 616
        addActor(new Node(), 620, 450); //1f Rest rooms confrence
        addActor(new Node(), 620, 491); //1f bot hall T
        addActor(new Node(), 680, 491); //1f bot exit right
        addActor(new Node(), 570, 491); //1f bot to band hall
        addActor(new Node(), 620, 522); //1f bot stairs
    }
}
