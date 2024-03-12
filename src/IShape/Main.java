package IShape;


import IShape.Circle;
import IShape.Rectangle;
import IShape.IShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap chieu rong hcn: ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai hcn : ");
        double length = scanner.nextDouble();
        IShape hcn = new Rectangle(width, length);
        System.out.println("Dien tich hcn:" + hcn.getArea());
        System.out.println("chu vi hcn:" + hcn.getPerimeter());
        System.out.print("ban kinh hinh tron: ");
        double radius = scanner.nextDouble();
        IShape ht = new Circle(radius);
        System.out.println("Dien tich hinh tron la: "+ ht.getArea());
        System.out.println("Dien chu vi hinh tron: "+ ht.getPerimeter());
        // danh sanh
        IShape c = new Circle(5.0);
        IShape r = new Rectangle(2,3);
        IShape [] list = {c,r};
        for (IShape s:list){
            System.out.println("Dien tich hinh chu nhat  : " + hcn.getArea());
            System.out.println("chu vi hcn:" + hcn.getPerimeter());
            System.out.println("Dien tich hinh tron la: "+ ht.getArea());
            System.out.println("Dien chu vi hinh tron: "+ ht.getPerimeter());
        }
        scanner.close();



        }
    }

