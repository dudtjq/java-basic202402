package etc.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러가지 방법으로 필터링
public class FilterApple {

    /**
    @solution - try1: 사과바구니에서 녹색 사과만 필터링 하기
    @problem - 만약에 다른 색깔의 사과를 필터링 해야 한다면
    @param1 - 전체 사과가 들어있는 바구니
    @return - 녹색 사과만 필터링 된 바구니
    */

    public static List<Apple> filterGreenApples(List<Apple> basket){
        // 녹색 사과만 담을 바구니
        List<Apple> greenBasket = new ArrayList<>();

        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == Color.GREEN){
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
    @solution - try2 : 색상을 파리미터화 하자!
     @problem - 만약에 필터 기준이 색상이 아니라 무게라면?
    */

    public static List<Apple> filterAppleByColor(List<Apple> basket, Color color){
        // 필터링 된 사과만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();
        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == color) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }
    /**
     * @solution - try3 : 동작을 파리미터화 하면 해결이 가능함
     *                  - 함수를 전달 받을 수 있다면?
     *                  - 자바는 함수를 전달 할 수 있는가?
     *                  -> 불가능함 . 자바의 함수는 일급 객체가 아님
     *                  -> 함수 개념이 아니라 객체에 소속된 메서드 개념
     *                  그런데 전달되는 함수가 고정 되어 있는가?
     *                  -> 필터 조건에 따라 함수 내용이 달라야 한다
     *                  -> 그러면 어떻게 함수 이름이 통일 되면서
     *                  다른 내용을 전달할 수 있을까?
     *                  -> 오버라이딩(상속, 인터페이스)
     * */
    public static List<Apple> filterApple(List<Apple> basket,  ApplePredicate predicate){
        // 필터링 된 사과만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();
        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if(predicate.test(apple)) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }
    /**
     * @solution - try4 : 제네릭 필터 메서드 생성
     * */
    public static <T> List<T> filter(List<T> basket,  GenericPredicate<T> predicate){
        // 필터링 된 객체만 담을 바구니
        List<T> filteredBasket = new ArrayList<>();
        // 반복문을 통한 필터링
        for (T t : basket) {
            if(predicate.test(t)) {
                filteredBasket.add(t);
            }
        }
        return filteredBasket;
    }
}
