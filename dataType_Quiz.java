import java.util.Arrays;

public class dataType_Quiz {
    public static void main(String[] args) {
        char a = 's';
        int b = 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a + "\n" + b); //""는 문자로 출력, \n은 행 바꾸기

        int[] array3 = new int[]{10, 20, 30};  //선언과 동시에 할당.
        System.out.println(array3[2]);
        System.out.println(array3[array3.length -1]);
    }
}
