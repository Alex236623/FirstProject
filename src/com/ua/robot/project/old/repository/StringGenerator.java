package com.ua.robot.project.old.repository;

import java.util.Random;

public class StringGenerator {
    private static final String[] BEGINNINGS = {"О", "А", "І", "М", "В", "С", "Ю", "П"};
    private static final String[] VOWELS = {"а", "е", "и", "і", "о", "у", "я", "є", "ї", "ю"};
    private static final String[] LAST_NAME = {"Ковальов", "Ковальова", "Шевченко", "Бондаренко", "Ткаченко", "Коваленко", "Петренко", "Грищенко", "Лисенко", "Мельник", "Іваненко"};
    private static final String[] ENDINGS = {"ко", "енко", "чук", "ець", "юк", "ак", "ов", "єв", "ук", "як", "ар", "а", "их", "ич", "ів", "ін", "енко", "їн", "іна", "ій", "івна", "іна", "ішин", "юк", "ян", "онок", "ун", "унок", "унець", "ев", "юх", "явка", "янко", "яр", "яць", "яченко"};
    private static final Random random = new Random();

    public static String generateName() {
        String beginning = BEGINNINGS[random.nextInt(BEGINNINGS.length)];
        String middle = VOWELS[random.nextInt(VOWELS.length)];
        String ending = ENDINGS[random.nextInt(ENDINGS.length)];
        return beginning + middle + ending;
    }

    public static String generateLastName() {
        return LAST_NAME[random.nextInt(LAST_NAME.length)];
    }

}