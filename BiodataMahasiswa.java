import java.util.Scanner;
   
class BiodataMahasiswa {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Biodata Mahasiswa ##");
    System.out.println("========================================");
    System.out.println();
     
    String nama, nim, kelas, jurusan,umur, kota_asal, alamat;
  
    System.out.print("Nama mahasiswa: ");
    nama = input.nextLine();
     
    System.out.print("NIM: ");
    nim = input.nextLine();
    
     System.out.print("Umur: ");
    umur= input.nextLine();
    
    System.out.print("Kelas: ");
    kelas = input.nextLine();
     
    System.out.print("Jurusan: ");
    jurusan = input.nextLine();
     
    System.out.print("Kota Asal: ");
    kota_asal = input.nextLine();
     
    System.out.print("Alamat: ");
    alamat = input.nextLine();
     
    System.out.println();
     
    System.out.println("# Data Mahasiswa #");
    System.out.println("==================");
    System.out.println("Nama: "      + nama);
    System.out.println("NIM: "       + nim);
    System.out.println("Umur: "       + umur);
    System.out.println("Kelas: "  + kelas);
    System.out.println("Jurusan: "   + jurusan);
    System.out.println("Kota Asal: " + kota_asal);
    System.out.println("Alamat: "    + alamat);
  }
}
