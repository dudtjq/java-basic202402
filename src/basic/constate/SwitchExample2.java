package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요 : ");
        int score = scan.nextInt();
        
        // switch의 기준값은 정수 혹은 문자열만 가능함
        // 연산의 결과값도 기준값으로 사용이 가능함
        switch (score / 10){

                case 10:
                    if(score > 100){
                        System.out.println("잘못된 점수 입니다.");
                        break;
                }
                case  9:
                System.out.println("A 학점 입니다.");
                break;

            case 8:
                System.out.println("B 학점 입니다.");
                break;

            case 7:

                System.out.println("C 학점 입니다.");
                break;
            case 6:

                System.out.println("D 학점 입니다.");
                break;

            default:
                if(score > 100 || score < 0){
                    System.out.println("점수를 잘못 입력 하였습니다.");
                }else {
                    System.out.println("F 학점 입니다.");
                }


            }

            scan.close();
            
        }

        
        
    }
