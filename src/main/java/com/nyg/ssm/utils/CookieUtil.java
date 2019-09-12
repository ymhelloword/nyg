package com.nyg.ssm.utils;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
/**
 * @Author zjl
 * @Date 2019/5/28 19:07
 */
public class CookieUtil {
    public static Cookie createCookie(String cookieName,String value,int day,String path){
        Cookie cookie = new Cookie(cookieName,value);
        cookie.setMaxAge(day*24*60*60);
        cookie.setPath(path);
        return cookie;
    }
    public static String getCookiVauleByName(HttpServletRequest request, String cookieName){
        Cookie []cookie = request.getCookies();
        if (cookie!=null) {
            for( Cookie cookie1 : cookie ) {
                if ( cookieName.equals(cookie1.getName( )) ) {
                    return cookie1.getValue( );
                }
            }
        }
        return null ;
    }
}
