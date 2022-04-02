package com.homework;

import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 **/

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", "Ivanov", 3, List.of(5, 5, 4, 3)),
                new Student("Vova", "Vovchikov", 1, List.of(5, 2)),
                new Student("Vova", "Kavcheev", 1, List.of(5, 4, 5, 5)),
                new Student("Petr", "Petrenko", 3, List.of(5, 5, 5)),
                new Student("Roma", "Petrenko", 3, List.of(5, 5, 5, 3, 4)),
                new Student("Slava", "Slavikov", 2, List.of(4, 3)),
                new Student("leva", "levikov", 2, List.of(4, 3, 2, 2)),
                new Student("Ola", "Ivanova", 2, List.of(5, 5, 4, 4)),
                new Student("Ira", "Olegrova", 1, List.of(5, 5, 4, 5)));

//        первое задание
//
//        students.stream()
//                .filter(student -> student.ratingList.size() > 3)
//                .collect(Collectors.groupingBy(Student::getCourse, Collectors.mapping(Collectors.averagingInt(Student::getRatingList))));
//
//        System.out.println(map)
  //      System.out.println(map);
    }
}
