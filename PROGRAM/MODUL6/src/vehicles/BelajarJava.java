package vehicles;
import vehicles.*;
public class BelajarJava {
 
  public static void main(String args[]){
     
    // buat object dari class Laptop (instansiasi)
    Laptop laptopAnto = new Laptop();
  
    // set nilai property
    laptopAnto.pemilik = "Anto";
    laptopAnto.merk = "Asus";
    laptopAnto.ukuranLayar = 15.6;
    
    // tampilkan property object Laptop
    System.out.println(laptopAnto.pemilik);
    System.out.println(laptopAnto.merk);
    System.out.println(laptopAnto.ukuranLayar);
    
    // tampilkan hasil method object Laptop
    System.out.println(laptopAnto.hidupkanLaptop());
    System.out.println(laptopAnto.matikanLaptop() );
  }
   
}
