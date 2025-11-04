package LatihanSoalUkl;

import java.util.Scanner;

public class LatihanUklSoal2Sedang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung (r): ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung (t): ");
        double t = input.nextDouble();

        double volume = hitungVolumeTabung(r, t);
        System.out.println("Volume tabung adalah: " + volume + " cm³");
        input.close();
    }

    public static double hitungVolumeTabung(double r, double t) {
        double phi = 3.14159;
        return phi * r * r * t;
    }
}
