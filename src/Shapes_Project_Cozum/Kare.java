package JavaProje07.Shapes_Project_Cozum;

// Kare sınıfı
class Kare implements Islem {
    private double kenarUzunlugu;

    public Kare(double kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    @Override
    public double alanHesapla() {
        return kenarUzunlugu * kenarUzunlugu;
    }

    @Override
    public double cevreHesapla() {
        return 4 * kenarUzunlugu;
    }
}
