public class variable_constant {
    public static void main(String[] args) {
        // write your code here
        int number = 5; //숫자 int
        System.out.println(number);

        String sparta = "Hello Sparta"; //문자 String
        System.out.println(sparta);

        int number2 = 4;
        System.out.println(number + number2); //덧셈가능

        final int finalNumber = 1; //상수 final 이거 이후에 바꿀수 없음.
        System.out.println(finalNumber);

        sparta = "Good Night"; //변수라 변경가능
        System.out.println(sparta);
    }
}