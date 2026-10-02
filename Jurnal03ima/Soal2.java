import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mataKuliah = input.nextLine();
        int jam = input.nextInt();

        System.out.println("Aku suka kuliah " + mataKuliah + ".");
        System.out.println("Kuliah " + jam + " jam per minggu rasanya kurang.");
        System.out.println("Tambahin dong jadi " + (2 * jam) + " jam per minggu :)");
    }
}