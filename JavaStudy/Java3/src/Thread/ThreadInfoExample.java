package Thread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread(); // 자동 저장 스레드 객체
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);                     // 데몬 스레드 지정
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();      // 스레드의 내용 가져옴, Map형태, <Thread, StackTraceElement[] 배열>
        Set<Thread> threads = map.keySet();

        for(Thread thread : threads) {
            System.out.println("Name : " + thread.getName() + ((thread.isDaemon()) ? "(데몬)" : "(주)"));
            System.out.println("\t" + "소속그룹 : " + thread.getThreadGroup().getName());       // 스레드 소속그룹의 이름에 대한 정보를 가져옴.
            System.out.println();
        }
    }
}
