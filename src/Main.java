import java.util.*;

public class Main {

    public static int valueRandom() {
        java.util.Random random = new java.util.Random();
        int minimumScore = 1;
        int arrayRandom = random.nextInt(9) + minimumScore;
        return arrayRandom;
    }

    public static int valueSize() {
        java.util.Random random = new java.util.Random();
        int minimumScore = 40;
        int sizeRandom = random.nextInt(100) + minimumScore;
        return sizeRandom;
    }

    public static List<Integer> listRandom() {
        java.util.Random random = new java.util.Random();

        int minimumScoreSize = 20;
        int sizeRandom = random.nextInt(100) + minimumScoreSize;

        List<Integer> numberSeriesList = new ArrayList<>();
        for (int i = 0; i < sizeRandom; i++) {
            int minimumScoreValue = 1;
            int valueRandom = random.nextInt(9) + minimumScoreValue;
            numberSeriesList.add(valueRandom);
        }
        return numberSeriesList;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> numberSeriesList = listRandom();
        List<Integer> numberListEven = new ArrayList<>();
        System.out.println(numberSeriesList);
        for (Integer i : numberSeriesList) {
            if (numberSeriesList.get(i) % 2 == 0) {
                numberListEven.add(numberSeriesList.get(i));
            }
        }
        System.out.println(numberListEven);
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> numberSeriesList = listRandom();
        System.out.println(numberSeriesList);
//        Set<Integer> numberSetEven = new HashSet<>();
        List<Integer> numberSetEven = new ArrayList<>();
////        for (Integer i : numberSeriesList) {
//        for (int i = 0; i < numberSeriesList.size(); i++) {
//
//        }

        for (int i = 0; i < numberSeriesList.size(); i++) {
            if (numberSeriesList.get(i) % 2 == 0 && !numberSetEven.contains(numberSeriesList.get(i))) {
                numberSetEven.add(numberSeriesList.get(i));
            }
        }
        Collections.sort(numberSetEven);
        System.out.println(numberSetEven);
    }

    //    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
    public static void task3() {
        System.out.println("Задача 3");

    }
}