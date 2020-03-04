package Inheritance;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double Volume(){
        return Luas() * tinggi;
    }
}
