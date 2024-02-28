package oop.inter.good;

public class Update implements IUserService{
    public Update() {
        System.out.println("회원 정보 수정 요청이 들어왔습니다.");
    }


    @Override
    public void exeute() {
        System.out.println("수정 정보를 받아서 데이터 베이스에서 수정 조치...");
    }
}
