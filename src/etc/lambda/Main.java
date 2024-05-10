package etc.lambda;

import java.util.List;

import static etc.lambda.Color.*;
import static etc.lambda.FilterApple.*;
import static etc.lambda.MappingApple.map;
import static etc.lambda.MappingApple.mappingAppleByColor;

public class Main {
    public static void main(String[] args) {
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========= 녹색 사과 필터링 =========");
        List<Apple> greenApples = filterGreenApples(appleBasket);

        for (Apple greenApple : greenApples) {

            System.out.println("greenApple = " + greenApple);

        }

        System.out.println("========= 다양한 색상의 사과 필터링 =========");

        List<Apple> filteredColorApple = filterAppleByColor(appleBasket, YELLOW);

        for (Apple apple : filteredColorApple) {
            System.out.println("apple = " + apple);
        }

        System.out.println("========= 원하는 조건의 사과 필터링 =========");
        
        // 100g 이하인 사과를 필터링
        List<Apple> apples = filterApple(appleBasket, new LightApplePredicate());

        for (Apple apple : apples) {

            System.out.println("apple = " + apple);
            
        }
        System.out.println("=========================================");
        // 빨강 또는 노랑 사과만 필터링
        List<Apple> apples1 = filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });

        for (Apple apple : apples1) {
            System.out.println("apple = " + apple);
        }

        System.out.println("=========================================");

        // 녹색이면서 100g 이상인 사과만 필터링
        // 인터페이스를 구현 하는 익명 클래스를 람다식으로 선언
        // 인터페이스의 추상 메서드가 단 하나일 경우에만 가능
        // 구현 하고자 하는 추상 메서드 내부 로직이 한 줄일 경우에는 총 괄호와 리턴을 생략
        // 할 수 있음
        // 어차피 filterApple 의 두번째 매개값은 무조건 ApplePredicate 타입의 객체가 전달
        // 되어야 하고 ApplePredicate는 추상메서드가 하나이니가 굳이 메서드 이름을 쓸 필요가
        // 없음, 게다가 메서드 내부에는 return 한줄만쓸거라서 괄호랑 return 을 생략해
        // 버리니 이런 모양이 나옴
        List<Apple> apples2 = filterApple(appleBasket,
                (apple) -> apple.getColor() == GREEN && apple.getWeight() >= 100 );

        for (Apple apple : apples2) {

            System.out.println("apple = " + apple);

        }

        System.out.println("=========================================");

        // 색깔이 빨강 혹은 초록이면서 무게가 150 미만 이여야함
        List<Apple> apples3 = filterApple(appleBasket,
                (apple) -> (apple.getColor() == RED || apple.getColor() == GREEN)
                        && apple.getWeight() <= 150);

        for (Apple apple : apples3) {
            System.out.println("apple = " + apple);
        }

        System.out.println("=========== 여러가지 타입의 객체를 필터링  ===========");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 람다식에서 구현하는 메서드의 매개변수가 하나일 경우에는 소괄호 생략 가능
        // 매개변수가 없거나, 두개 이상일 경우에는 소괄호 꼭 붙혀야함
        List<Integer> filter1 = filter(numbers, n -> n % 2 == 1);

        System.out.println("filter1 = " + filter1);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살");

        List<String> foodFilter = filter(foods, (t) -> t.length() == 3);

        System.out.println("foodFilter = " + foodFilter);

        List<Apple> filters = filter(appleBasket, apple -> apple.getWeight() < 100);
        System.out.println("filters = " + filters);

        System.out.println("=========== 사과의 색상만 맵핑  ===========");

        List<Color> colorList = mappingAppleByColor(appleBasket);

        System.out.println("colorList = " + colorList);

        System.out.println("=========== 숫자에서 제곱수를 맵핑  ===========");

        List<Integer> map1 = map(numbers, (n) -> n * n);
        System.out.println("map1 = " + map1);

        System.out.println("=========== 문자에서 첫 글자만 맵핑  ===========");
        List<Character> map2 = map(foods, f -> f.charAt(0));
        System.out.println("map2 = " + map2);

        System.out.println("=========== 사과에서 무게만 맵핑  ===========");
        List<Integer> map3 = map(appleBasket, a -> a.getWeight());

        System.out.println("map3 = " + map3);
    }

}
