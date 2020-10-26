package Generics;

import java.awt.*;

class Box<T> {

    private T box;

    public Box(T t) {
        this.box = t;
    }

    public T getContents() {
        return box;
    }

    public void setContents(T t) {
        this.box = t;
    }

}

public class BoxDemo {
    public static void main(String[] args) {

        Box<String> s = new Box<>("겨울");
        System.out.println(s.getContents());
        s.setContents("눈");
        System.out.println(s.getContents());

        Box<Integer> i = new Box<>(10);
        System.out.println(i.getContents() + 3);
        i.setContents(20);
        System.out.println(i.getContents() + 2);

        Box<Rectangle> r = new Box<>(new Rectangle(20, 30));
        System.out.println(r.getContents().getSize());
        r.setContents(new Rectangle(200, 300));
        System.out.println(r.getContents().getSize());
    }
}
