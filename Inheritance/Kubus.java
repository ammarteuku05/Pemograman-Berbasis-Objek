package Tugas4;

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
        return Luas() * this.Sisi;
    }
}
