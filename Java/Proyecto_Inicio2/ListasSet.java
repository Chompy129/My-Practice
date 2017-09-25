
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
/**
 * Clases polimorficas
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListasSet
{
    public static void main(String[] args)
    {
        ArrayList<Set> arSet = new ArrayList<Set>(0);
        HashSet<String> hash = new HashSet<String>(0);
        TreeSet<Integer> tree = new TreeSet<Integer>();
        
        hash.add("Sol");
        hash.add("Luna");
        hash.add("UltraSol");
        tree.add(2);
        tree.add(8);
        tree.add(5);
        
        arSet.add(hash);
        arSet.add(tree);
       
        Iterator<Set> it = arSet.iterator();
        
        while(it.hasNext())
        {
            Iterator<Set> it2 = it.next().iterator();
            while(it2.hasNext())
            {
                System.out.println(it2.next());
            }
        }
    }
}
