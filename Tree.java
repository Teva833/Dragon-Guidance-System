
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Tree
{
    List<TNode<String>> halls = new ArrayList<>();
    

    
    public Tree()
    {
        //hallways
        TNode<String> zer = new TNode("0");
        TNode<String> one = new TNode("1");
        TNode<String> two = new TNode("2");
        TNode<String> thr = new TNode("3");
        TNode<String> fou = new TNode("4");
        TNode<String> fiv = new TNode("5");
        TNode<String> six = new TNode("6");
        //rooms
        TNode<String> zz = new TNode("00");
        TNode<String> zo = new TNode("01");
        TNode<String> oz = new TNode("10");
        TNode<String> oo = new TNode("11");
        TNode<String> tz = new TNode("20");
        TNode<String> to = new TNode("21");
        TNode<String> thz = new TNode("30");
        TNode<String> tho = new TNode("31");
        TNode<String> fz = new TNode("40");
        TNode<String> fo = new TNode("41");
        TNode<String> fvz = new TNode("50");
        TNode<String> fvo = new TNode("51");
        TNode<String> sz = new TNode("60");
        TNode<String> so = new TNode("61");
        zer.addChild(zz);
        zer.addChild(zo);
        one.addChild(oz);
        one.addChild(oo);
        two.addChild(tz);
        two.addChild(to);
        thr.addChild(thz);
        thr.addChild(tho);
        fou.addChild(fz);
        fou.addChild(fo);
        fiv.addChild(fvz);
        fiv.addChild(fvo);
        six.addChild(sz);
        six.addChild(so);
        halls.add(zer);
        halls.add(one);
        halls.add(two);
        halls.add(thr);
        halls.add(fou);
        halls.add(fiv);
        halls.add(six);
    }
    public List<TNode<String>> getHalls()
    {
        return halls;
    }
}
