package JavaProje07.School_Project_Cozum;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen extends Veritabani {
    static Scanner scan = new Scanner(System.in);

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {

            System.out.println(
                    "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                            "================= OGRETMEN MENU =================\n" +
                            "\n" +
                            "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                            "\t   2- Soyisimden Ogretmen Bulma\n" +
                            "\t   3- Branstan Ogretmen Bulma\n" +
                            "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                            "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                            "\t   A- ANAMENU\n" +
                            "\t   Q- CIKIS\n");
            tercih = scan.nextLine();

            switch (tercih) {

                case "1": // Ogretmenler Listesi Yazdir
                    ogretmenListesiYazdir();
                    break;
                case "2": // Soyisimden Ogretmen Bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3": // Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    break;
                case "4": // Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEkleme();
                    break;
                case "5": // Kimlik No Ile Kayit Silme
                    tcNoIleOgretmenSil();
                    break;
                case "a":
                case "A":
                    Helper.anaMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli tercih yapiniz:");
            }

        } while (!tercih.equalsIgnoreCase("q"));
        Helper.projeDurdur();
    }

    public static void tcNoIleOgretmenSil() throws InterruptedException {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);
        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        System.out.print(silinecekOgretmen + " Siliniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz Tc numarasi ile ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("Tc no");
        String tcNo = scan.nextLine();
        System.out.println("isim");
        String isim = scan.nextLine();
        System.out.println("soyisim");
        String soyisim = scan.nextLine();
        System.out.println("Dogum yili");
        String dYili = scan.nextLine();
        System.out.println("Brans");
        String brans = scan.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + dYili + ", " + brans;
        ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz Ogretmenin Bransini Giriniz:");
        String istenenBrans = scan.nextLine();

        System.out.print(istenenBrans + " Ogretmenleri Listeleniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "============BRANS ILE OGRETMEN ARAMA ============\n" +
                        "TcNo : Isim , Soyisim , D.Yili , Brans");

        // Daha düzgün bi görünüm için printf veya String.format kullanılabilir...
        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String[] eachValuarr = eachValue.split(", ");
            if (istenenBrans.equalsIgnoreCase(eachValuarr[3])) {
                System.out.println(eachKey + " : " + eachValue + " | ");
            }
        }
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("aradiginiz Ogretmenin soyismini giriniz:");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.print(istenenSoyisim + " Araniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "=========== SOYISIM ILE OGRETMEN ARAMA ==========\n" +
                        "TcNo : Isim , Soyisim , D.Yili , Brans");

        // Daha düzgün bi görünüm için printf veya String.format kullanılabilir...
        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String[] eachValuarr = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[1])) {
                System.out.println(eachKey + " : " + eachValue + " | ");
            }
        }
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.print("Ogretmen Listesi yazdiriliyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "=============== OGRETMEN LISTESI ================\n" +
                        "TcNo : Isim , Soyisim , D.Yili , Brans");

        // Daha düzgün bi görünüm için printf veya String.format kullanılabilir...
        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            System.out.println(eachKey + " : " + eachValue + " | ");
        }
    }


}
