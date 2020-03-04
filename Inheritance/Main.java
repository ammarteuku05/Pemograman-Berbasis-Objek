package Tugas4;
import java.util.Scanner;

public class Main {
    int n;
    public static void main(String args[]) {
        char y;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1.  Segitiga");
            System.out.println("2.  Persegi & Kubus");
            System.out.println("3.  Persegi Panjang & Balok");
            System.out.println("4.  Lingkaran & Silinder");
            System.out.print("Masukkan menu yang ingin dipilih: ");
            int n = input.nextInt();
            switch (n) {
                case 1:
                    double tinggi, alas;
                    System.out.println("1.  Segitiga:");
                    Segitiga Segitigas = new Segitiga();
                    System.out.print("Alas   : ");
                    alas = input.nextDouble();
                    Segitigas.setA(alas);
                    System.out.print("Tinggi     : ");
                    tinggi = input.nextDouble();
                    Segitigas.setT(tinggi);
                    Segitigas.getA();
                    Segitigas.getT();
                    System.out.println("Keliling =  " + Segitigas.Keliling());
                    System.out.println("Luas =  " + Segitigas.Luas());
                    break;
                case 2:
                    System.out.println("2.  Persegi & Kubus");
                    Persegi p = new Persegi();
                    Kubus k = new Kubus();
                    double sisi;
                    System.out.print("Sisi   : ");
                    sisi = input.nextDouble();
                    p.setSisi(sisi);
                    p.getSisi();
                    k.setSisi(sisi);
                    k.getSisi();
                    System.out.println("Keliling =  " + p.Keliling());
                    System.out.println("Luas =  " + p.Luas());
                    System.out.println("Volume Kubus= " +k.Volume());
                    break;

                case 3:
                    System.out.println("3.  Persegi Panjang & Balok");
                    double panjang, lebar, tinggipp;
                    PersegiPanjang pp = new PersegiPanjang();
                    Balok b = new Balok();
                    System.out.print("Panjang:    ");
                    panjang = input.nextDouble();
                    pp.setP(panjang);
                    pp.getP();
                    b.setP(panjang);
                    b.getP();
                    System.out.print("Lebar   : ");
                    lebar = input.nextDouble();
                    pp.setL(lebar);
                    pp.getL();
                    b.setL(lebar);
                    b.getL();
                    System.out.print("Tinggi    : ");
                    tinggipp = input.nextDouble();
                    b.setT(tinggipp);
                    b.getT();
                    System.out.println("Keliling =  " + pp.Keliling());
                    System.out.println("Luas =  " + pp.Luas());
                    System.out.println("Volume Balok= " + b.Volume());
                    break;
                case 4:
                    System.out.println("4.  Lingkaran & Silinder");
                    Lingkaran l = new Lingkaran();
                    Sillinder S = new Sillinder();
                    double jariJari, Phi =3.14, Tinggi;
                    System.out.print("Jari Jari   : ");
                    jariJari = input.nextDouble();
                    l.setJariJari(jariJari);
                    l.getJariJari();
                    S.setJariJari(jariJari);
                    S.getJariJari();
                    l.setPhi(Phi);
                    l.getPhi();
                    S.setPhi(Phi);
                    S.getPhi();
                    System.out.print("Tinggi  : ");
                    Tinggi = input.nextDouble();
                    S.setTinggi(Tinggi);
                    S.getTinggi();
                    System.out.println("Keliling =  " + l.Keliling());
                    System.out.println("Luas =  " + l.Luas());
                    System.out.println("Volume Silinder = "+S.Volume());
                    break;
                default:
                    System.out.println("Pilihan anda tidak ada di menu");
                    break;
            }
            System.out.print("Ingin pilih menu kembali (y/n): ");
            y = input.next().charAt(0);
        } while (y == 'Y' || y == 'y');
    }
}

