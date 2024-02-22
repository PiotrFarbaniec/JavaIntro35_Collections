package collections1_task2;

public class MainClass {
    public static void main(String[] args) {
        MyList list = new MyList(11);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        list.add(130);
        list.add(8, 1000);
        list.add(11, 2000);
        list.add(15, 3000);
        System.out.println(list);
        System.out.println("size1: " + list.size());
        System.out.println(list.get(3));
        list.remove(7);
        System.out.println(list.isEmpty());

        System.err.println(list);
        System.err.println("size2: " + list.size());

    }
}