package tugasasis4;
import java.util.Scanner;
/**
 *
 * @author santiclara
 */
public class BangunDatarMain {
   
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
        System.out.println("Pilih bangun datar yang diinginkan ");
        System.out.println("1.Persegi");
        System.out.println("2.Lingkaran");
        System.out.println("3.Segitiga");
        System.out.print("Masukkan Pilihan Anda :  ");
        
        int Jenis= input.nextInt();
        
        switch (Jenis) {
            case 1:
               Persegi P1 = new Persegi(); 
               System.out.print("Masukkan panjang sisi : ");
               P1.Sisi = input.nextDouble();
               P1.view();
               break;
               
            case 2:
               Lingkaran L1 = new Lingkaran(); 
               System.out.print("Masukkan panjang jari-jari : ");
               L1.JariJari = input.nextDouble();
               L1.view();
               break;
               
            case 3:
               JenisSegitiga JS = new JenisSegitiga(); 
               System.out.println("Pilih segitiga yang diinginkan");
               System.out.println("1. Segitiga siku-siku");
               System.out.println("2. Segitiga sama sisi");
               System.out.print("Masukkan pilihan Anda : ");
               int jenisseg = input.nextInt();
               System.out.print("Masukkan panjang alas : ");
               JS.Alas = input.nextDouble();
               System.out.print("Masukkan panjang tinggi : ");
               JS.Tinggi = input.nextDouble();
               JS.view();
               
               switch(jenisseg) {
                   case 1:
                       JS.view(JS.Alas, JS.Tinggi);
                       break;
                       
                   case 2:
                       JS.view(JS.Alas);
                  
               
               break;
               default :
               System.out.println("Tidak ada dalam pilihan");
               break;
    }
        
              break;
              default:
              System.out.println("Tidak ada dalam pilihan");
              break;
  }
 }
}


   
  
