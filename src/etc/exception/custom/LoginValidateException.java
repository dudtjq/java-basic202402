package etc.exception.custom;

public class LoginValidateException extends Exception{

    // 기본 생성자
    public LoginValidateException() {}

    // 커스텀 여러 메세지를 받는 생성자
    public LoginValidateException(String message) {
        super(message);
    }




}
