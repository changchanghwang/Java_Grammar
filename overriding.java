class Animal {
    String name;
    String color;

    public Animal(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println(name + "is crying");
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public  void cry(){
        System.out.println(name + " is barking");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal dog = new Dog ("coco");
        dog.cry();
    }
}

//오버로딩은 기존에 없는 새로운 변수를 정의. 같은 이름
//오버라이딩은 부모에 있는 함수를 자식이 똑같이 구현. but 내용이 다름