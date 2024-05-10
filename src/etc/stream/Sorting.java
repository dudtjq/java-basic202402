package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // 음식 목록 중 칼로리가 낮은 순으로 정렬(오름차순 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("=============================================================");

        // 음식 목록 중 칼로리가 높은 순으로 정렬(내림차순 정렬)
        // .reversed()
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("=============================================================");

        // 500칼로리보다 작은 요리중에 top3 필터링
        menuList.stream()
                .filter(dish ->  dish.getCalories() < 500) // 칼로리 500 미만인 애들만 거르기
                .sorted(comparing(Dish::getCalories).reversed()) // 높은 순으로 정렬
                .limit(3) // 3개 만 보이게 하기
                .toList() // 리스트로 포장
                .forEach(System.out::println);

    }

}
