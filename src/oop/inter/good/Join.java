package oop.inter.good;

public class Join implements IUserService{

    public Join() {
        System.out.println("회원 가입 요청이 들아왔습니다.");
    }

    @Override
    public void exeute() {
        System.out.println("회원 가입 로직이 실행 됩니다.");
        System.out.println("DB도 접속하고, 입력값도 가져오고, 값도 가져오고 등등등..");
    }
}
