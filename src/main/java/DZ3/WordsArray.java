package DZ3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsArray {
    public static void main(String[] args) {


        String[] wordsArray = new String[]{"работа", "дом", "джава", "джава", "дом", "работа", "машина", "велосипед", "корова", "велосипед"};
        Set<String> set = new HashSet<String>(Arrays.asList(wordsArray));
        int a = set.size();
        System.out.println(set);
        System.out.println("Каждое слово встречается" + " " + a + " " + "раз");
    }}