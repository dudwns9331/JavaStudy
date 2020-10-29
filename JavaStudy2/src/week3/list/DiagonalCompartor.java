package week3.list;

import java.util.Comparator;

public class DiagonalCompartor implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        double height1 = r1.getHeight();
        double height2 = r2.getHeight();

        double width1 = r1.getWidth();
        double width2 = r2.getWidth();

        double diagonal1 = Math.pow(width1, 2) + Math.pow(height1, 2);
        double diagonal2 = Math.pow(width2, 2) + Math.pow(height2, 2);

        if (Math.sqrt(diagonal1) > Math.sqrt(diagonal2))
            return 1;
        else if (Math.sqrt(diagonal1) < Math.sqrt(diagonal2))
            return -1;
        else
            return 0;
    }
}
