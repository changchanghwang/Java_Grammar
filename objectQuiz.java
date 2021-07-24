class Human{
    String man;
    int age;
    int speed;
    int x,y;


    void information(String man, int age, int speed, int x, int y){
        printType();
        printAge();
        printSpeed();
        printLocation();
        this.man = man;
        this.age = age;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
    void walk(int x, int y){
        printLocation();
        System.out.println("걷습니다.");
        this.x = x;
        this.y = y;
        printLocation();
    }
    public void printType(){
        System.out.println("타입 : ["+ man +"]");
    }
    public void printAge(){
        System.out.println("나이 : ["+ age +"]");
    }
    public void printSpeed(){
        System.out.println("기본 속도 : ["+ speed +"]");
    }
    public void printLocation(){
        System.out.println("현재위치 (" +x + ", " + y + ")");
    }
}

class Children extends Human{
    String man = "child";
    int age = 15;
    int speed = 5;
    int x;
    int y;

    void information(){
        printType();
        printAge();
        printSpeed();
        printLocation();

    }
    public void printType(){
        System.out.println("타입 : ["+ man +"]");
    }
    public void printAge(){
        System.out.println("나이 : ["+ age +"]");
    }
    public void printSpeed(){
        System.out.println("기본 속도 : ["+ speed +"]");
    }
    public void printLocation(){
        System.out.println("현재위치 (" +x + ", " + y + ")");
    }
}

class Parent extends Human{
    String man = "parent";
    int age = 45;
    int speed = 3;
    int x;
    int y;

    void information(){
        printType();
        printAge();
        printSpeed();
        printLocation();
    }
    public void printType(){
        System.out.println("타입 : ["+ man +"]");
    }
    public void printAge(){
        System.out.println("나이 : ["+ age +"]");
    }
    public void printSpeed(){
        System.out.println("기본 속도 : ["+ speed +"]");
    }
    public void printLocation(){
        System.out.println("현재위치 (" +x + ", " + y + ")");
    }
}

class GrandParent extends Human {
    String man = "GrandParent";
    int age = 75;
    int speed = 1;
    int x;
    int y;

    void information(){
        printType();
        printAge();
        printSpeed();
        printLocation();
    }
    public void printType(){
        System.out.println("타입 : ["+ man +"]");
    }
    public void printAge(){
        System.out.println("나이 : ["+ age +"]");
    }
    public void printSpeed(){
        System.out.println("기본 속도 : ["+ speed +"]");
    }
    public void printLocation(){
        System.out.println("현재위치 (" +x + ", " + y + ")");
    }
}

public class objectQuiz {
    public static void main(String[] args) {
        Children children = new Children();
        System.out.println("자식");
        children.information();
        System.out.println("----------------------------------------");
        Parent parent = new Parent();
        System.out.println("부모");
        parent.information();
        System.out.println("----------------------------------------");
        GrandParent grandparent = new GrandParent();
        System.out.println("조부모");
        grandparent.information();
        System.out.println("----------------------------------------");
        Human human = new Human();
        human.walk(1, 1);
        children.information();
        parent.information();
        grandparent.information();
    }
}
