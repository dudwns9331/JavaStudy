package src.week7;

/**
 * ���⿡ �ִ� ��� �޼ҵ���� Measurable Ÿ���� ��ü���� ���� �� �ִ�. �Ѹ���� �����ִ� �޼ҵ���� Mesurable ��ü��
 * �����ϱ⸸ �ϸ� �����ٰ� �� �� �ִٴ°�!
 * 
 * @author �ȿ���
 *
 */
public class Rectangle implements Measurable, Comparable<Rectangle> {

	private double width, height;

	public Rectangle(double width, double height) {
		super();	// ���� �𸣰���.
		this.width = width;
		this.height = height;
	}

	public void setDimension(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public String toString() {
		return String.format("Rectangle [width=%.1f, height=%.1f]", width, height);
	}

	public double getMeasure() {
		return width * height;
	}

	/**
	 * ���⼭ o.getMeasure�� ���ؼ� ���� ��� width * height�� ���ϴµ� � ������ ��� �˱�?
	 * 
	 * (this) Rectangle�� ���ڷ� �־��� Rectangle�� ���Ͽ� �� ������, �� ū�� �Ǻ��ϰ� ������ ������, ������ 0��, ũ�� ����� �����ؾ� �մϴ�.
	 */

	public int compareTo(Rectangle o) {
		if (o.getMeasure() > width * height)
			return -1;
		else if (o.getMeasure() < width * height)
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
