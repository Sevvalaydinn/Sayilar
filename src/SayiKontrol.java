import java.util.Scanner;

public class SayiKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        if (sayi > 0) {
            System.out.println(sayi + " pozitiftir.");
        } else if (sayi < 0) {
            System.out.println(sayi + " negatiftir.");
        } else {
            System.out.println("Sayı sıfırdır.");
        }

        scanner.close();
    }
}

