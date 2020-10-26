package src.week13;
import javax.swing.*;
import java.awt.*;

public class RectanglesView extends JFrame {
    private static final long serialVersionUID = 1L;
    // 상태변수 선언 및 초기화
    Rectangle r1 = new Rectangle(50, 50, 100, 100);
    Rectangle r2 = new Rectangle(100, 100, 70, 70);
    Rectangle r3 = new Rectangle(300, 50, 100, 100);
    Rectangle r4 = new Rectangle(350, 100, 70, 70);
    Rectangle intersection, union;     // 상태변수 선언

    // 구성자
    RectanglesView() {
        super("Rectangles");       // 창 제목 설정
        setSize(500, 250);                    // 창 크기 설정
        // intersection과 union을 구함
        intersection = r1.intersection(r2);
        union = r3.union(r4);;
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("intersection: " + intersection);
        System.out.println();
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);
        System.out.println("union: " + union);
    }



    public void paint(Graphics g) {
        // r1, r2를 그림 (draw Rectangle)
        g.drawRect(r1.x, r1.y, r1.width, r1.height);
        g.drawRect(r2.x, r2.y, r2.width, r2.height);
        // Color 구성자 파라미터: red, green, blue, 투명도 (0~255)
        g.setColor(new Color(100, 100, 100, 100));
        g.fillRect(intersection.x, intersection.y, intersection.width, intersection.height); // fill Rectangle
        g.setColor(Color.BLACK);
        g.drawRect(intersection.x, intersection.y, intersection.width, intersection.height);
        g.drawRect(r3.x, r3.y, r3.width, r3.height);
        g.drawRect(r4.x, r4.y, r4.width, r4.height);
        g.setColor(new Color(100, 100, 100, 100));
        g.fillRect(union.x, union.y, union.width, union.height);
        g.setColor(Color.BLACK);
        g.drawRect(union.x, union.y, union.width, union.height);
    }



    public static void main(String[] args) {
        JFrame f = new RectanglesView();
        f.setVisible(true);
    }
}