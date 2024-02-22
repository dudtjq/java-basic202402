package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));


        // 1. 수정 타겟의 이름을 입력받는다.

        // 2. 해당 이름이 있는지 탐색해본다.

        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.

        // 4. 탐색에 실패하면 실패한 증거를 확보한다. (flag)

        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.

        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.

        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        boolean flag =false;
         while (true) {

            System.out.print("수정하고픈 멤버를 입력하세요 : ");
            String name = scan.nextLine();

            if(name.equals("그만")){
                System.out.println("입력을 종료합니다.");
                break;
            }

             //인덱스 탐색 
             // 인덱스는 0 부터 시작이기 때문에 음수가 뜬다면 찾자 못한 것임
             int idx = -1;
             for (int i = 0; i < kakao.length; i++) {
                if (name.equals(kakao[i])) {
                    idx = i;
                    break;
                }

            }
             // 수정 여부 판단
             if(idx != -1){
                 System.out.printf("%s이름을 변경합니다 : ", name);
                 String newName = scan.nextLine();
                 kakao[idx] = newName;
                 System.out.println("변경 완료");
                 System.out.println("변경이 된 정보 : " + Arrays.toString(kakao));
                break;
             }else {
                 System.out.printf("%s는 없는 이름 입니다. \n", name);
             }




        }

        scan.close();

    }
}