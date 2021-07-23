public class loop {
    public static void main(String[] args) {
        String next ="----------------------------------------------";
        //for문 변수선언, 조건까지 ()안에
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += (i +1);
        }
        System.out.println(sum);
        System.out.println(next);

        //for-each문 배열이 있는경우
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day: days){
            System.out.println(day);
        }
        System.out.println(next);

        //while문 변수선언, 조건은 문장안에
        int a =0;
        int sumA =0;
        while (a < 10){
            sumA += (a+1);
            a++;
        }
        System.out.println(sumA);
        System.out.println(next);

        //break break문을 만나면 바로 while문 탈출
        int b =0;
        int sumB =0;
        while (b < 10) {
            sumB += (b +1);
            b++;
            if (b == 5) {
                break;
            }
        }
        System.out.println(sumB);
        System.out.println(next);

        //continue continue를 만나면 해당 반복부분만 탈출, 다음번 반복 이어서 수행
        int c = 0;
        int sumC = 0;
        while (c < 10){
            if (c == 4) {
                c++;
                continue;
            }
            sumC += (c +1);
            c++;
            System.out.println(c);
        }
        System.out.println(sumC);
        System.out.println(next);

        //do-while 조건확인보다 수행부터 함.
        int d = 0;
        int sumD = 0;
        do {
            sumD += (d + 1);
            d++;
        } while (d < 10);
        System.out.println(sumD);

    }
}
