package by.academy.homework.Stream_lambda_reflection;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<Long> generate = new Random().longs(100, 0, 100)
                .map(x -> x * 3 - 20)
                .filter(x -> x < 100)
                .sorted()
                .skip(3)
                .distinct().boxed().collect(Collectors.toList());

        Map<String, Long> map = generate.stream()
                .collect(Collectors.toMap( y -> "Number:" + y, x -> x));
        System.out.println(map);
    }
}
