package question2;

public class Rectangle {
	// data members
	int length;
	int breadth;

	// constructor
	Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	// method to calculate area
	double getArea() {
		return (double) length * (double) breadth;
	}

	// method to calculate perimeter
	double getPerimeter() {
		return (double) (2 * (length + breadth));
	}
}

class Square extends Rectangle {
	// constructor
	Square(int s) {
		super(s, s);
	}

	// method to calculate area
	double getArea() {
		return (double) length * (double) breadth;
	}

	// method to calculate perimeter
	double getPerimeter() {
		return (double) (4 * length);
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 4);
		System.out.println("Area of Rectangle: " + rec.getArea());
		System.out.println("Perimeter of Rectangle: " + rec.getPerimeter());

		Square sq = new Square(5);
		System.out.println("Area of Square: " + sq.getArea());
		System.out.println("Perimeter of Square: " + sq.getPerimeter());
	}
}
