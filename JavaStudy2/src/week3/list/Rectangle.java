package week3.list;

public class Rectangle implements Measurable, Comparable<Rectangle> {

    private double width, height;

    @Override
    public String toString() {
        return String.format("Rectangle[width=%.1f, height=%.1f]",  width, height);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getMeasure() {
        return this.height * this.width;
    }

    @Override
    public int compareTo(Rectangle o) {
        if(o.getMeasure() > this.height * this.width)
            return -1;
        else if (o.getMeasure() < this.width * this.height)
            return 1;
        else
            return 0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


}