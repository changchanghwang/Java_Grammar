import pkg.ModifierTest;

class Child extends ModifierTest {
    void callParentProtected(){
        System.out.println("call my parent's protected mothod");
        super.messageProtected();
    }
}

public class access_modifier {
    public static void main(String[] args) {
        //멤버 변수/함수 혹은 클래스 앞에붙어 사용. 외부 접근 제한
        //private : 같은 클래스 내에서만 접근

        //default: 같은 패키지 내에서만 접근

        //protected: 같은 패키지 내에서, 다른패키지의 자손클래스에서 접근

        //public : 접근제한 x
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
//        modifierTest.messageInside(); 프라이빗 출력 실패. 다른 패키지라
//        modifierTest.messageProtected(); 프로택티드 출력 실패. 다른 패키지라
//        modifierTest.messagePackagePrivate(); void로만 선언하면 프라이빗이라서 실패.
        Child child = new Child();
        child.callParentProtected();
    }
}
