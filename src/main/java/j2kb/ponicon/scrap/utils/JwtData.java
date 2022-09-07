package j2kb.ponicon.scrap.utils;

import java.time.Duration;

public class JwtData {

    public static String JWT_SECRET_KEY = "tempSecretKeyItMustBeChange";
    // 밀리초 = 1/1000, 30분 = 1800초
    // Duration.ofMinutes(30).toMillis() = 1,800,000 = 30분을 밀리초로 환산한 것
    public static long ACCESS_TOKEN_EXPIRE_MILLIS = Duration.ofMinutes(30).toMillis();
    public static long REFRESH_TOKEN_EXPIRE_MILLIS = Duration.ofDays(30).toMillis();
    public static final int REFRESH_COOKIE_EXPIRE_SECOND = (int) Duration.ofDays(3).toSeconds();
    public static final int ACCESS_COOKIE_EXPIRE_SECOND = (int) Duration.ofMinutes(30).toSeconds();
}
