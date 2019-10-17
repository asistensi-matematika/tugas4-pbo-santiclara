package tugasasis4;
/**
 *
 * @author santiclara
 */
public class BangunDatarClass {
    protected String Jenis;
    
    public void view() {
        System.out.print("Nama bangun datar adalah : " );
    }
}

class Persegi extends BangunDatarClass {
    protected double Sisi;

    public double Luas(double Sisi) {
        double Luas = Sisi*Sisi;
        return Luas;
    }
    public double Keliling(double Sisi) {
        double Keliling = 4*Sisi;
        return Keliling;
    }
    @Override
    public void view() {
        super.view();
        System.out.println("Persegi");
        System.out.println("Luasnya adalah " + Luas(Sisi) + "cm^2");
        System.out.println("Keliling adalah " + Keliling(Sisi) + "cm");
    } 
  }

class Segitiga extends BangunDatarClass {
    protected double Alas;
    protected double Tinggi;

    public double Luas(double Alas, double Tinggi) {
        double Luas = 0.5*Alas*Tinggi;
        return Luas;
    }    
    @Override
    public void view(){
        super.view();
        System.out.println("Segitiga");
        System.out.println("Luas Segitiga adalah : " + Luas(Alas, Tinggi)+ "cm^2");
      }
    }
  
class Lingkaran extends BangunDatarClass {
    protected double JariJari;
    
    public double Luas(double JariJari) {
    double Luas = Math.PI*JariJari*JariJari;
    return Luas;
    
    }
    public double Keliling(double JariJari) {
        double Keliling = Math.PI*2*JariJari;
        return Keliling;
        
    }
    @Override
    public void view() {
        super.view();
        System.out.println("Lingkaran");
        System.out.println("Luas Lingkaran adalah : " + Luas(JariJari)+ "cm^2");
        System.out.println("Keliling Lingkaran adalah : " + Keliling(JariJari)+ "cm");
    }
  }

class JenisSegitiga extends Segitiga {
    
    public double SisiMiring(double Alas, double Tinggi) {
    double SisiMiring = Math.sqrt((Alas*Alas)+(Tinggi*Tinggi));
    return SisiMiring;
    }
    
    public double Keliling(double Alas) {
    double Keliling = 3*Alas;
    return Keliling;
    
    }
    public double Keliling(double Alas, double Tinggi) {
    double Keliling = Alas+Tinggi+SisiMiring(Alas,Tinggi);
    return Keliling;
    }  

   
    public void view(double Alas ) {
        System.out.println("Jenis Segitiga adalah Segitiga Sama Sisi");
        System.out.println("Keliling Segitiga adalah : " + Keliling(Alas));
    }
    public void view(double Alas, double Tinggi) {
        System.out.println("Jenis Segitiga adalah Segitiga Siku Siku");
        System.out.println("Keliling Segitiga adalah : " + Keliling(Alas, Tinggi));
  }
}
  


