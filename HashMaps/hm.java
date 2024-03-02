import java.util.*;

public class hm {
    //HashMap - it is a key value pair similar to dictionary in python. it is used when we need to have our own indexes. all those indexes will contain a certain value
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //add elements
        hm.put(1, 99);
        hm.put(2, 94);
        //get value of that index
        System.out.println(hm.get(1));

        // remove element
        hm.remove(1);
        System.out.println(hm.get(1));
    }
}
