package Inheritance;
public class PersegiPanjang extends BangunDatar{
    private double p;
    private double l;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
    public double Luas(){
        return this.p * this.l;
    }
    public double Keliling(){
        return this.p + this.l;
    }

}
