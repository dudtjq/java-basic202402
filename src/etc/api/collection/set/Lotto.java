package etc.api.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

    public static Random r = new Random();

    public static int prize1 = 0; // 1등 당첨된 수 세는 변수
    public static int prize2 = 0; // 2등 당첨된 수 세는 변수
    public static int prize3 = 0; // 3등 당첨된 수 세는 변수
    public static int prize4 = 0; // 4등 당첨된 수 세는 변수
    public static int prize5 = 0; // 5등 당첨된 수 세는 변수
    public static int failCtn = 0; // 꽝


    public static Set<Integer> createLotto(){
         /*
         - 1~45 범위의 난수 6개를 생성하셔서
          컬렉션 자료형에 모아서 리턴해 주세요.
          무엇을 쓰든 상관하지 않겠습니다.
          중복이 발생하면 안됩니다.
     */
        Set<Integer> lottoNumber = new HashSet<>();

        while (lottoNumber.size() < 6){

            int number = r.nextInt(45) + 1;
            lottoNumber.add(number);
        }
        return lottoNumber;


    }


    // 보너스 번호를 생성하는 메서드
    public static int createBonus(Set<Integer> win){

        while (true){
           int bonus = r.nextInt(45) + 1;
           if(win.contains(bonus)){
               return bonus;
           }
        }

    }

    // 당첨 등수를 알려주는 메서드
    public static void lottoWin(Set<Integer> winNumber, Set<Integer> myLotto, int bonus){
          /*
         매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
         내 로또 번호와 당첨번호를 비교하여
         일치하는 횟수를 세 주신 후 등수를 판단하세요.
         판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
         6개 일치 -> 1등
         5개 일치 + 보너스번호 일치 -> 2등
         5개 일치 -> 3등
         4개 일치 -> 4등
         3개 일치 -> 5등
         나머지 -> 꽝
         */

        int count = 0;
        for (int n : myLotto) {
            if(winNumber.contains(n)){
                count++;
            }
        }

        if(count == 6){
            prize1++;
        }else if(count == 5){
            if(myLotto.contains(bonus)){
                prize2++;
            }else {
                prize3++;
            }
        }else if(count == 4){
            prize4++;
        }else if(count == 3){
            prize5++;
        }else {
            failCtn++;
        }



    }


    public static void main(String[] args) {

        // 당첨 번호를 고정하자.
        Set<Integer> lotto = createLotto();

        // 보너스 번호도 하나 고정하자.
        int bonus = createBonus(lotto);

        // 반복문 로직 시작
        int paper = 0;
        long cost = 0;

        while (true){

            // 나의 로또 종이
            Set<Integer> myLotto = createLotto();

            // 반복문이 돌아갈때 마다 추가적으로 계산
            paper++; cost += 5000;

            // 당첨번호 확인
            lottoWin(lotto, myLotto, bonus);

            if(prize1 == 1){
                System.out.println("축하합니다 1등에 당첨이 되었습니다!");
                System.out.printf("누적 당첨 횟수 = 2등 : %d회, 3등 : %d회, 4등 : %d회, 5등 : %d회, 6등 : %d회,\n"
                        , prize2, prize3, prize4, prize5, failCtn);
                System.out.println("로또 구입한 장수 : " + paper + "장");
                System.out.println("로또에 구입한 돈 : " + cost + "원");
                break;
            }else {
                System.out.println("아직도 " + paper + "장 구매 중..");
            }


        }


    }
}
