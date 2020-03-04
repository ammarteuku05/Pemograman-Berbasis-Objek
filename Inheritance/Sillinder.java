package Tugas4;
public class Sillinder extends Lingkaran{
    private double Tinggi;
    public double getTinggi() {
        return Tinggi;
    }
    public void setTinggi(double Tinggi) {
        Tinggi = this.Tinggi;
    }
    public double Volume(){
        return Luas() * this.Tinggi;
    }
}
