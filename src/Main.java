import java.util.*;
import java.lang.*;
import java.util.Set;
import java.util.Map;

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

    public static List<String> listRandomString() {
        java.util.Random random = new java.util.Random();
//        Random random = new Random();
        List<String> words = new ArrayList<>(Arrays.asList("Автомобиль", "Автобус", "Велосипед", "Грузовик", "Мотоцикл", "Поезд", "Самолет", "Корабль", "Метро", "Такси", "Фургон", "Лодка", "Скутер", "Плот", "Верблюд", "Собака", "Кошка", "Лев", "Тигр", "Гепард", "Леопард", "Ягуар", "Пантера", "Рысь", "Волк", "Медведь", "Ежик", "Заяц", "Кролик", "Белка", "Мышь", "Крыса", "Кенгуру", "Жираф", "Зебра", "Антилопа", "Олень", "Лось", "Марал", "Кабан", "Баран", "Овца", "Коза", "Свинья", "Петух", "Курица", "Утка", "Гусь", "Страус", "Павлин", "Фазан", "Голубь", "Воробей", "Канарейка", "Попугай", "Жако", "Амазон", "Сорока", "Ворона", "Ворон", "Чайка", "Гагара", "Альбатрос", "Пеликан", "Цапля", "Аист", "Фламинго", "Лебедь", "Гусь", "Утенок", "Цыпленок", "Щенок", "Котенок", "Теленок", "Козленок", "Поросенок", "Жеребенок", "Ягненок", "Козленок", "Цыпленок", "Гусененок", "Кенгуренок", "Страусеннок", "Головастик", "Лягушонок", "Черепаха", "Ящерица", "Хамелеон", "Уж", "Змея", "Кобра", "Гадюка", "Ехидна", "Мангуст", "Суслик", "Хомяк", "Бурундук", "Сурок", "Дикобраз", "skypro"));
        int minimumScore = 1;
        int iteratorRandom = random.nextInt(words.size()) + minimumScore;
        int minimumIndex = 0;
        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < iteratorRandom; i++) {
            int iteratorIndex = random.nextInt(words.size()) + minimumIndex;
            wordList.add(words.get(iteratorIndex));
        }
        return wordList;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        List<String> stringList = listRandomString();
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(stringList);
        System.out.println(stringList);
        System.out.println(uniqueWords);
    }
    public static void task4() {
        System.out.println("Задача 4");
        List<String> stringList = listRandomString();
        System.out.println(stringList);
        Map<String, Integer> stringMap = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();
        for (String s : stringList) {
            if (stringMap.get(s) == null) {
                stringMap.put(s, 1);
            } else {
                stringMap.put(s, stringMap.get(s) + 1);
            }
        }
        uniqueWords.addAll(stringList);
        System.out.println(stringMap);
        for (String uniqueWord : uniqueWords) {
            System.out.println(stringMap.get(uniqueWord));
        }
//        for (Integer i = 0; i < stringMap.get(i); i++) {
//            
//        }
//        for (int i = 0; i < stringMap.size(); i++) {
//            stringMap.get(i);
//        }
    }
}