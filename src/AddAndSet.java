package src;

import java.util.ArrayList;
import java.util.Comparator;

public class AddAndSet {

    public static void main(String[] args) {
        // String type da Array yaratish
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to ArrayList
        list.add("Java");
        list.add("Javascript");
        list.add("PHP");
        // ArrayList elementlarini console ga charish
        System.out.println(list);
        // Index bo'yicha massivga elment qo'shish
        list.add(1, "CSS");

        // ArrayList elementlarini console ga charish
        System.out.println("ADD: " + list);

//        index bo'yicha elmentni o'zgartirish
        list.set(2, "HTML");
        System.out.println("SET: " + list);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }
        System.out.println("LIST1: " + list1);
        for (int i = 0; i < 5; i++) {
            list2.add(i+5);
        }
        System.out.println("LIST2" + list2);
        list2.addAll(list1);
        System.out.println("RESULT: " + list2);

//        massivni sortirovka qilish
        list2.sort(Comparator.comparing(Integer::intValue));
        System.out.println("SORTED: " + list2);

        System.out.println("SubList: " + list2.subList(3, 5));

    }
}
