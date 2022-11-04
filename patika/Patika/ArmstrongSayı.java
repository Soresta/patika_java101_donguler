import java.util.Scanner;

public class ArmstrongSayı {
    public static void main(String[] args) {

        //Armstrong Sayı Nedir ?
        //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
        //böyle sayılara Armstrong sayı denir.
        //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir,
        //Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        //Klavyeden girilen sayının armstrong sayı olup olmadığını bulan programı yazınız.
        //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        // Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        Scanner read = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = read.nextInt();

        int bolumKalani = number, haneSayisi = 0, bolum, sonuc = 1, lastSonuc = 0, kayitN = number;

        do {
            bolumKalani = bolumKalani / 10;
            haneSayisi += 1;
        } while (bolumKalani != 0);
        int i = 0;
        int[] haneler = new int[haneSayisi];

        while (kayitN != 0) {
            bolum = kayitN % 10;
            kayitN = kayitN / 10;
            haneler[i] = bolum;
            i++;
        }
        for (int sayi : haneler) {
            sonuc = (int) Math.pow(sayi, haneSayisi);
            lastSonuc = lastSonuc + sonuc;
        }
        if (lastSonuc == number) {
            System.out.println(lastSonuc + " Sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " Sayısı bir Armstrong sayı değildir.");
        }
    }
}
