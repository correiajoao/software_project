package ArrayLists;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        //Creates a new ArrayList of Strings
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        System.out.printf("Display list contents with counter-controlled loop:");

        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }

        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green");
        items.add("yellow");
        display(items, "%nDisplay list with two new elements:");

        items.remove("yellow");
        display(items, "%nRemove the first instance of yellow:");

        items.remove(1);
        display(items, "%nRemove the second list element (green):");

        // Check if red is in the list
        System.out.printf("%n\"red\" is %sin the list%n",
                items.contains("red") ? "" : "not ");

        // Display the size of the list
        System.out.printf("Size: %s%n", items.size());
    }

    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);

        for (String item: items) {
            System.out.printf(" %s", item);
        }
    }
}
