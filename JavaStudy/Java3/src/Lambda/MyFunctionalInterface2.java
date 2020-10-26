package Lambda;

@FunctionalInterface
public interface MyFunctionalInterface2 {
    public void method();
//    public void otherMethod(); 컴파일 오류 함수형 인터페이스는 하나의 추상 메소드만 가질 수 있다.
}