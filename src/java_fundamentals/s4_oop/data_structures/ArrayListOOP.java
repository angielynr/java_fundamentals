package java_fundamentals.s4_oop.data_structures;

import java.util.ArrayList;

public class ArrayListOOP {
    public static void main(String[] args) {
        String[] sa = new String[5];
        sa[0] = "Maggie";

        for (int i = 0; i < sa.length; i++){
            System.out.println(sa[i]);
        }

        System.out.println();

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("angie");
        stringArrayList.add("angie2");
        stringArrayList.add("angie3");
        stringArrayList.add("angie4");
        stringArrayList.add("angie5");

        stringArrayList.remove(1);

        int indexOf = stringArrayList.indexOf("angie3");
        System.out.println(indexOf);

        System.out.println(stringArrayList.contains("angie"));

        String getName = stringArrayList.get(3);
        System.out.println("getName " + getName);


        stringArrayList.set(0, "Changed");

        System.out.println( stringArrayList.size());
        //stringArrayList.clear(); //clears everything in the arrayList

        for (String item: stringArrayList
             ) {
            System.out.println(item);
        }

    };
}
