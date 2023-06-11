// Barik Mauluda Wildani
// NIM 225150407111021
// SISTEM INFORMASI - B

package Contest;

import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Pemesanan Tiket Coldplay!");

        try {
            System.out.print("Masukkan nama pemesan: ");
            String namaPemesan = scanner.nextLine();

            if (namaPemesan.length() > 10) {
                throw new InvalidInputException("Panjang nama pemesan maksimal 10 karakter!");
            }

            System.out.println("Pilih jenis tiket:");
            System.out.println("1. CAT 8");
            System.out.println("2. CAT 1");
            System.out.println("3. FESTIVAL");
            System.out.println("4. VIP");
            System.out.println("5. UNLIMITED EXPERIENCE");
            System.out.print("Masukkan pilihan: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Input tidak valid! Masukkan pilihan tiket dengan angka.");
            }

            if (choice < 1 || choice > 5) {
                throw new InvalidInputException("Input tidak valid! Pilihan hanya 1-5.");
            }

            TiketKonser tiket = PemesananTiket.pilihTiket(choice - 1);

            String kodeBooking = generateKodeBooking();

            String tanggalPesanan = getCurrentDate();

            System.out.println("\n----- Detail Pemesanan -----");
            System.out.println("Nama Pemesan: " + namaPemesan);
            System.out.println("Kode Booking: " + kodeBooking);
            System.out.println("Tanggal Pesanan: " + tanggalPesanan);
            System.out.println("Tiket yang dipesan: " + tiket.getNama());
            System.out.println("Total harga: " + tiket.hitungHarga() + " USD");
        } catch (InvalidInputException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}