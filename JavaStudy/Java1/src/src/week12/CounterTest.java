package src.week12;

public class CounterTest {
    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.setCount(8);

        counter.tick();
        System.out.println("카운트 값 = " + counter.getCount());
        counter.tick();
        System.out.println("카운트 값 = " + counter.getCount());
        counter.tick();
        System.out.println("카운트 값 = " + counter.getCount());
        counter.tick();
        System.out.println("카운트 값 = " + counter.getCount());
        System.out.println();

        counter.setCount(12);
        System.out.println("카운터에 12를 설정하려고 시도함");
        System.out.println("카운터 값 = " + counter.getCount());

        counter.setCount(5);
        System.out.println("카운터에 5를 설정함");
        System.out.println("카운터 값 = " + counter.getCount());
    }
}
