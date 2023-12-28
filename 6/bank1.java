import java.util.Scanner;

class Bank {
    String name;
    int acc_no;
    double balance;

    void read() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the holder :");
        name = input.next();
        System.out.println("Enter the account number:");
        acc_no = input.nextInt();
        System.out.println("Enter the current balacnce ");
        balance = input.nextDouble();
    }

    void display() {
        System.out.printf("Enter the name of the holder : %s \n", name);
        System.out.printf("Enter the account number: %d \n", acc_no);
        System.out.printf("Enter the current balacnce %f \n", balance);
    }

    void calculate() {
        System.out.println("This is the claculate method of base class");
    }
}

class SBI extends Bank {
    double ROI;

    void read1() {
        read();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the trate of ROI of SBI bank ");
        ROI = input.nextDouble();
    }

    void calculate() {
        double intrest = ROI * balance;
        System.out.printf("Intrest :%f\n", intrest);
    }

    void display1() {
        display();
        System.out.printf("Intrest rate :%f\n", ROI);
    }
}

class CANARA extends Bank {
    double ROI;

    void read1() {
        read();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the trate of ROI of SBI bank ");
        ROI = input.nextDouble();
    }

    void calculate() {
        double intrest = ROI * balance;
        System.out.printf("Intrest :%f\n", intrest);
    }

    void display1() {
        display();
        System.out.printf("Intrest rate :%f\n", ROI);
    }
}

class STATE extends Bank {
    double ROI;

    void read1() {
        read();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the trate of ROI of SBI bank ");
        ROI = input.nextDouble();
    }

    void calculate() {
        double intrest = ROI * balance;
        System.out.printf("Intrest :%f\n", intrest);
    }

    void display1() {
        display();
        System.out.printf("Intrest rate :%f\n", ROI);
    }
}

public class bank1 {
    public static void main(String[] args) {
        System.out.println("Enter bank details :");
        SBI acc = new SBI();
        acc.read1();
        acc.display1();
        acc.calculate();
        STATE state = new STATE();
        state.read1();
        state.display1();
        state.calculate();
        CANARA canara = new CANARA();
        canara.read1();
        canara.display1();
        canara.calculate();
    }
}