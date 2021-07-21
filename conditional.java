public class conditional {
    public static void main(String[] args) {
        int check = 100;
        int num1 = 150;
        String divide = "--------------------------------";

        //if문

        if( num1 > check){
            System.out.println("100보다 큰 수 입니다.");
        } else if(num1 >= 50){
            System.out.println("50이상인 수입니다. 100보다 작거나 같습니다.");
        }
        System.out.println(divide);


        //switch문
        char score = 'B';
        switch (score){
            case 'A':
                System.out.println("A등급 축하합니다.");
                break; //case A까지 하고 스위치문 탈출. 없을시 아래문구까지 다나옴.
            case 'B':
                System.out.println("B등급");
                break;
            case 'C':
                System.out.println("C등급");
            default:
                System.out.println("C보다 아래 등급입니다.");
        }

        System.out.println(divide);

        //삼항연산자

        int a = 11;
        String result = (a < 10) ?//왼쪽 조건이 True이면 : 앞에걸 작용
                "10보다 작습니다." : "10보다 큽니다.";
        System.out.println(result);


    }
}
