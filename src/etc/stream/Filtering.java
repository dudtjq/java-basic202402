package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Filtering {
    public static void main(String[] args) {
        
        // stream의 filter
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

        // 메뉴 중에 채식 주의자가 먹을 수 있는 음식들만 필터링
        menuList.stream()// menuList 정보를 가진 stream 객체를 받음
                //  stream 객체의 filter 호출(Predicate 인터페이스를 구현한 객체)
                .filter(dish -> dish.isVegetarian())
                // 필터링 된 stream 객체를 List 로 변환 해서 리턴
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));
        // dishInVegetarian.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("============ 육류 이면서 600 칼로리 미만의 요리를 필터링 ============");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .toList()
                .forEach(dish -> System.out.println(dish));

        System.out.println("============= 요리 중에 요리 이름이 4글자인 요리만 필터링 ============");

        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .toList()
                .forEach(dish -> System.out.println(dish));

        System.out.println("============= 요리 중에 300 칼로리 보다 큰 요리만 필터링 ============");

        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .toList()
                .forEach(dish -> System.out.println(dish));

        System.out.println("==================================================================");

        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외 시킴
                .toList()
                .forEach(dish -> System.out.println(dish));
        
        System.out.println("============= 메뉴 목록에서 처음 등장하는 생선 요리 2개 필터링 ============");

        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.FISH)
                .limit(2)
                .toList()
                .forEach(dish -> System.out.println(dish));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 2, 4 ,2);

        // 짝수
        List<Integer> list = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .distinct()// 중복 제거
                .toList();
            System.out.println("list = " + list);

        // 중복 제거
//        Set<Integer> distinctNumber = new HashSet<>(list);
//        System.out.println("distinctNumber = " + distinctNumber);



    }
}
