package DataStructureandAlgoritmBasic.SimpleArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.remove(2);
        System.out.println("remove element");
        System.out.println(Arrays.toString(list.toArray()));

        ((ArrayList<String>) list).ensureCapacity(6);
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println(list.get(2));

        System.out.println("Clear");
        list.clear();
        System.out.println(list);

        System.out.println("Index");
        System.out.println(list.indexOf("4"));





    }
}
