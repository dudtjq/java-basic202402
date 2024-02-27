package oop.obj_arr;

public class Score {
  /*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.

     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */

    private String name;
    private int korean;
    private int english;
    private int math;
    private int total;
    private double avg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    /*
    public void setTotal() {
        // 이미 국어 영어 수학 점수가 세팅이 완료 되었다고 가정
        this.total = this.korean + this.english + this.math;
    }
    */

    public double getAvg() {
        return avg;
    }
/*
    public void setAvg() {
        this.avg = this.total / 3.0;
    }
*/

    //총점과 평균을 한번에 계산해서 세팅하는 메서드
    public void setTotalAndAvg(){
        this.total = this.korean + this.english + this.math;
        this.avg = this.total / 3.0;
    }

    Score(){

    }

    public Score(String name, int korean, int english, int math, int total, double avg) {

        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.total = total;
        this.avg = avg;

    }

    // 점수 유효성 검증
    public boolean isValidateScore(int score){

        if(score < 0 || score > 100){
            System.out.println("0 ~ 100점 사이의 점수를 입력해주세요.");
            return false;
        }

        return true;


    }


    void scoreInfo(){
        System.out.printf("이름 : %s, 국어 : %d점, 영어 : %d점, 수학 : %d점\n총점 : %d점, 평균 : %.1f점\n"
        , this.name, this.korean, this.english, this.math, this.total, this.avg);

    }




}
