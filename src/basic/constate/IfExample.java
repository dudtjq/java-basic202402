package basic.constate;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("키를 입력하세요(cm) : ");
        int height = scan.nextInt();

        if(height >= 140){
            System.out.print("나이를 입력하세요 : ");
            int age = scan.nextInt();
            if(age >= 8){
                System.out.println("놀이기구 탑승이 가능합니다.");
            }else if(age >= 6){
                System.out.println("보호자 동반시 탑승이 가능합니다.");
            }else {
                System.out.println("나이가 6세 미만입니다.");
                System.out.println("놀이기구 탑승이 제한됩니다");
            }
        }else {
            System.out.println("키가 140cm 미만입니다.");
            System.out.println("놀이기구 탑승이 제한됩니다.");
        }

        scan.close();

        //System.out.print(age); 변수는 선언된 블록 내에서만 유효함
        System.out.println(height); // 요거는 출력 가능함
        


    }
}
