package com.freeraven.datastructures.linkedlist.removeduplicates;

import java.util.*;

/**
 * Created by zvlad on 7/5/16.
 */
public class RemoveDuplicates {
    public static void removeFrom(LinkedList<Integer> list) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();
        Integer currentIndex = 0;
        ArrayList<Integer> duplicatesIndexes = new ArrayList<>();
        while (iterator.hasNext()) {
            Integer currentItem = iterator.next();
            if (uniqueValues.contains(currentItem)){
                duplicatesIndexes.add(currentIndex);
            }
        }

    }
}
