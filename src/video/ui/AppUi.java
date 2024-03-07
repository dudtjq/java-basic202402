package video.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUi {

    private static Scanner scan = new Scanner(System.in);

    // 문자열을 리턴하는 스캐너
    public static String inputString(String message){
        System.out.print(message);
        return scan.nextLine();
    }

    // 정수를 리턴 하는 스캐너
    public static int inputIntger(String message){
        System.out.print(message);
        int number = 0;

        try {
            number = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("# 올바른 정수 입력값이 아닙니다.\n");
            scan.nextLine();
        }

        return number;
    }

    public static void makeLine(){
        System.out.println("=======================================");
    }

    // 시작 화면 출력
    public static void startScreen(){

        System.out.println("\n========= DVD 대여 관리 시스템 =========");
        System.out.println("### 1. 회원 관리 시스템");
        System.out.println("### 2. 대여 주문 관리 시스템");
        System.out.println("### 3. 영화 DVD 관리 시스템");
        System.out.println("### 4. 프로그램 종료");
        makeLine();

    }












}
