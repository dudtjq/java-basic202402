package etc.exception.basic;

public class FinallyExample {

    public static void main(String[] args) {
        
        String[] pets = {"강아지", "고양이", "짹짹이"};

        for (int i = 0; i <= pets.length; i++) {

            try {
                System.out.println(pets[i] + " 키우고 싶다~");
            } catch (Exception e) {
                System.out.println("애완동물의 정보가 없습니다.");
            } finally {
                // finally 블록에는 예외 발생 여부와 상관없이
                // 항상 실행 하고 싶은 문장을 작성 합니다.
                // 객체를 반납하거나 메모리에서 해제팔 때 (close()) finally
                // 를 주로 사용

                System.out.println("아무튼 실행 되는 문장");
                System.out.println("-----------------------");
                
            }

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
