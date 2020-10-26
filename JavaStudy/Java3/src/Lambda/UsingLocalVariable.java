package Lambda;

public class UsingLocalVariable {
    void method(int arg) {      // arg는 fanal 특성을 가짐
        int localVar = 40;      // localVal는 final 특성을 가짐

         // arg = 31;
         // localVar = 40;

        MyFunctionalInterface2 fi = () -> {
          System.out.println("arg : " + arg);
          System.out.println("localVar : " + localVar + "\n");
        };

        fi.method();
    }
}
