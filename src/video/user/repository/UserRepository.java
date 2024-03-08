package video.user.repository;

import video.movie.domain.Movie;
import video.order.domain.Order;
import video.user.domain.Grade;
import video.user.domain.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// User 저장소
public class UserRepository {
    
    private static final Map<Integer, User> userDatabase = new HashMap<>();

    static {
        User test1 = new User("김테스트1", "010-1234-5678", Grade.BRONZE);
        User test2 = new User("김테스트2", "010-7890-4561", Grade.BRONZE);
        userDatabase.put(test1.getUserNumber(), test1);

        Movie testMovie = new Movie("testMovie", "testNation", 2024);
        Order testOrder = new Order(test1, testMovie);

        testOrder.setOrderDate(LocalDate.of(2024,3,1));
        testOrder.setReturnDate(LocalDate.of(2024,3,4));
        test1.addOrder(testOrder);
    }

    // 회원 추가 기능
    public void addUser(User user){

        userDatabase.put(user.getUserNumber(), user);

    }

    // 이름을 통해 회원 검색 기능 -> 동명이인이 있다면 모두 리턴하기 위해 List 리턴 타입 설정
    public List<User> findUserByName(String userName){
        List<User> userList = userDatabase.keySet().stream().mapToInt(key -> key).mapToObj(userDatabase::get).filter(user -> user.getUserName().equals(userName)).collect(Collectors.toList());

        // Map을 반복 처리 하기 위해 key들을 Set으로 반환
        for (int key : userDatabase.keySet()) {
            User user = userDatabase.get(key);  // key값을 통해 User객체를 얻기
            if (user.getUserName().equals(userName)){// User객체의 name이 매개값으로 받은 name과 같다면
                userList.add(user);   // 리스트에 객체를 추가
            }
        }

        return userList;

    }

    //                          key 값
    public User deleteUser(int delUserNumber) {

        return userDatabase.remove(delUserNumber);


    }

    public User findUserByNumber(int userNumber) {

        return userDatabase.get(userNumber);

    }
}
