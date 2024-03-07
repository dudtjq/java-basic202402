package video.main;

import video.common.AppService;
import video.user.service.UserService;

public class AppController {

    private AppService service;

    // 선택한 메뉴에 따라 시스템을 정해주는 기능
    public void chooseSystem(int selectNumber){

        switch (selectNumber){

            case 1 :
                service = new UserService();
                break;

            case 2 :

                break;

            case 3 :

                break;

            case 4 :
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;

            default:
                System.out.println(" # 메뉴에 있는 정수를 입력해주세요.\n");

        }

        service.start();

    }

}
