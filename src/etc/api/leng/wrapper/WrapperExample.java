package etc.api.leng.wrapper;

public class WrapperExample {

    public static void main(String[] args) {

        int a = 100;
        boolean b = false;
        char c = 'A';
        double d = 3.14;

        // boxing 기본 데이터 타입을 객체 타입으로 변환 하는 과정
        //  -> deprecated
        // Integer v1 = new Integer(a);
        // Boolean v2 = new Boolean(b);

        //unboxing : 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어
        // 내는 과정 -> deprecated
        // int i = v1.intValue(); -> deprecated

        // autoboxing : 기본 타입을 자동으로 객체형으로 변환
        Integer v1 = a;
        Boolean v2 = false;
        Character v3 = c;
        Double v4 = d;

        //autounboxing : 객체 포장을 기본형으로 자동 해제 가능
        int i = v1;
        double d2 = v4;
        boolean b3 = false;
        char c4 = c;

        // Autoboxing 이후에 wrapper 클래스는 문자열을 기본형으로 변환 하는
        // 데 많이 사용함
        int i1 = Integer.parseInt("54");
        double v = Double.parseDouble("3.14");

        // 해당 타입으로 변환 할 수 없는 문자열을 시도 했을 경우
        // NumberFarmatException 예외가 발생
        Integer.parseInt("24.36");


    }

}
