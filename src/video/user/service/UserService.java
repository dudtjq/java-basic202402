package video.user.service;

import video.common.AppService;
import video.user.domain.Grade;
import video.user.domain.User;
import video.user.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static video.ui.AppUi.*;

public class UserService implements AppService {

    private final UserRepository userRepository = new UserRepository();

    @Override
    public void start() {

        while (true){

            userManagementScreen();
            int selection = inputIntger(">>> ");

            switch (selection){

                case 1 :
                    join();
                    break;

                case 2 :
                    showSearchUser();
                    break;

                case 3 :
                    deleteUser();
                    break;

                case 4 :
                    return; // start()메서드를 강제 종료 해서 초기 화면
                            // 으로 돌아갈 수 있도록 처리

                default:
                    System.out.println("#메뉴를 다시 입력하세요.");
            }

        }

    }


    // 이름을 입력 받아 해당 이름이 포함한 객체 리스트를 리턴하는 기능
    private List<User> searchUser() {
        
        System.out.println("\n====== 조회할 회원의 이름을 입력하세요. ======");
        String name = inputString(">>> ");

        return userRepository.findUserByName(name);
        

    }

    // 단순 조회 결과 출력
    private void showSearchUser() {
        List<User> users = searchUser();
        
        if(users.size() > 0){

            System.out.println("\n============================== 회원 조회 결과 ==============================");

            for (User user : users) {
                System.out.println(user);
            }

        }else {
            System.out.println("\n### 조회 결과가 없습니다.");
        }
    }

    // 회원 추가 비지니스 로직
    // 비지니스 로직 : 요청에 따른 데이터의 생성, 조회, 저장, 변경등의 로직
    private void join() {

        System.out.println("\n====== 회원 가입을 진행 합니다. ======");

        String name = inputString("# 회원명 : ");

        String phone = inputString("#전화 번호 : ");

        // 입력받은 값을 토대로 User 객체 생성(등급은 BRONZE)
        User newUser = new User(name, phone, Grade.BRONZE);

        userRepository.addUser(newUser);
        System.out.printf("\n### %s님의 회원 가입이 완료 되었습니다\n", name);
        

    }

    // 회원 삭제(탈퇴)
    private void deleteUser() {
        List<User> users = searchUser();

        // 이름을 입력받아서 조회가 된 것
        if(users.size() > 0){
            // 삭제 대상 회원 번호를 저장할 리스트 -> 탈퇴할 회원 번호를 입력할 때 삭제 대상 번호를 입력했는지 확인용
            List<Integer> userNums = new ArrayList<>();

            for (User user : users) {
                System.out.println(user);
                userNums.add(user.getUserNumber());
            }

            System.out.println("\n### 탈퇴 할 회원의 번호를 입력하세요");
            int delUserNumber = inputIntger(">>>");

            if(userNums.contains(delUserNumber)){

                User deleteUser = userRepository.deleteUser(delUserNumber);
                System.out.printf("\n### %s[%s]님의 회원 정보가 정상 삭제 되었습니다."
                        , deleteUser.getUserName(), deleteUser.getPhoneNumber());

            }else {
                System.out.println("\n ### 검색한 회원의 회원번호로만 삭제가 가능합니다.");
            }

        }else {
            // 조회가 안된 것
            System.out.println("\n### 조회 결과가 없습니다.");
        }

    }


}
