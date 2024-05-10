package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Mapping {

    // 이름과 칼로리만 가진 클래스를 설계
    private static class SimpleDish{
        private String name;
        private int calories;

        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }

    }

    private static class DishNameType{

        private String name;
        private Dish.Type type;

        public DishNameType(String name, Dish.Type type) {
            this.name = name;
            this.type = type;
        }

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }



    public static void main(String[] args) {

        // stream 의 map: 컬렉션 (리스트, 셋 , 맵)에서
        // 원하는 정보만 추출하여 새로운 컬럭션으로 반환 해줌

        List<Integer> caloriesList = menuList.stream()
//                .map(dish -> dish.getCalories())
                .map(Dish::getCalories)
                .toList();
        System.out.println("caloriesList = " + caloriesList);

        /*
        * 요리 목록에서 메뉴 이름과 칼로리를 추출 하고 싶다
        * */

        System.out.println("===============================================================");

        menuList.stream()
//                .map(dish -> new SimpleDish(dish))
                .map(SimpleDish::new)
                .toList()
//                .forEach(dish -> System.out.println(dish));
                .forEach(System.out::println);

        /*
        * 요리목록에서 칼로리가 500칼로리보다 큰 음식을 필터링 한 후에
        * 음식의 이름과 타입만을 출력하여 출력하기
        * */

        System.out.println("===============================================================");

        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishNameType::new)
                .toList()
                .forEach(System.out::println);


    }


}
