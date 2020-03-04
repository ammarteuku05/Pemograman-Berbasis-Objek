package Tugas4;

public class Persegi extends BangunDatar {
  private double Sisi;
    private Persegi sisi;
    public double getSisi() {
        return Sisi;
    }
    public double Luas(){
        return this.Sisi * this.Sisi;
    }
    public double Keliling(){
        return 4 * this.Sisi;
    }
}
