package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int firstString = Integer.parseInt(a);
        int secondString = Integer.parseInt(b);
        int result = Integer.compare(function(firstString), function(secondString));

        return result != 0 ? result : Integer.compare(firstString, secondString);
    }

    private int function(int x) {
        return (int) (5 * Math.pow(x, 2) + 3);
    }
}
