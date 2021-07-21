public class Operator {
    public static void main(String[] args) {
        //산술연산자
        int num1 = 10;
        int num2 = 5;
        String divide = "--------------------------------";

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //대입연산자
        System.out.println(divide);

        num1 += num2;
        System.out.println(num1); //15

        num1 -= num2;
        System.out.println(num1); //10

        num1 *= num2;
        System.out.println(num1); //50

        num1 /= num2;
        System.out.println(num1); //10

        num1 %= num2;
        System.out.println(num1); //0

        //관계연산자
        num1 = 10;
        int num3 = 10;
        System.out.println(divide);


        System.out.println(num1 > num2);
        System.out.println(num1 >= num3);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num3);
        System.out.println(num1 == num3);
        System.out.println(num1 != num2);

        //논리연산자


        boolean a = true;
        boolean b = false;
        System.out.println(divide);


        System.out.println(a && b);
        System.out.println(a && true);
        System.out.println(b || true);
        System.out.println(!b);


    }
}
