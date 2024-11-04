package JavaProje07.School_Project_Cozum;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci extends Veritabani {

    static Scanner scan = new Scanner(System.in);

    public static void ogrenciMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println(
                    "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                            "================== OGRENCI MENU =================\n" +
                            "\t   1- Ogrenci Listesi Yazdir\n" +
                            "\t   2- Soyisimden Ogrenci Bulma\n" +
                            "\t   3- Sinif ve Sube Ile Ogrenci Bulma\n" +
                            "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                            "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                            "\t   A- ANAMENU\n" +
                            "\t   Q- CIKIS");
            tercih = scan.nextLine().toLowerCase();
            switch (tercih) {
                case "1":
                    ogrenciListeYazdir();
                    break;
                case "2": // Soyisimden Ogrenci Bulma
                    soyisimdenOgrenciBulma();
                    break;
                case "3": // Sinif ve Sube Ile Ogrenci Bulma
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4": // Bilgilerini Girerek Ogrenci Ekleme
                    ogrenciEkle();
                    break;
                case "5":
                    tcNoIleOgrenciSilme();
                    break;
                case "a":
                    Helper.anaMenu();
                    break;
                case "q":
                    Helper.projeDurdur();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");
            }


        } while (!tercih.equalsIgnoreCase("q"));
        Helper.projeDurdur();

    }

    private static void tcNoIleOgrenciSilme() throws InterruptedException {
        System.out.println("Silinecek ogrenci kimlik no giriniz");
        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrenciMap.get(silinecekOgrenci);
        String sonucValue = ogrenciMap.remove(silinecekOgrenci);

        System.out.print(silinecekOgrenci + " Siliniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }
        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz TC numarasi ile ogrenci bulunamadi");
        }

    }

    private static void ogrenciEkle() {
        System.out.println("Tc no");
        String tcNo = scan.nextLine();
        System.out.println("Isim");
        String isim = scan.nextLine();
        System.out.println("Soyisim");
        String soyisim = scan.nextLine();
        System.out.println("Dogum Yili");
        String dogumYili = scan.nextLine();
        System.out.println("Okul No");
        String okulNo = scan.nextLine();
        System.out.println("Sinif");
        String sinif = scan.nextLine();
        System.out.println("Sube");
        String sube = scan.nextLine();

        String key = tcNo;
        String value = isim + ", " + soyisim + ", " + dogumYili + ", " + okulNo + ", " +
                sinif + ", " + sube;
        ogrenciMap.put(key, value);
    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("Istediginiz ogrenci sinifini yaziniz");
        String istenilenSinif = scan.nextLine();
        System.out.println("Istediginiz ogrenci subesini yaziniz");
        String istenilenSube = scan.nextLine();

        System.out.print(istenilenSinif + "," + istenilenSube + " Taraniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "================= OGRENCI LISTESI ===============\n" +
                        "Tc No    :   Isim , Soyisim , D Yili , Okul No , Sinif , Sube");

        for (Map.Entry<String, String> each : myEntrySet)
        {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            if (istenilenSinif.equalsIgnoreCase(eachValueArr[4]) && istenilenSube.equalsIgnoreCase(eachValueArr[5]))
                System.out.println(eachKey + " : " + eachValue + " | ");
        }
    }


    private static void soyisimdenOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("Istediginiz ogrenci soymini yaziniz");
        String istenilenSoyisim = scan.nextLine();

        System.out.print(istenilenSoyisim + " Araniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "================= OGRENCI LISTESI ===============\n" +
                        "Tc No      :   Isim , Soyisim , D Yili , Okul No , Sinif , Sube");

        // printf veya String.format metodları kullanılarak daha düzgün bi çıktı elde edilebilir. Şart değil, isteğe bağlı.
        for (Map.Entry<String, String> each : myEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");

            if (istenilenSoyisim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.println(eachKey + "  : " + eachValue);
            }
        }
    }

    private static void ogrenciListeYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();

        System.out.print("Kayitli Ogrenciler yazdiriliyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "================ OGRENCI LISTESI ================\n" +
                        "Tc No    :   Isim , Soyisim , D Yili , Okul No , Sinif , Sube");

        for (Map.Entry<String, String> each : myEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            System.out.println(eachKey + " : " + eachValue + " | ");
        }
    }
}
