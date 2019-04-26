package OOP;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        ;
        return delta;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            return r1;
        } else {
            double r1 = 0;
            return r1;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            double r2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            return r2;
        } else {
            double r2 = 0;
            return r2;
        }
    }

    public void display() {
        double delta = getDiscriminant();
        double x1 = getRoot1();
        double x2 = getRoot2();
        if(delta >0) {
            System.out.println("phuong trinh co hai nghiem " + x1 + " va " + x2 );
        } else if (delta == 0) {
            System.out.println("phuong trinh co mot nghiem " + x1 );
        } else if (delta < 0) {
            System.out.println("phuong trinh vo nghiem" );
        }
    }
}
