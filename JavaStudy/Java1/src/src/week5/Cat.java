package src.week5;

public class Cat {
    public void yaong() {
        System.out.println("야옹~");
    }

    public void groom() {
        System.out.println("예쁨~");
    }

    public void sleep() {
        System.out.println("음냐~");
    }
}

class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat();    // 첫번째 고양이 인스턴스 생성
        Cat c2 = new Cat();    // 두 번째 고양이 인스턴스 생성
        c1.yaong();        // 첫 고양이에게 일을 시킴
        c1.groom();        // 첫 고양이에게 일을 시킴
        c2.yaong();        // 두 번째 고양이에게 일을 시킴
        c2.groom();        // 두 번째 고양이에게 일을 시킴
        c1.sleep();
        c2.sleep();
    }
}



