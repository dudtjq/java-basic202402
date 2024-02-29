package etc.exception.custom;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        UserLogin user = new UserLogin("abc1234", "aaa1111!");

        System.out.print("아이디를 입력하세요 : ");
        String id = scan.nextLine();

        System.out.print("비밀번호를 입력하세요 : ");
        String pw = scan.nextLine();

        try {
            String result = user.loginValidate(id, pw);
            System.out.println("result = " + result);
        } catch (LoginValidateException e) {
          e.printStackTrace();
        }

        scan.close();

    }
}
