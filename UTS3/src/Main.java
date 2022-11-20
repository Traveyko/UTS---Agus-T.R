import java.util.ArrayList;
class UTS3{
    private Integer id;
    private String name;
    private String kelas;
    private Integer tglMasuk;

    public UTS3(Integer id, String name, String kelas, Integer tglMasuk) {
        this.id= id;
        this.name= name;
        this.kelas= kelas;
        this.tglMasuk= tglMasuk;


    }
public String getName(){
        return  name;
}
public void setName(String newName){
        this.name= newName;

}
public String getKelas() {
        return kelas;
}
public void setKelas(String newKls) {
        this.kelas = newKls;
}
public int getId() {
        return id;
}
public void setId(int newId) {
        this.id = newId;
}
@Override
    public String toString(){
        return "Mahasiswa{" +
                "id='"+ id + '\'' +
            ", name='" + name + '\'' +
        ", kelas='" + kelas + '\'' +
        ", tanggal masuk='" + tglMasuk + '\'' + '}';


}
    }
    public class Main {
    public static void main(String[] args){
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(new Mahasiswa(1, "Agus Tiansyah Ramadhan", "Informatika", 11313));
        mahasiswas.add(new Mahasiswa(23, "Riza b Muhammad", "Informatika", 11313));
        mahasiswas.add(new Mahasiswa(32, "Amamrul", "Informatika", 11313));
        mahasiswas.add(new Mahasiswa(17, "Rama Rizki", "Informatika", 11313));
        mahasiswas.add(new Mahasiswa(15, "Ikhma Amrullah", "Informatika", 11313));
        System.out.println("-----------{ Print All }-------------");
        mahasiswas.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("\n-----------{ Remove }-------------");
        mahasiswas.remove(1);
        mahasiswas.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("\n-----------{ Add }-------------");
        mahasiswas.add(1, new Mahasiswa(29, "Yura yunita", "Informatika", 11313));
        mahasiswas.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("-----------{ All }-------------");
        System.out.println("Total Mahasiswa : " + mahasiswas.size());








    }


    }
