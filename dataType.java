public class dataType {
    public static void main(String[] args) {
        // write your code here

        short s = 1; // 2byte
       System.out.println(s);

        int a = 3; // 4byte 가장 많이 씀
        System.out.println(a);

        long b = 4; // 8byte
        System.out.println(b);

        float f = 5.5F; // 소수점 표현. 숫자 뒤에 F를 붙여줘야함.
        System.out.println(f);

        double d = 5.5; //소수점 큰범위
        System.out.println(d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        char c ='A'; //글자 1개만 표현.
        System.out.println(c);

        boolean fact = true;
        fact = false;
        System.out.println(fact);

        byte data = 'd';
        System.out.println(data);

    }
}