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
        System.out.println(" ");
        System.out.println(createNoRepetitionList(list1));
        System.out.println(" ");
        getReverseOrderList(list2);
        System.out.println(list2);
        System.out.println(" ");

        modifyListObjects(list3, "Anna", "Joanna");
        System.out.println(list3);
    }

    static Set<String> createNoRepetitionList(List<String> list) {
        Set<String> noRepList = new HashSet<>();
        noRepList.addAll(list);
        return noRepList;
    }

    static void getReverseOrderList (List<String> list) {
        Collections.reverse(list);
    }

    static void modifyListObjects(List c, String renameFrom, String renameTo) {
        Collections.replaceAll(c, renameFrom, renameTo);
    }
}