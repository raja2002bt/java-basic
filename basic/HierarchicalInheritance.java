package basic;

class Shape {
	float length, breadth, radius;
}

class rect extends Shape {
	 rect(float l, float b) {
		length = l;
		breadth = b;
	}

	float rect_area() {
		float Rect = length * breadth;
		return Rect;
	}
}

class circle extends Shape {
	circle(float r) {
		radius = r;
	}

	float circ() {
		float c = 3.14f * (radius * radius);
		return c;
	}
}

class squ extends Shape {
	squ(float l) {
		length = l;
	}

	float squa() {
		float sq = length * length;
		return sq;
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		rect o = new rect(2, 4);
		System.out.println("Area of Rectangle : "+o.rect_area());
		circle o1 = new circle(6);
		System.out.println("Area of Circle : "+o1.circ());
		squ o2 = new squ(9);
		System.out.println("Area of Square : "+o2.squa());
	}

}
