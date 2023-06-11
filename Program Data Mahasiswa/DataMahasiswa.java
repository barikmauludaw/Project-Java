import java.util.ArrayList;
public class DataMahasiswa {
  private static ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
   
 
  public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mahasiswa){
    listMahasiswa.add(mahasiswa);
    return listMahasiswa;
  }
 
  public static void tampilSemuaData(){
     // Gunakan perulangan
     // .....
    int i = 1;
    for(Mahasiswa mahasiswa:listMahasiswa){
      System.out.println("===Tampil Data Mahasiswa "+i+" Filkom UB===");
      tampilMahasiswa(mahasiswa);
      System.out.println();
      i++;
     }
  }
 
  public static Mahasiswa cariMahasiswa(String namaMahasiswa){
     // Gunakan perulangan
     // .....
    for(Mahasiswa mahasiswa:listMahasiswa){
      if(mahasiswa.getNama().equalsIgnoreCase(namaMahasiswa)){
        System.out.println("Data mahasiswa atas nama " +  mahasiswa.getNama() + " ditemukan");
        System.out.println();
        return mahasiswa;
      }
    }
    System.out.println("Data mahasiswa atas nama " + namaMahasiswa + " tidak ditemukan");
    System.out.println();
    return null;
  }
 
  public static Mahasiswa tampilMahasiswa(Mahasiswa mahasiswa){
     // .....
    for(Mahasiswa mhs:listMahasiswa){
      if(mhs.equals(mahasiswa)){
        System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
        System.out.println("Jurusan         : " + mahasiswa.getJurusan());
        if(mahasiswa.geStatus()==true)
          System.out.println("Status          : Menikah" );
        else System.out.println("Status          : Lajang");
        System.out.println();
        return mahasiswa;
      }
    }
    System.out.println("Data mahasiswa atas nama " + mahasiswa.getNama() +  " tidak ditemukan");
    System.out.println();
    return null;
  }

  public static void updateMahasiswa(Mahasiswa mahasiswaLama, Mahasiswa mahasiswaBaru){
     // .....
    int i = 0;
    for(Mahasiswa mahasiswa:listMahasiswa){
      if(mahasiswa.equals(mahasiswaLama)){
        listMahasiswa.set(i, mahasiswaBaru);
        System.out.println("Data mahasiswa atas nama "+mahasiswaLama.getNama()+" berhasil diupdate dengan nama " + mahasiswaBaru.getNama());
        System.out.println();
        return;
      }
      i++;
    }
    System.out.println("Data mahasiswa atas nama "+mahasiswaLama.getNama()+" tidak ditemukan");
    System.out.println();
  }
}
