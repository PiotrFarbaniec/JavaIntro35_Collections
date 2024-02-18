package collections1_task1;

import java.util.*;

public class NamesList {
    public static void main(String[] args) {
        String[] names = {"Anna", "Katarzyna", "Tymon", "Tadeusz",
                          "Anna", "Karolina", "Dorota", "Piotr"};

        var list1 = createNoRepetitionList(names);
        System.out.println(list1);
        var list2 = getReverseOrderList(names);
        System.out.println(list2);
        modifyListObject(list2, "Anna", "Joanna");
        System.out.println(list2);
    }

    static Collection createNoRepetitionList(String... names) {
        Set namesList = new HashSet<String>();
        for (String name: names ) {
            namesList.add(name);
        }
        return namesList;
    }

    static List getReverseOrderList (String... names) {
        List list = new ArrayList<String>();
        List reveseList = new ArrayList<String>();
        for (String name : names) {
            list.add(name);
        }
        ListIterator<String> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            reveseList.add(iterator.previous());
        }
        return reveseList;
    }

    static void modifyListObject(List<String> c, String renameFrom, String renameTo) {
        for (int i = 0; i < c.size(); i++) {
            if (c.contains(renameFrom)) {
                c.set(c.indexOf(renameFrom), renameTo);
            }
        }
    }
}