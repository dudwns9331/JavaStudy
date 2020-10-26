package Lambda;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerFeild = 20;

        void method() {

            int innerFeild = 25;
            int outterField = 15;

            //람다식
            MyFunctionalInterface2 fi = () -> {

              System.out.println("outterField : " + outterField);
              System.out.println("outterField : " + UsingThis.this.outterField + "\n");

              System.out.println("innerField : " + innerFeild);
              System.out.println("innerField : " + this.innerFeild);
            };

            fi.method();
        }
    }
}
