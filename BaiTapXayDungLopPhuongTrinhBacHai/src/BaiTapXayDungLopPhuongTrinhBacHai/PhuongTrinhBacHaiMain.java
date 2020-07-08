package BaiTapXayDungLopPhuongTrinhBacHai;

import java.util.Scanner;

public class PhuongTrinhBacHaiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        PhuongTrinhBacHai PhuongTrinh = new PhuongTrinhBacHai(a, b, c);
        if (PhuongTrinh.getDiscriminant() > 0) {
            System.out.println("Phuong Trinh Co Hai Nghiem: ");
            System.out.println("Nghiem 1: " + PhuongTrinh.getRoot1());
            System.out.println("Nghiem 2: " + PhuongTrinh.getRoot2());
        } else if (PhuongTrinh.getDiscriminant() == 0) {
            System.out.println("Phuong Trinh Co Mot Nghiem: ");
            System.out.println("Nghiem: " + PhuongTrinh.getRoot1());
        } else if (PhuongTrinh.getDiscriminant() < 0) {
            System.out.println("Phuong Trinh Vo Nghiem");
        }
    }

}
