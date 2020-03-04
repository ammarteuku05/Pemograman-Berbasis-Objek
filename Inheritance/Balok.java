package Inheritance;

public class Balok extends PersegiPanjang {
        private double t,p,l;

    @Override
    public double getP() {
        return p;
    }
    @Override
    public void setP(double p) {
        this.p = p;
    }
    @Override
    public double getL() {
        return l;
    }
    @Override
    public void setL(double l) {
        this.l = l;
    }
    public double getT() {
        return t;
    }
    public void setT(double t) {
        this.t = t;
    }
    public double Volume(){
        return this.p * this.l * this.t;
    }
}
