class Human {
    String name;
    int age;
    int speed;
    int x, y;

    public Human(String name, int age, int speed, int x, int y) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
    public Human(String name, int age, int speed){
        this(name, age, speed, 0, 0);
    }
    public String getLocation(){
        return"("+x+","+y+")";
    }
    protected void printWhoAmI() {
        System.out.println("My name is " + name + ". " + age + " aged.");
    }
}

interface Walkable {
    void walk(int x, int y);
}

interface Runnable {
    void run(int x, int y);
}

interface Swimmable {
    void swim(int x, int y);
}

class GrandParent extends Human implements Walkable {
    public GrandParent(String name, int age) {
        super(name, age, 1);
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walked to " + getLocation());
    }
}

class Child extends Human implements Walkable, Runnable, Swimmable{
    public Child(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void swim(int x, int y) {
        printWhoAmI();
        System.out.println("swimming speed: " + (speed + 1));
        this.x = x;
        this.y = y;
        System.out.println("Swum to " + getLocation());
    }

    @Override
    public void run(int x, int y) {
        printWhoAmI();
        System.out.println("run speed: " + (speed + +2));
        this.x = x;
        this.y = y;
        System.out.println("Ran to " + getLocation());
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walked to " + getLocation());
    }
}

class Parent extends Human implements Walkable, Runnable{
    public Parent(String name, int age) {
        super(name, age, 3);
    }

    @Override
    public void run(int x, int y) {
        printWhoAmI();
        System.out.println("run speed: " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("Ran to " + getLocation());
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walked to " + getLocation());
    }
}


public class objectQuiz {
    public static void main(String[] args) {
        Human grandParent = new GrandParent("할아버지", 70);
        Human parent = new Parent("엄마", 50);
        Human child = new Child("나", 20);

        Human[] humans = { grandParent, parent, child };
        for (Human human : humans) {
            System.out.println(human.name + ", 나이: " + human.age + ", 속도: " + human.speed + ", 장소: " + human
                    .getLocation());
        }
        System.out.println("<활동 시작>");
        for (Human human : humans) {
            if (human instanceof Walkable) {
                ((Walkable) human).walk(1, 1);
                System.out.println(" - - - - - - ");
            }
            if (human instanceof Runnable) {
                ((Runnable) human).run(2, 2);
                System.out.println(" - - - - - - ");
            }
            if (human instanceof Swimmable) {
                ((Swimmable) human).swim(3, -1);
                System.out.println(" - - - - - - ");
            }
        }
    }
}
