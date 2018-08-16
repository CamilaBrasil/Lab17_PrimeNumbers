import java.util.List;
import java.util.ArrayList;

public class Prime {

    public static int answer(int n) {
        
       List<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(19);
        list.add(23);
        list.add(29);
        list.add(31);
        list.add(37);
        list.add(41);
        list.add(43);
        list.add(47);
        list.add(53);
        list.add(59);
        list.add(61);
        list.add(67);
        list.add(71);
        list.add(73);
        list.add(79);
        list.add(83);
        list.add(97);
        
       
        return list.get(n - 1);
        
        
    }
}
