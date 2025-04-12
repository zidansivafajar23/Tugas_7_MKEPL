/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_7_mkepl;

import java.util.Scanner;

/**
 *
 * @author zidan
 */
public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\n=== Kalkulator Sederhana ===");

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil;

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Tidak bisa membagi dengan nol.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid.");
                    continue;
            }

            System.out.println("Hasil: " + hasil);

            System.out.print("\nApakah ingin menghitung lagi? (y/n): ");
            char ulang = input.next().charAt(0);
            if (ulang != 'y' && ulang != 'Y') {
                lanjut = false;
                System.out.println("Terima kasih telah menggunakan kalkulator!");
            }
        }

        input.close();
    }
}
