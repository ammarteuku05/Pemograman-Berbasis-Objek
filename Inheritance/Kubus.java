package Inheritance;

public class Kubus extends Persegi {
    private double Sisi;

    @Override
    public double getSisi() {
        return super.getSisi();
    }
    public void setSisi(double Sisi){
        this.Sisi = Sisi;
    }
    public double VolumeKubus() {
        return this.Sisi*this.Sisi * this.Sisi;
    }
}
