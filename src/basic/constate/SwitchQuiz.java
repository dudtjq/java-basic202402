package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
            /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요. + - * /
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약 사용자가 나눗셈을 선택했을때 0으로 나누려는 시도를 한다면
         연산 할 수 없는 입력값이라고 말하기
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("하나의 숫자를 입력해주세요 : ");
        int number1 = scan.nextInt();

        System.out.print("하나의 연산자를 입력해주세요 [+, -, * ,/] : ");
        String operator = scan.next();

        System.out.print("또 하나의 숫자를 입력해주세요 : ");
        int number2 = scan.nextInt();

        int result = 0;
        boolean flag = false;
        switch (operator) {

            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "/":
                if(number1 == 0 || number2 == 0){
                    System.out.println("0으로는 나눌수가 없습니다.");
                    flag = true;
                    break;
                }else {
                    result = number1 / number2;
                    break;
                }

            default:
                System.out.println("잘못된 연산자 입니다.");

        }

        // flag 가 false 일때만 출력
        if(!flag){
            System.out.println(number1 + " " + operator + " " +  number2 + " = " + result);
        }




    }
}
