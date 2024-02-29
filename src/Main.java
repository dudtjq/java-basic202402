import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("수를 입력하세요 : ");
        int number = scan.nextInt();

        boolean isPrimeNumber = true;
        for (int i = 2; i <number; i++) {

            if(number % i == 0){
                isPrimeNumber = false;
                break;
            }

        }

        if(!isPrimeNumber){
            System.out.println("소수가 아닙니다.");
        }else {
            System.out.println("소수 입니다.");
        }


    }
}