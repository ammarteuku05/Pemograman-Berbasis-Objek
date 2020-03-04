package Inheritance;
import java.lang.Math;
public class Segitiga extends BangunDatar{
    double a;
    double t;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getT() {
        return t;
    }
    public void setT(double t) {
        this.t = t;
    }
    public double Luas(){
        return this.a * this.t/2;
    }
    public double hitungsisimiring(){
        return Math.sqrt(Math.pow(this.a/2,2.0)+ Math.pow(this.t, 2.0));
    }
    public double Keliling(){
        return this.a  + 2 * hitungsisimiring();
    }
}

