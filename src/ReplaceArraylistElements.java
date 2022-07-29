package src;

import java.util.ArrayList;

public class ReplaceArraylistElements {

    public static void main(String[] args) {
        ArrayList<String> bags = new ArrayList<String>();

        // bags list iga qiymat kiritish.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");

        // Yangi array list yaratish
        ArrayList<String> boxes = new ArrayList<String>();

        // boxes list qiymat qo'shish.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");

        // Ammal barilishidan oldingi holat
        System.out.println("Bags :" + bags);
        System.out.println("Boxes :" + boxes);

        // boxes listni retainAll() metodiga bags ni parameter ko'rinishida berib yuboramiz
        boxes.retainAll(bags);

        // Operatsiydan keyingi holat
        System.out.println("\nBoxes massiviga retainAll()"+
                " methodni qo'llagandan keyingi holati\n");
        System.out.println("Bags :" + bags);
        System.out.println("Boxes :" + boxes);
    }
}
