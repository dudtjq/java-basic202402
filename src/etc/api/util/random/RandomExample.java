package etc.api.util.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {


        Random random = new Random();

        // 실수 난수 : 0.0 <= ~ < 1.0
        double d = random.nextDouble();
        System.out.println("d = " + d);

        // 정수 난수 : nextInt();
        int i = random.nextInt(); // 기본 범위 : int 의 전 범위 (약 -21억 ~ 약 21억)
        System.out.println("i = " + i);

        // 0 부터 5 까지 정수 난수 생성(끝앖이 미만으로 인식됨)
        int j = random.nextInt(6);
        System.out.println("j = " + j);

        // 10 ~ 100 정수 난수 생성
        int k = random.nextInt(91) + 10;
        System.out.println("k = " + k);

        boolean b = random.nextBoolean();
        System.out.println("b = " + b);


    }
}
