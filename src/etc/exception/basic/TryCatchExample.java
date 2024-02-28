package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        /*
         # 예외 처리
         - 개발자가 코드를 통해 처리할 수 있는 에러를 다루는 것.
         - 예외 처리는 시스템 스스로 오류를 복구하는 것이 아니고
          오류 발생 가능성이 있는 부분에 대한 처리를 미리 준비하는 것입니다.
         - 시스템의 비정상적 종료를 막고 코드의 흐름이 계속될 수 있도록
          사전에 준비하는 행위를 말합니다.
         */

        Scanner scan = new Scanner(System.in);

        try {

        System.out.print("정수 1 : ");
        int i = scan.nextInt();

        System.out.print("정수 2 : ");
        int j = scan.nextInt();

        System.out.println("나눗셈 시작!");


            // try 블록에는 예외 발생 가능성이 있는 코드를 배치
            System.out.printf("%d / %d = %d", i, j, i / j);
        } catch (Exception e) {
            // catch 블록에는 try 블록에서 실제 예외가 발생 했을 경우
            // 실행할 코드를 작성
            System.out.println("0으로 나누면 안됩니다. 다른 정수를 입력하세요.");
            
        }

        System.out.println("프로그램 정상 종료");

        scan.close();


















    }
}
