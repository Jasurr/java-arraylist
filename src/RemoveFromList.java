package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveFromList {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Murka");
        Cat behemoth = new Cat("Begemot");
        Cat philipp = new Cat("philipp");
        Cat pushok = new Cat("Pushok");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);
        System.out.println(cats.toString());

        cats.remove(1);

//        cats.remove(philipp);
        System.out.println(cats.toString());
//        Foreach ni ichida o'chrish mumkinmas
//
/*        for (Cat cat: cats) {

            if (cat.name.equals("Pushok")) {
                cats.remove(cat);
            }
        }*/
/**
 * <b>Bunga doir qonun bor</b>
 * TODO: ArrayList-da bir vaqtni o'zida iteratsiya operatsiyasi va massivning elmentlari o'zgarishlarini qilib bo'lmaydi.
 */
/*
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at src.RemoveFromList.main(RemoveFromList.java:27)
* */
//    todo: Java-da iteratsiya paytida elementlarni olib tashlash uchun maxsus Iterator obektidan foydalanish kerak
        Iterator<Cat> catIterator = cats.iterator();//Iteratorni yaratamiz
        while(catIterator.hasNext()) {// Massiv elementlari mavjud bo'lgancha

            Cat nextCat = catIterator.next();//elmentlarni olamiz
            if (nextCat.name.equals("philipp")) {
                catIterator.remove();//Massiv da joylashgan Mushukni ismi bo'yicha o'chiramiz
            }
        }

        System.out.println(cats);
    }

}
