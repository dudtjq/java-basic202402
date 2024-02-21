package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {
    public static void main(String[] args) {

        /*
         1. String 배열을 생성하세요. (foods)
         크기는 넉넉하게 50개로 지정하겠습니다.
         
         2. 사용자에게 음식 이름을 입력받아서 배열에
          삽입해 주세요.
          사용자가 음식 입력창에 '배불러' 라고 작성하면
          입력을 종료해 주세요.
          
         3. 입력이 종료되면 사용자가 입력한 음식을
         가로로 출력해 주세요. (null은 출력하지 마세요.)
         
          추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
        */

        Scanner scan = new Scanner(System.in);
        
        String[] foods = new String[50];
        
        outer : for(int i = 0; i < foods.length; i++){

            System.out.print("음식을 입력해주세요 : ");
            String food = scan.nextLine();
            
            if(food.equals("배불러")){
                System.out.println("입력을 종료 합니다.");
                break;
            }

            for(String f : foods){
                if (f == null) {
                    break;
                }if(food.equals(f)){
                    System.out.println("이미 존재하는 음식입니다.");
                    // for문에서 continue는 증감식이 동작합니다.
                    // 우리의 의도는 이번회차가 무효인 거지,
                    // 건너 뛰려는 것은 아니기 때문에 미리 제어변수
                    // i의 값을 하나 감소시켜 놓는다
                    // i--; 를 안하게 되면 i++;이 진행이되어 건너 뛰게 됨
                    i--; 
                    continue outer;
                }
            }

            foods[i] = food;


                        
        }

       System.out.print("사용자가 입력한 음식 : ");

        for(String f : foods){
            if(f == null){
                break;
            }
            System.out.print(f + " ");
        }
        
        












    }
}
