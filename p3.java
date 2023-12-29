class complexNum {
    int real;
    int imag;

    complexNum() {
        real = 0;
        imag = 0;
    }

    complexNum(int x, int y) {
        this.real = x;
        this.imag = y;
    }

    public complexNum add(complexNum n) {
        return new complexNum(this.real + n.real, this.imag + n.imag);
    }

    public complexNum sub(complexNum n) {
        return new complexNum(this.real - n.real, this.imag - n.imag);
    }
    public boolean com(complexNum n){
        return this.real == n.real && this.imag == n.real;
    }
}

public class p3 {
    public static void main(String[] args) {
        complexNum c1 = new complexNum(3, 1);
        complexNum c2 = new complexNum(2, 4);
        complexNum sum = c1.add(c2);
        System.out.println("Real" + sum.real + "Imag" + sum.imag);
        complexNum sub = c1.sub(c2);
        System.out.println("Real" + sub.real + "Imag" + sub.imag);
        boolean s = c1.com(c2);
        System.out.println(s);
    }
}