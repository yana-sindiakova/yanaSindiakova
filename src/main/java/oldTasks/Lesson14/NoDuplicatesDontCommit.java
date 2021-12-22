package oldTasks.Lesson14;

import java.util.*;

public class NoDuplicatesDontCommit {
    public static void main(String[] args) {
        List <Integer> listWithDuplicates = new ArrayList<> ();

        for (int i = 0; i <= 99; i++){
           listWithDuplicates.add ((int)(Math.random()*20));
        }

        listWithDuplicates.sort(Comparator.comparingInt(a -> a));
        System.out.println(listWithDuplicates);
        int numberDuplicates = 0;
        /*
        for (int i = 0; i < listWithDuplicates.size(); i++){
                for (int j = 0;j < listWithDuplicates.size(); j++){
                    if (!listWithDuplicates.get(i).equals(listWithDuplicates.get(j))){
                        numberDuplicates ++;
                    }
                }

        }

         */

        System.out.println(listWithDuplicates.stream().distinct());
        System.out.println(numberDuplicates);
        System.out.println("Should be ");
        System.out.println( new HashSet<>(listWithDuplicates));
    }
}
