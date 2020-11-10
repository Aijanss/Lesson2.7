package com.company;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class LineLength  implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        Integer i1=o1.length();
        Integer i2=o2.length();
        return i1.compareTo(i2);
    }
    public static void arrayFiling(Collection<String> collection,int amount){
        Scanner scanner=new Scanner(System.in);
            System.out.println("Ведите данные ");
            System.out.println("___________________");
            collection.add(scanner.nextLine());
        }

    public static void print(Collection<String>collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
