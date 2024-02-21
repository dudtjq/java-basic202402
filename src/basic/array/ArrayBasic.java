package basic.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // # 배열 Array
        // 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형

        // 1. 배열 변수 선언
        int[] arr; // 이 방식으로 주로 선언
        int arr2[]; // c style

        // 2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
        // 생성 할 때 배열의 크기를 지정
        arr = new int[5];

        // 3. 배열의 초기화 - 배열 내부에 실제 값들을 저장
        // 배열의 초기화는 인덱스를 이용
        // 인덱스 : 밴배열 내부의 위치를 지정 할 수 있는 값
        // 인덱스는 0번부터 시작 1씩 순차적 증가

        arr[0] = 65;
        arr[1] = 88;
        arr[2] = arr[0];
        arr[3] = (int) 3.14;
        //arr[4] = "문자열"; (X)
        arr[4] = 100;
     //   arr[5] = 88; (x) index 범위를 초과

        // 4. 배열의 총 크기(길이) -> 배열 변수명.length
        System.out.println(arr.length);

        // 5. 배열에 저장된 값을 참조(사용)하는 법 -> 인덱스를 활용
        System.out.println("배열의 1번째 데이터" + arr[0]);
        System.out.println("배열의 1번째 데이터" + arr[1]);
        System.out.println("배열의 1번째 데이터" + arr[2]);
        System.out.println("배열의 1번째 데이터" + arr[3]);
        System.out.println("배열의 1번째 데이터" + arr[4]);

        System.out.println("-------------------------");

        // 6. 배열의 반복문 처리
        // 배열은 인덱스를 제어 변수로 활용하여 쉽게 반복문 처리
        for(int idx = 0; idx < arr.length; idx++){
            System.out.printf("배열의 %d번째 데이터 : %d\n", idx+1, arr[idx]);
        }

        // 7. 배열 내부의 요소값을 문자열 형태로 한눈에 확인하기
        // 배열 변수에는 배열의 주소가 들어가 있음
        System.out.println("arr = " + Arrays.toString(arr));

        // 8. 배열은 선언과 생성이 동시에 가능
        double[] dArr = new double[3];
        String[] sArr = new String[4];
        byte[] bArr = new byte[10];

        // 배열은 생성 됨과 동시에 각 타입의 기본값으로 자동 초기화 된다.
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(bArr));

        // 9. 배열의 생성과 동시에 초기화
        char[] letters = new char[] {'A', 'B', 'C', 'D'};
        System.out.println(Arrays.toString(letters));
        
        // 선언과 동시에 초기화를 할때 딱 한번만 가능한 문법
        // 배열은 크기가 고정이기 때문에 늘어나거나 줄어들 수 없음
        // 만약 뱅녈의 크기를 늘리거나 줄이고 싶다면
        // 기존의 배열을 조작하는 것이 아니라 새롭게 생성해야함

        String[] names = {"홍길동", "김철수", "박영희"};
        // names = {"홍길동", "김철수", "박영희", "김뽀삐"}; (X)
        names = new String[] {"홍길동", "김철수", "박영희", "김뽀삐"};// (O)
        System.out.println(Arrays.toString(names));










    }
}
