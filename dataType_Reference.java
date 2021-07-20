import java.util.Arrays;

public class dataType_Reference {
    public static void main(String[] args) {
        // write your code here
        String hello = "Hello sparta"; //문자
        System.out.println(hello);

        int[] intArray = new int[] {1,2,3,4,5}; // 같은 속성의 배열을 만든다.
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5];
        intEmptyArray[0] = 1;
        intEmptyArray[1] = 2;
        System.out.println(Arrays.toString(intEmptyArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length - 1]); // 길이는 4인데 겨울은 0,1,2,3번째임
    }
}
