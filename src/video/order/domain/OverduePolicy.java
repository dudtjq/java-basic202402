package video.order.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OverduePolicy {

    private static final int BASE_OVERDUE_CHARGE = 300;

    
    // 연체 일자 계산
    public static int calculateOverdueDay(Order order){

        // 현재 날짜
        LocalDate now = LocalDate.now();
        // 대여 주문 당시 세팅된 반납 날짜
        LocalDate returnDate = order.getReturnDate();

        if(returnDate.isBefore(now)){// 반납 날짜가 오늘보다 이르다 -> 반납이 늦음(연체)

            return (int) ChronoUnit.DAYS.between(returnDate, now);

        }else {
            // 연체 x
            return 0;
        }

    }
    
    
    // 연체로 계산
    public static int calculateOverdueCharge(Order order){

        int overdueDay = calculateOverdueDay(order);

        return overdueDay * BASE_OVERDUE_CHARGE;

    }




















}
