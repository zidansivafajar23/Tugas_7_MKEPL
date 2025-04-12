package tugas_7_mkepl;

import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            clearScreen();
            printHeader();

            System.out.print("Masukkan angka pertama  ➤ ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /) ➤ ");
            char operator = input.next().charAt(0);

            System.out.print("Masukkan angka kedua    ➤ ");
            double angka2 = input.nextDouble();

            System.out.println("\n------------------------------");

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
                        System.out.println("⚠️  Error: Tidak bisa membagi dengan nol.");
                        pause();
                        continue;
                    }
                    break;
                default:
                    System.out.println("⚠️  Operator tidak valid.");
                    pause();
                    continue;
            }

            System.out.println("✅ Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);

            System.out.println("------------------------------");
            System.out.print("🔁 Ingin menghitung lagi? (y/n): ");
            char ulang = input.next().charAt(0);
            if (ulang != 'y' && ulang != 'Y') {
                lanjut = false;
                System.out.println("\n🙏 Terima kasih telah menggunakan Kalkulator!\n");
            }
        }

        input.close();
    }

    // Fungsi untuk print header rapi
    public static void printHeader() {
        System.out.println("====================================");
        System.out.println("        ✨ KALKULATOR JAVA ✨        ");
        System.out.println("====================================");
    }

    // Fungsi clear screen (tidak berfungsi di semua terminal)
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Jika gagal clear, abaikan
        }
    }

    // Fungsi untuk pause
    public static void pause() {
        System.out.print("\nTekan Enter untuk lanjut...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }
}
