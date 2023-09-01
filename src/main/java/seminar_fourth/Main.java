package seminar_fourth;

import java.util.*;
import java.util.function.BiFunction;



public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(Male.MALE);
        Cat cat2 = new Cat(Male.MALE);
        Cat cat3 = new Cat(Male.FEMALE);
        Cat cat4 = new Cat(Male.MALE);
        Cat cat5 = new Cat(Male.FEMALE);

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};
        List<Cat> catList = Arrays.asList(cats);
        List<Cat> catListOne = Arrays.asList(cats);

        for (Cat cat : cats){
            switch (cat.getMale().getRussianMaleTitle()){
                case "девочка", "мальчик" -> System.out.println(cat.getMale().getRussianMaleTitle());
            }

        }

        System.out.println();

        Iterator<Cat> iterator = catList.iterator();
        while (iterator.hasNext()){
            Cat cat = iterator.next();
            switch (cat.getMale()){
                case MALE -> System.out.println("это девочка");
                case FEMALE -> System.out.println("это мальчик");
            }
        }

        System.out.println();

        ListIterator<Cat> reverseIterator = catListOne.listIterator();
        while (reverseIterator.hasPrevious()){
            Cat cat = reverseIterator.previous();
            switch (cat.getMale()){
                case MALE -> System.out.println("это девочка");
                case FEMALE -> System.out.println("это мальчик");
            }
        }

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("Run!");;
            }
        };

        Runnable runnable2 = () -> System.out.println("New Run!");

        runnable.run();
        runnable2.run();

        BiFunction<Integer, Integer, String> biFunction = new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer a, Integer b) {
                return String.format("Result: %s + %s  = %s", a, b, a + b);
            }
        };

        BiFunction<Integer, Integer, String> biFunction1 =
            (a, b) -> String.format("New Result: %s + %s  = %s", a, b, a + b);

        System.out.println(biFunction.apply(5, 4));
        System.out.println(biFunction.apply(7, 8));
    }
}
