import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil; // Değişkenler tanımlanıyor.
        boolean artik = false;
        Scanner input = new Scanner(System.in); // Scanner sınıfı değişken tanımlanıyor.

        // Kullanıcıdan veriler alınıyor.
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        // Hesaplamalar yapılıyor.
        if ((yil >= 100) && (yil % 400 == 0)) artik = true;
        if ((yil < 100) && (yil % 4 == 0)) artik = true;
        // Aşağıda geçmiş ve gelecek 100 yıl Genel kurala göre hesaplanmıştır.
        // 100 ün katı hesabına göre hesaplanmamıştır. Bu kurala göre hesaplanmasaydı
        // yakın tarihimizde hiç artık yıl olmazdı. 400 yıl da bir olurdu. Halbu ki günümüz de
        // 4 yıl da bir artık yıl olarak uygulanmaktadır.
        if (yil >= 1900 && yil <= 2100 && yil % 4 == 0) artik = true;

        // Ekrana çıktı veriliyor.
        System.out.println(artik ? yil + " Bir artık yıldır." : yil + " Bir artık yıl değildir.");
       /* VEYA aşağıda ki kod kullanılabilir.
        if (artik) {
            System.out.println("" + yil + " Bir artık yıldır.");
        } else System.out.println("" + yil + " bir artık yıl değildir.");
       */
    }
}
