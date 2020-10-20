package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealTo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class MealsUtil {
    public static void main(String[] args) {
        List<Meal> meals = Arrays.asList(
                new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Р—Р°РІС‚СЂР°Рє", 500),
                new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "РћР±РµРґ", 1000),
                new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0), "РЈР¶РёРЅ", 500),
                new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0), "Р•РґР° РЅР° РіСЂР°РЅРёС‡РЅРѕРµ Р·РЅР°С‡РµРЅРёРµ", 100),
                new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0), "Р—Р°РІС‚СЂР°Рє", 1000),
                new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0), "РћР±РµРґ", 500),
                new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0), "РЈР¶РёРЅ", 410)
        );

        List<MealTo> mealsTo = filteredByCycles(meals, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);
        mealsTo.forEach(System.out::println);

//        System.out.println(filteredByStreams(meals, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000));
    }

    public static List<MealTo> filteredByCycles(List<Meal> meals, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // TODO return filtered list with excess. Implement by cycles
        return null;
    }

    public static List<MealTo> filteredByStreams(List<Meal> meals, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // TODO Implement by streams
        return null;
    }
}
