import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int H = input.nextInt();
        int M = input.nextInt();
        int S = input.nextInt();
        int D = input.nextInt();

        int totalDetik = H * 3600 + M * 60 + S + D;

        int hari = totalDetik / 86400;
        int sisa = totalDetik % 86400;

        int jam = sisa / 3600;
        sisa = sisa % 3600;

        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("Hari berikutnya: " + hari);
        System.out.println("Waktu selesai: " + jam + ":" + menit + ":" + detik);
    }
}