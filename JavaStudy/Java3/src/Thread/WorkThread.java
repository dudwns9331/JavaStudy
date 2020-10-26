package Thread;

public class WorkThread extends Thread{
    public WorkThread(ThreadGroup threadGroup, String threadName) {
        super(threadGroup, threadName); // 스레드 클래스의 생성자에는 그룹과 이름을 지정할 수 있는 생성자가 있다.
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted"); // 인터럽트 당한 스레드의 이름 출력
                break;
            }
        }

        System.out.println(getName() + " 종료됨");
    }
}
