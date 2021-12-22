package oldTasks.Lesson14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoDuplicates {
    public static void main(String[] args) {

        List<Integer> listWithDuplicates = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            listWithDuplicates.add((int) (Math.random() * 20));
        }

        Set<Integer> listWithoutDup = new HashSet<>(listWithDuplicates);

        int numberDuplicates = (listWithDuplicates.size() - listWithoutDup.size());

        System.out.println("List with duplicates value " + listWithDuplicates);
        System.out.println("List without duplicates value " + listWithoutDup);
        System.out.println("Total number of duplicates value in the collection is " + numberDuplicates);
    }
}
