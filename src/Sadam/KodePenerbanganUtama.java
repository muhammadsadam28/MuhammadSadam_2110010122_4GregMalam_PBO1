package Sadam;

import java.util.Scanner;

public class KodePenerbanganUtama {
    public static void main(String[] args) {
        
        try {
            // io sederhana
            Scanner scanner = new Scanner(System.in);

            // array
            KodePenerbanganDetail[] kpu = new KodePenerbanganDetail[2];

            // perulangan
            for (int i = 0; i < kpu.length; i++) {
                System.out.print("Masukkan Kode Penerbangan " + (i + 1) + ": ");
                String kodePenerbangan = scanner.nextLine();
                System.out.print("Masukkan Maskapai " + (i + 1) + ": ");
                String maskapai = scanner.nextLine();

                // objek
                kpu[i] = new KodePenerbanganDetail(kodePenerbangan, maskapai);
            }

            // perulangan
            for (KodePenerbanganDetail data : kpu) {
                System.out.println("");
                System.out.println("=========================");
                System.out.println("Data Penerbangan");
                System.out.println(data.displayInfo());
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Kode Penerbangan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}