public class ComplexNum {
    int real;
    int imag;

    public ComplexNum() {
        real = 0;
        imag = 0;
    }

    public ComplexNum(int x, int y) {
        real = x;
        imag = y;
    }

    public ComplexNum add(ComplexNum n) {
        return new ComplexNum(this.real + n.real, this.imag + n.imag);
    }

    public ComplexNum subtract(ComplexNum n) {
        return new ComplexNum(this.real - n.real, this.imag - n.imag);
    }

    public void increment() {
        this.real++;
        this.imag++;
    }

    public void decrement() {
        this.real--;
        this.imag--;
    }

    public boolean equals(ComplexNum n) {
        return this.real == n.real && this.imag == n.imag;
    }

    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(5, 8);
        ComplexNum c2 = new ComplexNum(1, 2);

        ComplexNum sum = c1.add(c2);
        System.out.println("Sum is " + sum.real + "+" + sum.imag + "i");

        ComplexNum diff = c1.subtract(c2);
        System.out.println("Difference is " + diff.real + "+" + diff.imag + "i");

        c1.increment();
        System.out.println("After increment " + c1.real + "+" + c1.imag + "i");

        c1.decrement();
        System.out.println("After decrement " + c1.real + "+" + c1.imag + "i");

        if (c1.equals(c2)) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}
