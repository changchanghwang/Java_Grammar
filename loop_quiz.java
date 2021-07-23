public class loop_quiz {
    public static void main(String[] args) {
        //1번. 1~100까지 합
        int sum = 0;
        for(int i =0; i<100; i++){
            sum += (i+1);
        }
        System.out.println(sum);

        //2번. 5초부터 시작하는 카운트다운

        int b = 6;
        while(b < 7){
            b--;
            if (b == 0) {
                System.out.println(b);
                break;
            }
            System.out.println(b);
        }
        //1부터 30까지 홀수의합과 짝수의합을 구하고 각각 출력
        int sum1 = 0;
        int sum2 = 0;

        for(int a=0; a<30; a++){
            if(a%2 == 0){
                sum1 += (a+1);
            } else {
                sum2 += (a+1);
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
