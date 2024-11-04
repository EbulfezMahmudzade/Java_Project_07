package JavaProje07.Shapes_Project_Cozum;

// Dikdörtgen sınıfı
class Dikdortgen implements Islem {
    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return uzunKenar * kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (uzunKenar + kisaKenar);
    }
}
