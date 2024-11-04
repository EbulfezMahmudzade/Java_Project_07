package JavaProje07.Shapes_Project_Cozum;

import java.util.Scanner;

// Runner sınıfı
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            // Kullanıcıya seçenekleri gösterme
            System.out.println("1. Kare\n2. Dikdörtgen\n3. Daire\n4. Üçgen");
            System.out.print("Hangi şekli seçmek istiyorsunuz? (1-4): ");
            int secim = scanner.nextInt();

            // Kullanıcının seçimine göre ilgili sınıfı oluşturma
            Islem sekil;

            switch (secim) {
                case 1:
                    System.out.print("Kare kenar uzunluğunu girin: ");
                    double kareKenarUzunlugu = scanner.nextDouble();
                    sekil = new Kare(kareKenarUzunlugu);
                    break;
                case 2:
                    System.out.print("Dikdörtgen uzun kenarı girin: ");
                    double dikdortgenUzunKenar = scanner.nextDouble();
                    System.out.print("Dikdörtgen kısa kenarı girin: ");
                    double dikdortgenKisaKenar = scanner.nextDouble();
                    sekil = new Dikdortgen(dikdortgenUzunKenar, dikdortgenKisaKenar);
                    break;
                case 3:
                    System.out.print("Daire yarıçapını girin: ");
                    double daireYaricap = scanner.nextDouble();
                    sekil = new Daire(daireYaricap);
                    break;
                case 4:
                    System.out.print("Üçgenin a kenarını girin: ");
                    double ucgenKenar1 = scanner.nextDouble();
                    System.out.print("Üçgenin b kenarını girin: ");
                    double ucgenKenar2 = scanner.nextDouble();
                    System.out.print("Üçgenin c kenarını girin: ");
                    double ucgenKenar3 = scanner.nextDouble();
                    sekil = new Ucgen(ucgenKenar1, ucgenKenar2, ucgenKenar3);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    continue; // Döngüyü başa al
            }

            // Hesaplamaları yapma ve sonuçları gösterme
            System.out.println("Alan: " + sekil.alanHesapla());
            System.out.println("Çevre: " + sekil.cevreHesapla());

            // Yeni bir hesaplama yapmak isteyip istemediğini kontrol etme
            System.out.print("Başka bir hesaplama yapmak istiyor musunuz? (Evet/Hayır): ");
            String devamSecimi = scanner.next().toLowerCase();
            devam = devamSecimi.equals("evet");
        }

        System.out.println("Program sonlandırıldı.");
    }
}
