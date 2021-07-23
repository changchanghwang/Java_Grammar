//매소드 이름 동일, 매개변수 갯수나 타입이 달라야함.


public class overloading {
    public static void main(String[] args) {

    }

    int add(int x, int y, int z){
        return x+y+z;
    }

    long add(int a, int b, long c){ //이때 int c 면 안됨.
        return a+b+c;
    }
}
