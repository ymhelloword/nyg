package contollerTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author zjl
 * @Date 2019/8/26 16:22
 */
public class Test {
    public static final Random RANDOM = new Random();
    public static void main(String[] args) throws IOException {
        Test test = new Test();
        String code="";
        String a1="";
        for ( int i=1;i<=4;i++ ){
            int a = RANDOM.nextInt(3)+1;
            switch (a){
                case 1:code = test.createRandom();break;
                case 4:code = test.createRandom();break;
                case 2:code = test.createLowercase();break;
                case 3:code = test.createUppercase();break;
            }
            a1 =a1 + code;
        }
        System.out.println(a1) ;
        System.out.print("输入验证码:") ;
        Scanner in = new Scanner(System.in);
        String b = in.next();
        if ( a1.equals(b) ){
            System.out.println("输入正确") ;
        }else {
            System.out.println("输入错误！") ;
        }
    }
    public String createUppercase(){
        char a = (char )( RANDOM.nextInt(26)+65);
        return String.valueOf(a);

    }
    public String createLowercase(){
        char a = (char )( RANDOM.nextInt(26)+97);
        return String.valueOf(a);
    }
    public String createRandom(){
        int a = RANDOM.nextInt(9);
        return String.valueOf(a);
    }
}
