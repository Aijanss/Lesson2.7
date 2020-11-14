package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
        System.out.println("Ведите данные");
        System.out.println("Список А");
        ArrayList<String> listA = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);
        listA.add((scanner.nextLine()));
        listA.add((scanner.nextLine()));
        listA.add((scanner.nextLine()));
        listA.add((scanner.nextLine()));
        listA.add((scanner.nextLine()));
        Iterator<String> iterator = listA.iterator();
        while (iterator.hasNext()) {
            String A = iterator.next();
            System.out.println(A);

        }
        System.out.println("Список Б");
        Scanner scanner1=new Scanner(System.in);
        ArrayList<String> listB = new ArrayList<>(5);
        listB.add(scanner1.nextLine());
        listB.add(scanner1.nextLine());
        listB.add(scanner1.nextLine());
        listB.add(scanner1.nextLine());
        listB.add(scanner1.nextLine());
        Collections.reverse(listB);
         iterator = listB.iterator();
        while (iterator.hasNext()) {
            String B = iterator.next();
            System.out.println(B);
        }
        System.out.println("Общий список С");
        ArrayList<String >listC=new ArrayList<>();
        int i =0;
        while (i < listC.size()){
            listC.add(listA.get(i));
            listC.add(listB.get(i));
            iterator=listC.iterator();

        }
        while (iterator.hasNext()){
            String c=iterator.next();
            System.out.println(c);

        }
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String X, String L) {
                return X.length()- L.length() ;
            }
        });
        iterator=listC.iterator();
        while (iterator.hasNext()){
            String list=iterator.next();
            System.out.println(list);
        }
    }
 
    }


}

