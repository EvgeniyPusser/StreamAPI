package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

        public class AverageEvenNumbers {
            public static void main(String[] args) {
                // Список чисел для обработки
                List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

                // Использование Stream API для вычисления среднего значения четных чисел
                OptionalDouble average = numbers.stream()
                        .filter(n -> n % 2 == 0) // Фильтрация чётных чисел
                        .mapToInt(Integer::intValue) // Преобразование в IntStream
                        .average(); // Вычисление среднего значения

                // Вывод результата
                if (average.isPresent()) {
                    System.out.println("Среднее значение чётных чисел: " + average.getAsDouble());
                } else {
                    System.out.println("Нет чётных чисел в списке.");
                }
            }
        }



