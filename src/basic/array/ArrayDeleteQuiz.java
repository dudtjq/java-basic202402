package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));

        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */


        while (true){

            if(kakao.length == 0){
                System.out.println("더 이상 삭제할 멤버가 없습니다.");
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

            System.out.print("삭제할 멤버 이름을 작성해주세요 : ");
            String name = scan.nextLine();

            int idx = -1;
            for (int i = 0; i < kakao.length; i++) {


                if (name.equals(kakao[i])) {
                    idx = i;
                    break;
                }

            }
            if(idx != -1){
                System.out.println(kakao[idx] + "의 이름을 삭제합니다. ");

                // 삭제 로직
                for (int i = idx; i <kakao.length - 1 ; i++) {
                    kakao[i] = kakao[i + 1];
                }

                String[] newMember = new String[kakao.length - 1];

                for (int j = 0; j <newMember.length ; j++) {
                    newMember[j] = kakao[j];

                }

                kakao = newMember;
                newMember = null;

                System.out.println("삭제된 정보: : " + Arrays.toString(kakao));

            }else {
                System.out.printf("%s는 없는 이름 입니다.\n", name);
            }

        }

        scan.close();








    }
}
