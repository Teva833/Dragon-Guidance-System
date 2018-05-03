
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Tree
{
    List<TNode<String>> halls = new ArrayList<>();

    
    public Tree()
    {
        //first Floor Halls
        TNode<String> firstStair0 = new TNode("6001S0");
        TNode<String> firstHall0 = new TNode("6001H0");
        TNode<String> firstExit0 = new TNode("6001E0");
        TNode<String> firstExit1 = new TNode("6001E1");
        TNode<String> firstHall1 = new TNode("6001H1");
        TNode<String> firstHall2 = new TNode("6001H2");
        TNode<String> firstHall3 = new TNode("6001H3");
        TNode<String> firstHall4 = new TNode("6001H4");
        TNode<String> firstStair1 = new TNode("6001SE");
        TNode<String> firstHall5 = new TNode("6001H5");
        TNode<String> firstHall6 = new TNode("6001H6");
        TNode<String> firstHall7 = new TNode("6001H7");
        TNode<String> firstExit2 = new TNode("6001E2");
        TNode<String> firstExit3 = new TNode("6001E3");
        TNode<String> firstStair2 = new TNode("6001S2");
        //second Floor Halls
        TNode<String> secondStair0 = new TNode("6002S0");
        TNode<String> secondHall0 = new TNode("6002H0");
        TNode<String> secondHall1 = new TNode("6002H1");
        TNode<String> secondHall2 = new TNode("6002H2");
        TNode<String> secondHall3 = new TNode("6002H3");
        TNode<String> secondStair1 = new TNode("6002S1");
        TNode<String> secondHall4 = new TNode("6002H4");
        TNode<String> secondHall5 = new TNode("6002H5");
        TNode<String> secondStair2 = new TNode("6002S2");
        //first Floor Rooms
        TNode<String> six01 = new TNode("601");
        TNode<String> six02 = new TNode("602");//H0
        TNode<String> six03 = new TNode("603");//E1
        TNode<String> six04 = new TNode("604");
        TNode<String> six05 = new TNode("605");//H1
        TNode<String> six06 = new TNode("606");
        TNode<String> six07 = new TNode("607");//H2
        TNode<String> six11 = new TNode("611");
        TNode<String> six12 = new TNode("612");//H3
        TNode<String> six13 = new TNode("613");
        TNode<String> six15 = new TNode("615");
        TNode<String> six16 = new TNode("616");//H5
        //second Floor Rooms
        TNode<String> six21 = new TNode("621");
        TNode<String> six22 = new TNode("622");
        TNode<String> six24 = new TNode("624");//H0
        TNode<String> six23 = new TNode("623");
        TNode<String> six26 = new TNode("626");//H1
        TNode<String> six25 = new TNode("625");
        TNode<String> six27 = new TNode("627");
        TNode<String> six28 = new TNode("628");
        TNode<String> six30 = new TNode("630");//H2
        TNode<String> six29 = new TNode("629");
        TNode<String> six31 = new TNode("631");
        TNode<String> six32 = new TNode("632");
        TNode<String> six34 = new TNode("634");//H4
        TNode<String> six33 = new TNode("633");//H5
        //first Floor Adds
        firstHall0.addChild(six01);
        firstHall0.addChild(six02);
        firstExit1.addChild(six03);
        firstHall1.addChild(six04);
        firstHall1.addChild(six05);
        firstHall2.addChild(six06);
        firstHall2.addChild(six07);
        firstHall3.addChild(six11);
        firstHall3.addChild(six12);
        firstHall0.addChild(six13);
        firstHall0.addChild(six15);
        firstHall0.addChild(six16);
        //second Floor Adds
        secondHall0.addChild(six21);
        secondHall0.addChild(six22);
        secondHall0.addChild(six24);
        secondHall1.addChild(six23);
        secondHall1.addChild(six26);
        secondHall2.addChild(six25);
        secondHall2.addChild(six27);
        secondHall2.addChild(six28);
        secondHall2.addChild(six30);
        secondHall4.addChild(six29);
        secondHall4.addChild(six31);
        secondHall4.addChild(six32);
        secondHall4.addChild(six32);
        secondHall4.addChild(six33);
    }

    public List<TNode<String>> getHalls()
    {
        return halls;
    }
}
