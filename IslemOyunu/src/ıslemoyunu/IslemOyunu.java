package ıslemoyunu;

import java.util.Scanner;

public class IslemOyunu {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int i = 0;
        boolean j = true;

        long bas = System.currentTimeMillis();

        while (j == true) {

            int sayi1 = (int) (Math.random() * 10);
            int sayi2 = (int) (Math.random() * 10);
            int islemno = (int) (Math.random() * 4);
            double toplama = 0;
            double cıkartma = 0;
            double carpma = 0;
            double bolme = 0;

            switch (islemno) {
                case 0 -> {
                    toplama = sayi1 + sayi2;
                    System.out.println(sayi1 + " + " + sayi2 + " = ?");
                }
                case 1 -> {
                    cıkartma = sayi1 - sayi2;
                    System.out.println(sayi1 + " - " + sayi2 + " = ?");
                }
                case 2 -> {
                    carpma = sayi1 * sayi2;
                    System.out.println(sayi1 + " * " + sayi2 + " = ?");
                }
                case 3 -> {
                    bolme = sayi1 / sayi2;
                    System.out.println(sayi1 + " / " + sayi2 + " = ?");
                }

            }

            System.out.print("CEVABINIZ:");
            double cevap = girdi.nextDouble();

            switch (islemno) {
                case 0 -> {
                    if (cevap == toplama) {
                        System.out.println("DOĞRU BİLDİNİZ!");
                        i++;
                    } else {
                        System.out.println("SONUÇ: " + toplama + "    YANLIŞ CEVAP!");
                        System.out.print("SKOR: " + i);
                        j = false;
                    }
                }
                case 1 -> {
                    if (cevap == cıkartma) {
                        System.out.println("DOĞRU BİLDİNİZ!");
                        i++;
                    } else {
                        System.out.println("SONUÇ: " + cıkartma + "    YANLIŞ CEVAP!");
                        System.out.print("SKOR: " + i);
                        j = false;
                    }
                }
                case 2 -> {
                    if (cevap == carpma) {
                        System.out.println("DOĞRU BİLDİNİZ!");
                        i++;
                    } else {
                        System.out.println("SONUÇ: " + carpma + "    YANLIŞ CEVAP!");
                        System.out.print("SKOR: " + i);
                        j = false;
                    }
                }
                case 3 -> {
                    if (cevap == bolme) {
                        System.out.println("DOĞRU BİLDİNİZ!");
                        i++;
                    } else {
                        System.out.println("SONUÇ: " + bolme + "    YANLIŞ CEVAP!");
                        System.out.print("SKOR: " + i);
                        j = false;
                    }
                }

            }
        }
        long son = System.currentTimeMillis();

        long gecens = son - bas;
        double gecensure = (double) gecens / 1000;

        System.out.println("        GEÇEN SÜRE: " + gecensure);

    }

}
