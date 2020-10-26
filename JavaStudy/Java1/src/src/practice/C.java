package src.practice;

class A{
    public A(int x) {
        System.out.println("A" + x );
    }

}

class B extends A {
    public B(int x) {
        super(x);
        System.out.println("B" + x);
    }
}


public class C {
    public static void main(String[] args) {
        B b = new B(5);
    }
}
