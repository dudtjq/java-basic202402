package oop.fianal_.constant;

public class Earth {

    /*
     # 상수 (constant)

     - 상수는 고정된 불변의 값입니다. 따라서 어디에서 접근을 하더라도
      같은 값이 나와야 하며, 값의 변경 또한 불가능해야 합니다.

     - 따라서 자바에서는 상수를 선언할 때 static, final을 동시에 사용합니다.
     */

    // static final을 동시에 사용하게되면 변수를 대문자로 작성해야함!!
    static final double RADIUS  = 6400;

    static final double SURFACE_AREA;


    // Math.PI를 사용하면 원주율을 얻을 수 있음
    // 여기서 PI도 선언부로 가보면 static final 로 되어있음(상수)
    static {
        SURFACE_AREA = RADIUS * RADIUS  * 4 * Math.PI;
    }



}
