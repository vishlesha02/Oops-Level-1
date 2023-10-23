package com.bridgelabz;

public class TV {
    private String brand;
    private int inch;
    private int price;

    public TV(String brand, int inch, int price) {
        this.brand = brand;
        this.inch = inch;
        this.price = price;
    }

    public void calculateDiscount() {
        if (inch == 45) {
            System.out.println("5% discount:");
            double discountValue = price - (price * 0.05);
            System.out.println("TV after discount: " + discountValue);
        } else if (inch >= 55 && inch <= 65) {
            System.out.println("8% discount:");
            double discountValue = price - (price * 0.08);
            System.out.println("TV after discount: " + discountValue);
        } else if (inch == 70) {
            System.out.println("9% discount:");
            double discountValue = price - (price * 0.09);
            System.out.println("TV after discount: " + discountValue);
        }
    }

    public void display() {
        System.out.println("Brand of TV: " + brand);
        System.out.println("Size of TV: " + inch + " inch");
        System.out.println("Price of TV: " + price);
    }

    public static void main(String[] args) {
        Sony sonyTV = new Sony(70, 85000);
        sonyTV.calculateDiscount();
        sonyTV.display();

        System.out.println("-------------------------");

        Samsung s = new Samsung(60, 60000);
        s.calculateDiscount();
        s.display(); System.out.println("-------------------------");

        Iffalcon i = new Iffalcon(45, 45000);
        i.calculateDiscount();
        i.display();
    }
}

class Sony extends TV {
    public Sony(int inch, int price) {
        super("Sony", inch, price);
    }
}

class Samsung extends TV {
    public Samsung(int inch, int price) {
        super("Samsung", inch, price);
    }
}
    class Iffalcon extends TV {
        public Iffalcon(int inch, int price) {
            super("Iffalcon", inch, price);
        }

    }
