package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        LineLength lineLength = new LineLength();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        Iterator<String> iteratorA;
        Iterator<String> iteratorB;

        LineLength.arrayFiling(a, 5);
        LineLength.print(a);

        LineLength.arrayFiling(b, 5);
        LineLength.print(b);
        Collections.reverse(b);
        iteratorA = a.iterator();
        iteratorB = b.iterator();
        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            c.add(iteratorA.next());
            c.add(iteratorB.next());

        }
        LineLength.print(c);
        c.sort(lineLength);
        LineLength.print(c);

    }


}

