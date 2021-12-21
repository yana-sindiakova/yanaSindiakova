package oldTasks.Lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingList {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        shoppingList.put("Milk", 2);
        shoppingList.put("Eggs", 10);
        shoppingList.put("Fish", 1);
        shoppingList.put("Meat", 1);
        shoppingList.put("Potatoes", 6);

        Set<String> keySet = shoppingList.keySet();

        int totalNumber = 0;
        for (String value : keySet) {
            totalNumber = totalNumber + shoppingList.get(value);
        }
        System.out.println("Shopping list is " + shoppingList);
        System.out.println("Total number of purchases is " + totalNumber);
    }
}
