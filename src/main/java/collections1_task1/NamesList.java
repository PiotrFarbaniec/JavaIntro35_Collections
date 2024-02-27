package collections1_task1;

import java.util.*;

public class NamesList {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Anna");
        namesList.add("Katarzyna");
        namesList.add("Tymon");
        namesList.add("Tadeusz");
        namesList.add("Anna");
        namesList.add("Karolina");
        namesList.add("Dorota");
        namesList.add("Piotr");
        List<String> list1 = new ArrayList<>();
        list1.addAll(namesList);
        List<String> list2 = new ArrayList<>();
        list2.addAll(namesList);
        List<String> list3 = new ArrayList<>();
        list3.addAll(namesList);

        System.out.println(namesList);
        System.out.println(createNoRepetitionList(list1));
        System.out.println(getReverseOrderList(list2));
        modifyListObjects(list3, "Anna", "Joanna");
        System.out.println(list3);
    }

    static List createNoRepetitionList(List list) {
        for (int i = 0; i < list.size(); i++ ) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
        return list;
    }

    static List getReverseOrderList (List list) {
        var reverse = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        return reverse;
    }

    static void modifyListObjects(List c, String renameFrom, String renameTo) {
        for (int i = 0; i < c.size(); i++) {
            if (c.contains(renameFrom)) {
                c.set(c.indexOf(renameFrom), renameTo);
            }
        }
    }
}