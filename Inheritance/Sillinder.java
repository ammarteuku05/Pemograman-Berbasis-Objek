package Inheritance;
public class Sillinder extends Lingkaran{
     private double Tinggi,phi=3.14,jariJari;

    @Override
    public double getPhi() {
        return phi;
    }

    @Override
    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return Tinggi;
    }
    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }
    public double Volume(){
        return phi *jariJari*jariJari * this.Tinggi;
    }
}
