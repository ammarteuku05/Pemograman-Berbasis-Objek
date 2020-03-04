package Inheritance;

public class Lingkaran extends BangunDatar{
   private double jariJari;
   private double Phi = 3.14;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getPhi() {
        return Phi;
    }

    public void setPhi(double Phi) {
        this.Phi = Phi;
    }
    public double Luas(){
        return this.Phi * (this.jariJari * this.jariJari);
    }
    public double Keliling(){
        return this.Phi * 2 *this.jariJari;
    }
}
