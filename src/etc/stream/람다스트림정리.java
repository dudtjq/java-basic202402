package etc.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 람다스트림정리 {

    public static List<String> getHealthDishName(List<Dish> menu){
        /*
         * 요리 목록에서 칼로리가 400 칼로리 보다 작은 요리들만 추출 해서
         * 칼로리가 낮은 순으로 오르차 정렬 한 후
         * 그 요리들의 이름만 추출 해서 리스트로 만들고 싶다
         * */

        // 스트림을 사용하지 않은 코드
        List<Dish> rowCalroricDishes = new ArrayList<>();

        for (Dish rowCalroricDish : menu) {

            if(rowCalroricDish.getCalories() < 400){
                rowCalroricDishes.add(rowCalroricDish);
            }
        }
        // 칼로리를 낮은 순으로 오름차 정렬
        rowCalroricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });
        // 정렬 된 리스트에서 이름만 뽑기
        List<String> dishName = new ArrayList<>();

        for (Dish dish : rowCalroricDishes) {

            dishName.add(dish.getName());

        }
        return dishName;
     }

     // 스트림을 사용한 코드
    public static List<String> getHealthyDishName2(List<Dish> menu){

        return menu.stream()
                .filter(dish -> dish.getCalories() < 400) // 400 이하 검열
                .sorted(Comparator.comparing(Dish::getCalories)) // 오름 차 정렬
                .map(dish -> dish.getName()) // 이름만 뽑기
                .toList(); // 리스트로 포장

    }


    public static void main(String[] args) {


        List<String> dishName1 = getHealthDishName(Menu.menuList);

        System.out.println("dishName1 = " + dishName1);

        List<String> dishName2 = getHealthyDishName2(Menu.menuList);

        System.out.println("dishName2 = " + dishName2);


    }

}
