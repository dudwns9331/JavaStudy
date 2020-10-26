package Threads;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * 원 한 개가 그려지는 컴포넌트.
 * 원은 무작위 색깔로 채워진다.
 * 컴포넌트가 새로 그려질 때마다 새 원이 그려진다.
 */
public class CircleComponent extends JComponent {

    private static final long serialVersionUID = 1L;

    static final int WIDTH = 150;	// 컴포넌트 크기.
    static final int HEIGHT = 150;

    final int CIRCLE_WIDTH = 100;	// 원 크기.
    final int CIRCLE_HEIGHT = 100;

    private Random r = new Random();

    public CircleComponent() {
        super();
        // 배치관리자는 컴포넌트의 preferredSize를 최대한 존중하여 자리를 배치함.
        // JComponent의 기본preferredSize는 0이므로 아래 문장을 생략하면 컴포넌트가 화면에 보이지 않음.
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle1 = new Ellipse2D.Double(
                (WIDTH-CIRCLE_WIDTH)/2.0, (HEIGHT-CIRCLE_HEIGHT)/2.0,
                CIRCLE_WIDTH, CIRCLE_HEIGHT);
        // 무작위로 RGB 값을 정함.
        g2.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));
        // Graphics는 shape을 그릴 수 있다. draw, fill 메소드의 파라미터 타입이 Shape이다.
        // Shape은 인퍼페이스 이름이다.
        // Ellipse2D.Double은 Shape이다.
        g2.fill(circle1);
    }

    public static void main(String[] args) {
        // CircleComponent 두 개를 만들어 화면에 보이게 함.
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(new CircleComponent());
        frame.add(panel);
        panel.add(new CircleComponent());
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame = new JFrame();
        frame.setSize(200,  200);
        frame.setVisible(true);
    }
}