package j2kb.ponicon.scrap.response;

import lombok.Getter;

@Getter
public enum BaseExceptionStatus {

    TEST_ERROR(40401, "실패했어요"),
    SERVER_INTENER_ERROR(40001, "서버 내부적인 에러"),

    FAIL_ENCRYPT_PASSWORD(40000, "비밀번호 암호화에 실패했습니다"),
    DUPULICATE_USERNAME(4000, "아이디가 중복됩니다"),
    LOGIN_USER_NOT_EXIST(33, "해당하는 아이디 또는 비밀번호가 없습니다")
    ;

    private final int code;
    private final String message;

    private BaseExceptionStatus(int code, String msg){
        this.code = code;
        this.message = msg;
    }
}
