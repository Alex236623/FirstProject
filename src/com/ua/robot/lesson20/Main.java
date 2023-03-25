package com.ua.robot.lesson20;


import java.util.*;

//Мапа потрібна містити інформацію про 10 будь яких слів українською мовою і ії
// переклад на: англійску, японську,
// німецьку. Коли користувач дає мапі слово украінською - то потрібен отримати у результаті переклад на ці 3 мови
public class Main {
    public static void main(String[] args) {
        String[] ukrainianWords = {"сонце", "дерево", "книга", "кава", "квіти", "дощ", "дитина", "місто", "хліб", "вітер"};
        String[] englishWords = {"sun", "tree", "book", "coffee", "flowers", "rain", "child", "city", "bread", "wind"};
        String[] japaneseWords = {"太陽", "木", "本", "コーヒー", "花", "雨", "子供", "市", "パン", "風"};
        String[] germanWords = {"Sonne", "Baum", "Buch", "Kaffee", "Blumen", "Regen", "Kind", "Stadt", "Brot", "Wind"};

        Map<String, String> worldsWithTranslate = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String translate;
            translate = englishWords[i] + " " + japaneseWords[i] + " " + germanWords[i];
            worldsWithTranslate.put(ukrainianWords[i], translate);
        }


        for (String ukrainianWord : ukrainianWords) {
            System.out.println(worldsWithTranslate.get(ukrainianWord));
        }


    }
}
