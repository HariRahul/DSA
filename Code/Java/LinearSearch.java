package Code.Java;

import java.util.ArrayList;

public class LinearSearch {
    
    private static boolean linearSearch(char searchElement, String searchSpace){
        for(int i=0; i<searchSpace.length(); i++){
            if (searchElement == searchSpace.charAt(i)){
                System.out.println(String.format("Element %c found", searchElement));
                return true;
            }
        }
        System.out.println(String.format("Element %c not found", searchElement));
        return false;
    }

    private static boolean linearSearch(int searchElement, ArrayList<Integer> searchSpace){
        for(int i=0; i<searchSpace.size(); i++){
            if (searchElement == searchSpace.get(i)){
                System.out.println(String.format("Element %d found", searchElement));
                return true;
            }
        }
        System.out.println(String.format("Element %d not found", searchElement));
        return false;
    }

    public static void main(String[] args) {
        linearSearch('l', "Hello World");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(2);
        linearSearch(5, arrayList);
    }
}
