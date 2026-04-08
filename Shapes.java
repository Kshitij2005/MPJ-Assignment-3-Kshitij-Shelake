class Shapes {
    double r, l, w, b, h;

    // Constructor Overloading
    Shapes(double r) {
        this.r = r;
    }

    Shapes(double l, double w) {
        this.l = l;
        this.w = w;
    }

    Shapes(double b, double h, char t) {
        this.b = b;
        this.h = h;
    }

    // Method Overloading
    double findArea() { // Circle
        return Math.PI * r * r;
    }

    double findArea(double l, double w) { // Rectangle
        return l * w;
    }

    double findArea(double b, double h, char t) { // Triangle
        return 0.5 * b * h;
    }

    public static void main(String[] args) {

        Shapes circle = new Shapes(7);
        System.out.println("Circle Area: " + circle.findArea());

        Shapes rectangle = new Shapes(4, 5);
        System.out.println("Rectangle Area: " + rectangle.findArea(4, 5));

        Shapes triangle = new Shapes(6, 8, 'T');
        System.out.println("Triangle Area: " + triangle.findArea(6, 8, 'T'));
    }
}
