
package ktp;

import java.util.Scanner;


public class KTP {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      String NIK,nama, TTL, jenis_kelamin, status, agama, kewarganegaraan, gol_darah;
      int umur, a;
      
      System.out.println("<<<<<<<<KTP>>>>>>>");
      System.out.println("Silakan menulis data yang sudah disediakan di bawah ini");
      String[] biodata = {"NIK","Nama","Tempat Tanggal Lahir","Jenis Kelamin","Alamat"};
      
      for(int i = 0;i < biodata.length;i++){
          System.out.println(i+"."+biodata[i]);
      }
       System.out.println("inputkan");
       System.out.print(" NIK :");
       NIK= input.nextLine();
       System.out.print(" Nama :");
       nama = input.nextLine();
       System.out.print(" Tempat Tanggal Lahir :");
       TTL = input.nextLine();
       System.out.print(" Jenis Kelamin :");
       jenis_kelamin = input.nextLine();
       System.out.print(" Status :");
       status = input.nextLine();
        System.out.print(" Agama :");
       agama = input.nextLine();
        System.out.print(" Kewarganegaraan :");
       kewarganegaraan = input.nextLine();
        System.out.print(" Golongan Darah :");
       gol_darah = input.nextLine();
       System.out.println(" Lanjutkan(01)/batal(02) ");
       a = input.nextInt();
      
        switch (a) {
            case 01:
                System.out.println("<<<<<<<< Cetak KTP >>>>>>>");
                System.out.print(" NIK :"+NIK);
                System.out.print("\n");
                System.out.print(" Nama :"+nama);
                System.out.print("\n");
                System.out.print(" TTL :"+TTL);
                System.out.print("\n");
                System.out.print(" Jenis Kelamin :"+jenis_kelamin);
                System.out.print("\n");
                System.out.print(" Agama :"+agama);
                System.out.print("\n");
                System.out.print(" Kewarganegaraan :"+kewarganegaraan);
                System.out.print("\n");
                System.out.print(" Status :"+status);
                System.out.print("\n");
                System.out.print(" Golongan darah :"+gol_darah);
                System.out.print("\n");
                break;
            case 02:
                System.out.println(" Silakan input kembali ");
                break;
            default:
                System.out.println("erorr");
                break;
        }
    }
    
}
