package video.user.repository;

import video.user.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// User 저장소
public class UserRepository {
    
    private static final Map<Integer, User> userDatabase = new HashMap<>();

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
}
